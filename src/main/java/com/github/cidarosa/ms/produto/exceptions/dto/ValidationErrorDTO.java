package com.github.cidarosa.ms.produto.exceptions.dto;

import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationErrorDTO extends CustomErrorDTO{

    private List <FieldMessageDTO> erros = new ArrayList<>();

    public ValidationErrorDTO (Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    //método para adicionar erros  à List
    public void addError (String fieldName, String message) {
        //remove error de campo duplicado
        erros.removeIf(x -> x .getFieldName().equals(fieldName));
        erros.add(new FieldMessageDTO(fieldName, message));
    }

}
