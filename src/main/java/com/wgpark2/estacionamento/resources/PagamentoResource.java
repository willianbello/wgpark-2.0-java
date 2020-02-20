package com.wgpark2.estacionamento.resources;

import com.wgpark2.estacionamento.domain.Pagamento;
import com.wgpark2.estacionamento.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResource {

    @Autowired
    PagamentoService pagamentoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pagamento> find(@PathVariable Integer id) {

        Pagamento pagamento = pagamentoService.buscar(id);
        return ResponseEntity.ok().body(pagamento);
    }
}
