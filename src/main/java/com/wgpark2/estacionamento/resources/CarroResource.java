package com.wgpark2.estacionamento.resources;

import com.wgpark2.estacionamento.domain.Carro;
import com.wgpark2.estacionamento.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {

    @Autowired
    CarroService carroService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Carro> find(@PathVariable Integer id) {

        Carro carro = carroService.buscar(id);
        return ResponseEntity.ok().body(carro);
    }
}
