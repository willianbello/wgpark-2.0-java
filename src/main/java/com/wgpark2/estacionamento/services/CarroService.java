package com.wgpark2.estacionamento.services;

import com.wgpark2.estacionamento.domain.Carro;
import com.wgpark2.estacionamento.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    CarroRepository carroRepository;

    public Carro buscar(Integer id) {
        Optional<Carro> carro = carroRepository.findById(id);
        return carro.orElse(null);
    }
}
