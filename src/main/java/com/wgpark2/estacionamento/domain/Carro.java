package com.wgpark2.estacionamento.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_CARRO")
@Data
public class Carro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String placa;

    public Carro() {
    }

    public Carro(Integer id, String placa) {
        this.id = id;
        this.placa = placa;
    }
}
