package com.zanatta.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zanatta.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	

}
