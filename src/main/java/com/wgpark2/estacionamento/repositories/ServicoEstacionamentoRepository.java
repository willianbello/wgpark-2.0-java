package com.wgpark2.estacionamento.repositories;

import com.wgpark2.estacionamento.domain.ServicoEstacionamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoEstacionamentoRepository extends JpaRepository<ServicoEstacionamento, Integer> {
}
