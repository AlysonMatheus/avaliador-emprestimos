package com.example.avaliador_emprestimos.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter

@AllArgsConstructor

public class Loan {
    private String type;
    private int interest_rate;
}
