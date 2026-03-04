package com.wxrley.bmiapi.exception;

/**
 * Exceção lançada quando o peso está fora dos limites aceitáveis.
 * Usada por BmiValidator quando peso < 2kg ou > 400kg.
 */
public class InvalidWeightException extends RuntimeException {
    public InvalidWeightException(String message) {
        super(message);
    }
}