package com.devtalles.project.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class SavingsAccount extends Account {
    public SavingsAccount(String client,
                          int balance,
                          String accountCurrency,
                          LocalDate accountOpeningDate,
                          CurrentState currentState,
                          List<String> movements) {
        super(client, balance, accountCurrency, accountOpeningDate, currentState, movements);
    }

    @Override
    public void deposit(BigDecimal amount,
                        BigDecimal balance,
                        CurrentState currentState) {
        super.deposit(amount, balance, currentState);
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

    @Override
    public void withdraw(BigDecimal amount,
                         BigDecimal balance,
                         CurrentState currentState) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0 || currentState == CurrentState.NOTABLE) {
            throw new IllegalArgumentException("Error: Esta operación no puede ser realizada");
        } else {
            balance = balance.subtract(amount);
            System.out.println("Se retiro: " + amount);
        }
    }
}
