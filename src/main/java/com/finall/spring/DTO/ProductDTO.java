package com.finall.spring.DTO;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//records 
public record ProductDTO(@NotBlank  String name,@NotNull BigDecimal value) {
    
}
