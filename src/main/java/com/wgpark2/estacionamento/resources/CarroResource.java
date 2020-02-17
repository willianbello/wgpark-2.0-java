package com.wgpark2.estacionamento.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {

    @RequestMapping(method = RequestMethod.GET)
    public String lista() {
        return "REST está funcionando";
    }
}
