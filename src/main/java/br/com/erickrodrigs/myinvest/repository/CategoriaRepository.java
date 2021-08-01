package br.com.erickrodrigs.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erickrodrigs.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
