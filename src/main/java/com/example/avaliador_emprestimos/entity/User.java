package com.example.avaliador_emprestimos.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String name;
    private String cpf;
    private Integer age;
    private Double income;
    private String location;

}
