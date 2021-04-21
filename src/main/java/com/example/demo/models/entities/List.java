package com.example.demo.models.entities;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="TB_LIST")
public class List implements Serializable {


    @Id
    private String id;


    private String responsavel;

    private String titulo;
    private String descricao;
    private int viabilidade;
    private String status;
    private String dataInicio;
    private double valorDeExecucao;
    private String dataFinal;
    private String iniciado;
    private String finalizado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getViabilidade() {
        return viabilidade;
    }

    public void setViabilidade(int viabilidade) {
        this.viabilidade = viabilidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getIniciado() {
        return iniciado;
    }

    public void setIniciado(String iniciado) {
        this.iniciado = iniciado;
    }

    public String getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(String finalizado) {
        this.finalizado = finalizado;
    }

    public double getValorDeExecucao() {
        return valorDeExecucao;
    }

    public void setValorDeExecucao(double valorDeExecucao) {
        this.valorDeExecucao = valorDeExecucao;
    }
}
