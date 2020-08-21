package com.cpregression.viewobject;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -5759442484832529100L;

    private Integer code;
    private String msg;
    private T data;

}