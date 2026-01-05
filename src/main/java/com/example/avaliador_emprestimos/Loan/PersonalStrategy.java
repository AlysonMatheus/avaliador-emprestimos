package com.example.avaliador_emprestimos.Loan;

import com.example.avaliador_emprestimos.dto.LoanResponse;
import com.example.avaliador_emprestimos.dto.UserRequest;
import org.springframework.stereotype.Component;

@Component
public class PersonalStrategy implements LoanStrategy {


    @Override
    public boolean isEligible(UserRequest user) {
        if (user.income() == 3000) return true;
        return user.income() <= 5000
                && user.age() <= 30 && "SP".equalsIgnoreCase(user.location());

    }

    @Override
    public LoanResponse toResponse() {

        return new LoanResponse("PERSONAL", 4);
    }
}
