package com.tads.ecommerce.resource.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class StanderError {
    private Instant timestampo;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
