package com.example.demo.controllers;



import com.example.demo.models.entities.List;
import com.example.demo.models.repository.ListRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@Api(value= "API REST Produtos")
@CrossOrigin(origins="*")
@RequestMapping(path = "/api")
public class ListControllers {


    @Autowired
    private ListRepository listRepository;


    @GetMapping(path = "/list")
    @ApiOperation("Retorna uma lida de projetos")
    public Iterable<List> shareList() {
        return listRepository.findAll();
    }

    //    create new list
    @PostMapping(path = "/list")
    @ApiOperation("Cria um projeto")
    List newList(@RequestBody  List list){
        listRepository.save(list);
        return list;
    }



    @GetMapping(path = "/list/{id}")
    @ApiOperation("Busca um projeto por ID")
    public Optional<List> shareListId(@PathVariable String id) {
        return listRepository.findById(id);
    }


    @PutMapping(path = "list/{id}")
    @ApiOperation("Atualiza um projeto")
    public ResponseEntity<List> editList(@PathVariable String id, @RequestBody List listAtualizado) {
        return listRepository.findById(id).map(list ->{

            list.setIniciado((listAtualizado.getIniciado()));
            list.setFinalizado((listAtualizado.getFinalizado()));
            list.setStatus((listAtualizado.getStatus()));
            list.setDescricao(listAtualizado.getDescricao());
            list.setViabilidade(listAtualizado.getViabilidade());


            List newList = listRepository.save(list);
            return ResponseEntity.ok().body(newList);
        }).orElse(ResponseEntity.notFound().build());

    }

    @DeleteMapping(path = "list/{id}")
    @ApiOperation("Deleta um projeto")
    public void deletList(@PathVariable String id){
        listRepository.deleteById(id);

    }

}