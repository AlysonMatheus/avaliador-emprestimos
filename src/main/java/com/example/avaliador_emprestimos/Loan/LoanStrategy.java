package com.example.avaliador_emprestimos.Loan;

import com.example.avaliador_emprestimos.dto.LoanResponse;
import com.example.avaliador_emprestimos.dto.UserRequest;


public interface LoanStrategy {

        boolean isEligible(UserRequest user);
        LoanResponse toResponse();
    }


