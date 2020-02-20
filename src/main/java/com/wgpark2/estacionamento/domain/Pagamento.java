package com.wgpark2.estacionamento.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.wgpark2.estacionamento.domain.enums.EstadoPagamento;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_PAGAMENTO")
@Data
@Inheritance(strategy=InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private EstadoPagamento estado;

    private Double valor;

    public Pagamento() {
    }

    public Pagamento(Integer id, EstadoPagamento estado, Double valor) {
        this.id = id;
        this.estado = estado;
        this.valor = valor;
    }
}
