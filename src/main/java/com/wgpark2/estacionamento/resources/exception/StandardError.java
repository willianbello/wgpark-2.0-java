package com.wgpark2.estacionamento.resources.exception;

import lombok.Data;

@Data
public class StandardError {

    private Integer status;
    private String message;
    private Long timeStamp;

    public StandardError(Integer status, String message, Long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
