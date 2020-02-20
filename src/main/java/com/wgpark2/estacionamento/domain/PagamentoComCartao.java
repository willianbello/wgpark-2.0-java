package com.wgpark2.estacionamento.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.wgpark2.estacionamento.domain.enums.EstadoPagamento;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@JsonTypeName("pagamentoComCartao")
@Entity
public class PagamentoComCartao extends Pagamento{

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Double valor, Date dataPagamento) {
        super(id, estado, valor);
        this.dataPagamento = dataPagamento;
    }
}
