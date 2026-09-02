package com.devtalles.project.accounts;

import com.devtalles.project.clients.Client;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class CurrentAccount extends Account {

    public CurrentAccount(Client client,
                          BigDecimal balance,
                          String accountCurrency,
                          LocalDate accountOpeningDate,
                          CurrentState currentState,
                          List<String> movements) {
        super(client, balance, accountOpeningDate, currentState, movements);
    }

    @Override
    public void deposit(BigDecimal amount,
                        BigDecimal balance,
                        CurrentState currentState) {
        super.deposit(amount, balance, currentState);
    }

    @Override

    public void withdraw(BigDecimal amount,
                         BigDecimal balance,
                         CurrentState currentState) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0 || currentState == CurrentState.NOTABLE || balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Error: Esta operación no puede ser realizada");
        } else {
            balance = balance.subtract(amount);
            System.out.println("La operación se realizó correctamente");
        }
    }

    @Override
    public void showBalance(BigDecimal balance) {
        super.showBalance(balance);
    }

    @Override
    public void blockAccount(CurrentState currentState) {
        super.blockAccount(currentState);
    }

    @Override
    public void activateAccount(CurrentState currentState) {
        super.activateAccount(currentState);
    }

    @Override
    public void closeAccount(CurrentState currentState) {
        super.closeAccount(currentState);
    }
}

