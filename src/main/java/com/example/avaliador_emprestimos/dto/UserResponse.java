package com.example.avaliador_emprestimos.dto;

import java.util.List;

public record UserResponse(
        String customer,
        List<LoanResponse> loans
) {
}
