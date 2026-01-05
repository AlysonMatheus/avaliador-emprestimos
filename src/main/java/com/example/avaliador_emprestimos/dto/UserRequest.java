package com.example.avaliador_emprestimos.dto;


public record UserRequest(
        String name,
        String cpf,
        Integer age,
        Double income,
        String location
) {
}