package com.example.avaliador_emprestimos.services;

import com.example.avaliador_emprestimos.Loan.LoanStrategy;
import com.example.avaliador_emprestimos.dto.LoanResponse;
import com.example.avaliador_emprestimos.dto.UserRequest;
import com.example.avaliador_emprestimos.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LoanService {
    private final List<LoanStrategy> strategies;

    public LoanService(List<LoanStrategy> strategies) {
        this.strategies = strategies;
    }

    public UserResponse evaluate(UserRequest user) {
        List<LoanResponse> elibleLoans = strategies.stream()
                .filter(s -> s.isEligible(user)).map(LoanStrategy::toResponse).toList();
        return new UserResponse(user.name(), elibleLoans);
    }


}
