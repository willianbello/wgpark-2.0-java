package com.wgpark2.estacionamento.resources;

import com.wgpark2.estacionamento.domain.Carro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Carro> lista() {

        Carro carro1 = new Carro(1, "ABC1920");
        Carro carro2 = new Carro(2, "BCD2122");

        List<Carro> carros = new ArrayList<>();
        carros.addAll(Arrays.asList(carro1, carro2));
        return carros;
    }
}
