package com.devtalles.project.account;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

abstract public class Account {
    private final UUID id;
    private String client;
    private int balance;
    private String accountCurrency;
    private LocalDate accountOpeningDate;
    private CurrentState currentState;
    private List<String> movements;

    public Account(String client,
                   int balance,
                   String accountCurrency,
                   LocalDate accountOpeningDate,
                   CurrentState currentState,
                   List<String> movements) {
        this.id = UUID.randomUUID();
        this.client = client;
        this.balance = balance;
        this.accountCurrency = accountCurrency;
        this.accountOpeningDate = accountOpeningDate;
        this.currentState = currentState;
        this.movements = movements;
    }

    //En las dos cuentas iguales
    public void deposit(BigDecimal amount,
                        BigDecimal balance,
                        CurrentState currentState) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0 && currentState == CurrentState.NOTABLE || currentState == CurrentState.CLOSED) {
            throw new IllegalArgumentException("Error: Esta operación no puede ser realizada");
        } else {
            balance = balance.add(amount);
        }
    }

    public void withdraw(BigDecimal amount,
                         BigDecimal balance,
                         CurrentState currentState) {
        return;
    }


    public void showBalance(BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO) >= 0) System.out.println("El dinero disponible es de " + balance);
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("El dinero debido es de " + balance);
        } else {
            System.out.println("El saldo no esta disponible");
        }
    }

    public void blockAccount(CurrentState currentState) {
        currentState = CurrentState.NOTABLE;
        System.out.println("La cuenta ha sido bloqueada");
    }

    public void activateAccount(CurrentState currentState) {
        currentState = CurrentState.ABLE;
        System.out.println("La cuenta ha sido activada");
    }

    public void closeAccount(CurrentState currentState) {
        if (balance == 0) {
            currentState = CurrentState.CLOSED;
            System.out.println("La cuenta ha sido cerrada");
        } else {
            System.out.println("La cuenta debe tener saldo 0 para ser cerrada");
        }
    }
}
