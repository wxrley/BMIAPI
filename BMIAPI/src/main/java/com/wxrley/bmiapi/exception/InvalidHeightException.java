package com.wxrley.bmiapi.exception;

/**
 * Exceção lançada quando a altura está fora dos limites aceitáveis.
 * Usada por BmiValidator quando altura < 0.5m ou > 2.5m.
 */
public class InvalidHeightException extends RuntimeException {
    public InvalidHeightException(String message) {
        super(message);
    }
}