package com.example.avaliador_emprestimos.controller;

import com.example.avaliador_emprestimos.dto.UserRequest;
import com.example.avaliador_emprestimos.dto.UserResponse;
import com.example.avaliador_emprestimos.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    LoanService emprestimoService;

    @PostMapping()
    public ResponseEntity<UserResponse> evaluateLoans(@RequestBody UserRequest request) {
        return ResponseEntity.ok(emprestimoService.evaluate(request));
    }
}
