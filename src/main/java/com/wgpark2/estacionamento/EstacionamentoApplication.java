package com.wgpark2.estacionamento;

import com.wgpark2.estacionamento.domain.Carro;
import com.wgpark2.estacionamento.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class EstacionamentoApplication implements CommandLineRunner {

    @Autowired
    CarroRepository carroRepository;

    public static void main(String[] args) {
        SpringApplication.run(EstacionamentoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Carro carro1 = new Carro(null, "ABC1234");
        Carro carro2 = new Carro(null, "CDE3456");

        carroRepository.saveAll(Arrays.asList(carro1, carro2));
    }
}
