package com.wgpark2.estacionamento;

import com.wgpark2.estacionamento.domain.*;
import com.wgpark2.estacionamento.domain.enums.EstadoPagamento;
import com.wgpark2.estacionamento.repositories.CarroRepository;
import com.wgpark2.estacionamento.repositories.PagamentoRepository;
import com.wgpark2.estacionamento.repositories.ServicoEstacionamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class EstacionamentoApplication implements CommandLineRunner {

    @Autowired
    CarroRepository carroRepository;

    @Autowired
    PagamentoRepository pagamentoRepository;

    @Autowired
    ServicoEstacionamentoRepository servicoEstacionamentoRepository;

    public static void main(String[] args) {
        SpringApplication.run(EstacionamentoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Carro carro1 = new Carro(null, "ABC1234");
        Carro carro2 = new Carro(null, "CDE3456");

        carroRepository.saveAll(Arrays.asList(carro1, carro2));

        Pagamento pagamento1 = new PagamentoComCartao(null, EstadoPagamento.PENDENTE, 0.0, new Date());
        Pagamento pagamento2 = new PagamentoComDinheiro(null, EstadoPagamento.PENDENTE, 0.0, new Date());

        pagamentoRepository.saveAll(Arrays.asList(pagamento1, pagamento2));

        ServicoEstacionamento servicoEstacionamento1 = new ServicoEstacionamento(null, new Date(), null, carro1, pagamento1);
        ServicoEstacionamento servicoEstacionamento2 = new ServicoEstacionamento(null, new Date(), null, carro2, pagamento2);

        servicoEstacionamentoRepository.saveAll(Arrays.asList(servicoEstacionamento1, servicoEstacionamento2));

    }
}
