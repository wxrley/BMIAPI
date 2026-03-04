package com.wxrley.bmiapi.model;

/**
 * DTO de transferência entre Controller e Cliente.
 * Padroniza estrutura de respostas da API.
 */
public class BmiDTO {

    private double bmi;
    private String classification;

    public BmiDTO(double bmi, String classification) {
        this.bmi = bmi;
        this.classification = classification;
    }

    public double getBmi() {
        return bmi;
    }

    public String getClassification() {
        return classification;
    }
}