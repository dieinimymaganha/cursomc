package com.dieinmymaganha.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dieinmymaganha.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRespository extends JpaRepository<Pagamento, Integer> {

}
