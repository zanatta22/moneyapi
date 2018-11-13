package com.zanatta.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zanatta.api.model.Lancamento;
import com.zanatta.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
