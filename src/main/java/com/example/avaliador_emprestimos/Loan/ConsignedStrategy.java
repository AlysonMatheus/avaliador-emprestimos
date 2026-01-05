package com.example.avaliador_emprestimos.Loan;

import com.example.avaliador_emprestimos.dto.LoanResponse;
import com.example.avaliador_emprestimos.dto.UserRequest;

import org.springframework.stereotype.Component;


@Component
public class ConsignedStrategy implements LoanStrategy {


    @Override
    public boolean isEligible(UserRequest user) {

        return user.income() >= 5000;
    }

    @Override
    public LoanResponse toResponse() {
        return new LoanResponse("CONSIGNED", 2);
    }
}
