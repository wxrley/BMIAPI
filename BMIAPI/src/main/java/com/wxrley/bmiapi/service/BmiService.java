package com.wxrley.bmiapi.service;

import com.wxrley.bmiapi.model.BmiDTO;
import com.wxrley.bmiapi.validator.BmiValidator;
import org.springframework.stereotype.Service;

/**
 * Contém a lógica de negócio da aplicação.
 * Chamados pelo Controller para processar operações.
 */
@Service
public class BmiService {

    /**
     * Calcula IMC completo com valor e classificação.
     * Valida peso e altura através do BmiValidator.
     * Retorna BmiDTO com IMC calculado e classificação correspondente.
     */
    public BmiDTO calculateBmi(double weight, double height) {
        BmiValidator.validate(weight, height);

        double bmi = weight / (height * height);
        String classification = getClassification(bmi);

        return new BmiDTO(bmi, classification);
    }

    private String getClassification(double bmi) {
        if (bmi < 18.5) {
            return "Abaixo do peso";
        } else if (bmi < 25) {
            return "Peso normal";
        } else if (bmi < 30) {
            return "Sobrepeso";
        } else if (bmi < 35) {
            return "Obesidade grau I";
        } else if (bmi < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}