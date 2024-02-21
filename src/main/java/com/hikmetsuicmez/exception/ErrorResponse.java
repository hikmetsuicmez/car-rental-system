package com.hikmetsuicmez.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
public class ErrorResponse {

    private HttpStatus status;
    private String message;
    private Date timestamp;
}
