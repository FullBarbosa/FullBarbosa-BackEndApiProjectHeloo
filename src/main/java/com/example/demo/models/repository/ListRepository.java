package com.example.demo.models.repository;

import com.example.demo.models.entities.List;
import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<List, String> {
}