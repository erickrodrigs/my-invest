package br.com.erickrodrigs.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erickrodrigs.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {}
