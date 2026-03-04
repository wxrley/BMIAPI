package com.wxrley.bmiapi.controller;

import com.wxrley.bmiapi.model.BmiDTO;
import com.wxrley.bmiapi.service.BmiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Recebe requisições HTTP da API.
 * Delega processamento ao Service e retorna respostas.
 * Swagger UI: http://localhost:8080/swagger-ui/index.html
 */
@Tag(name = "BMI Operations", description = "Endpoints para cálculo de IMC")
@RestController
@RequestMapping("/bmi")
public class BmiController {

    private final BmiService bmiService;

    public BmiController(BmiService bmiService) {
        this.bmiService = bmiService;
    }

    /**
     * Endpoint REST para cálculo de IMC completo.
     * Recebe peso e altura via query parameters, delega cálculo para BmiService.calculateBmi().
     * Retorna ResponseEntity com BmiDTO contendo valor do IMC e classificação.
     */
    @Operation(summary = "Calcula IMC completo",
            description = "Recebe peso (kg) e altura (m) e retorna valor do IMC e classificação.")
    @GetMapping("/calculate")
    public ResponseEntity<BmiDTO> calculate(@RequestParam double weight, @RequestParam double height) {
        BmiDTO result = bmiService.calculateBmi(weight, height);
        return ResponseEntity.ok(result);
    }
}