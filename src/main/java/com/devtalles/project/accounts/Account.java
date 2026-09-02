package com.devtalles.project.accounts;

import com.devtalles.project.clients.Client;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

abstract public class Account {
    private final UUID id;
    private Client owner;
    private BigDecimal balance;
    private LocalDate accountOpeningDate;
    private CurrentState currentState;
    private List<String> movements;

    public Account(Client owner,
                   BigDecimal balance,
                   LocalDate accountOpeningDate,
                   CurrentState currentState,
                   List<String> movements) {
        this.id = UUID.randomUUID();
        this.owner = owner;
        this.balance = balance;
        this.accountOpeningDate = accountOpeningDate;
        this.currentState = currentState;
        this.movements = movements;
    }

    public void deposit(BigDecimal amount,
                        BigDecimal balance,
                        CurrentState currentState) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0 && currentState != CurrentState.ABLE) {
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
        if (balance.equals(BigDecimal.ZERO)) {
            currentState = CurrentState.CLOSED;
            System.out.println("La cuenta ha sido cerrada");
        } else {
            throw new IllegalStateException("La cuenta debe tener saldo 0 para ser cerrada");
        }
    }

    public void transfer(CurrentState currentState,
                         BigDecimal amount,
                         Account detinationAccount,
                         UUID id,
                         BigDecimal balance) {
        if (detinationAccount.getId() == id) {
            throw new IllegalStateException("No se puede hacer una transferencia a una misma cuenta");
        }
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalStateException("La cantidad debe ser mayor a 0");
        }
        if (detinationAccount.getCurrentState() != CurrentState.ABLE) {
            throw new IllegalStateException("La cuenta de destino no esta disponible");
        }
        if (balance.compareTo(amount) < 0) {
            throw new IllegalStateException("No posees de suficiente dinero como para realizar esta transferencia");
        }
        this.balance = this.balance.subtract(amount);
        detinationAccount.balance = detinationAccount.balance.add(amount);
        System.out.println("Ahora tu balance es de " + balance);
    }

    public UUID getId() {
        return id;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDate getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(LocalDate accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public CurrentState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CurrentState currentState) {
        this.currentState = currentState;
    }

    public List<String> getMovements() {
        return movements;
    }

    public void setMovements(List<String> movements) {
        this.movements = movements;
    }
}
