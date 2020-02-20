package com.wgpark2.estacionamento.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_SERVICO_ESTACIONAMENTO")
@Data
public class ServicoEstacionamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date chegada;
    private Date saida;

    @ManyToOne
    @JoinColumn(name="carro_id")
    private Carro carro;

    @ManyToOne
    @JoinColumn(name="pagamento_id")
    private Pagamento pagamento;

    public ServicoEstacionamento() {
    }

    public ServicoEstacionamento(Integer id, Date chegada, Date saida, Carro carro, Pagamento pagamento) {
        this.id = id;
        this.chegada = chegada;
        this.saida = saida;
        this.carro = carro;
        this.pagamento = pagamento;
    }
}
