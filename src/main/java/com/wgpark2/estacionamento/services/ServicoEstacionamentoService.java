package com.wgpark2.estacionamento.services;

import com.wgpark2.estacionamento.domain.Carro;
import com.wgpark2.estacionamento.domain.ServicoEstacionamento;
import com.wgpark2.estacionamento.repositories.CarroRepository;
import com.wgpark2.estacionamento.repositories.ServicoEstacionamentoRepository;
import com.wgpark2.estacionamento.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Optional;

@Service
public class ServicoEstacionamentoService {

    @Autowired
    ServicoEstacionamentoRepository servicoEstacionamentoRepository;

    @Autowired
    CarroService carroService;

    public ServicoEstacionamento buscar(Integer id) {
        Optional<ServicoEstacionamento> servicoEstacionamento = servicoEstacionamentoRepository.findById(id);
        return servicoEstacionamento.orElseThrow(()-> new ObjectNotFoundException(
                String.format("Objeto não encontrado! Id: %d, Tipo: %s", id, Carro.class.getName())
        ));
    }

    public ServicoEstacionamento insert(ServicoEstacionamento servicoEstacionamento) {
        servicoEstacionamento.setId(null);
        servicoEstacionamento.setChegada(new Date());
        servicoEstacionamento.setCarro(carroService.buscar(servicoEstacionamento.getCarro().getId()));
        servicoEstacionamento = servicoEstacionamentoRepository.save(servicoEstacionamento);
        return servicoEstacionamento;
    }
}
