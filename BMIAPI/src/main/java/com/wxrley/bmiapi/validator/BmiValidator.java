package com.wxrley.bmiapi.validator;

import com.wxrley.bmiapi.exception.DivisionByZeroLikeException;
import com.wxrley.bmiapi.exception.InvalidHeightException;
import com.wxrley.bmiapi.exception.InvalidWeightException;

/**
 * Valida dados de peso e altura antes do processamento.
 * Verifica limites aceitáveis e previne divisão por zero.
 */
public class BmiValidator {

    /**
     * Valida peso e altura conforme regras de negócio.
     * Lança exceções específicas para cada tipo de erro.
     */
    public static void validate(double weight, double height) {
        if (height == 0) {
            throw new DivisionByZeroLikeException("Altura não pode ser zero.");
        }

        if (height < 0.5 || height > 2.5) {
            throw new InvalidHeightException("Altura deve estar entre 0.5m e 2.5m.");
        }

        if (weight < 2 || weight > 400) {
            throw new InvalidWeightException("Peso deve estar entre 2kg e 400kg.");
        }
    }
}