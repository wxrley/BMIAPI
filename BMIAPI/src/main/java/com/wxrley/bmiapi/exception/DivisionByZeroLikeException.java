package com.wxrley.bmiapi.exception;

/**
 * Exceção lançada quando altura é zero.
 * Usada por BmiValidator para prevenir divisão por zero no cálculo do IMC.
 */
public class DivisionByZeroLikeException extends RuntimeException {
    public DivisionByZeroLikeException(String message) {
        super(message);
    }
}