package com.wgpark2.estacionamento.services;

import com.wgpark2.estacionamento.domain.Pagamento;
import com.wgpark2.estacionamento.repositories.PagamentoRepository;
import com.wgpark2.estacionamento.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    PagamentoRepository pagamentoRepository;

    public Pagamento buscar(Integer id) {
        Optional<Pagamento> pagamento = pagamentoRepository.findById(id);
        return pagamento.orElseThrow(()-> new ObjectNotFoundException(
                String.format("Objeto não encontrado! Id: %d, Tipo: %s", id, Pagamento.class.getName())
        ));
    }
}
