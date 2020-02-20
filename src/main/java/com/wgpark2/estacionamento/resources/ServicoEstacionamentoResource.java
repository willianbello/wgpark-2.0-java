package com.wgpark2.estacionamento.resources;

import com.wgpark2.estacionamento.domain.ServicoEstacionamento;
import com.wgpark2.estacionamento.services.ServicoEstacionamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/servicos-estacionamento")
public class ServicoEstacionamentoResource {

    @Autowired
    ServicoEstacionamentoService servicoEstacionamentoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ServicoEstacionamento> find(@PathVariable Integer id) {

        ServicoEstacionamento servicoEstacionamento = servicoEstacionamentoService.buscar(id);
        return ResponseEntity.ok().body(servicoEstacionamento);
    }
}
