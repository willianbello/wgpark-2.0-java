package com.wgpark2.estacionamento.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.wgpark2.estacionamento.domain.enums.EstadoPagamento;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@JsonTypeName("pagamentoComDinheiro")
@Entity
public class PagamentoComDinheiro extends Pagamento {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;

    public PagamentoComDinheiro() {
    }

    public PagamentoComDinheiro(Integer id, EstadoPagamento estado, Double valor, Date dataPagamento) {
        super(id, estado, valor);
        this.dataPagamento = dataPagamento;
    }
}
