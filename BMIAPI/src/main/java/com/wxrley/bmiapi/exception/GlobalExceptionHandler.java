package com.wxrley.bmiapi.exception;

import com.wxrley.bmiapi.model.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Captura e trata exceções globalmente na aplicação.
 * Retorna ErrorDTO padronizado para as 3 exceções customizadas.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidWeightException.class)
    public ResponseEntity<ErrorDTO> handleInvalidWeight(InvalidWeightException ex) {
        ErrorDTO error = new ErrorDTO(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(InvalidHeightException.class)
    public ResponseEntity<ErrorDTO> handleInvalidHeight(InvalidHeightException ex) {
        ErrorDTO error = new ErrorDTO(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(DivisionByZeroLikeException.class)
    public ResponseEntity<ErrorDTO> handleDivisionByZero(DivisionByZeroLikeException ex) {
        ErrorDTO error = new ErrorDTO(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().body(error);
    }
}