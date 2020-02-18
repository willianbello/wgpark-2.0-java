package com.wgpark2.estacionamento.repositories;

import com.wgpark2.estacionamento.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {
}
