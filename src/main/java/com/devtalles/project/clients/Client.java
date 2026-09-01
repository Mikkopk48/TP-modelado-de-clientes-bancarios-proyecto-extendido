package com.devtalles.project.clients;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public abstract class Client {
    private final UUID id;
    private String address;
    private String phoneNumber;
    private String email;
    private LocalDate bankRegistrationDate;
    private BigDecimal declaredIncome;

    public Client(
            String address,
            String phoneNumber,
            String email,
            LocalDate bankRegistrationDate,
            BigDecimal declaredIncome) {
        this.id = UUID.randomUUID();
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.bankRegistrationDate = bankRegistrationDate;
        this.declaredIncome = declaredIncome;
    }

    public void showClient() {
        System.out.println(
                "id: " + id + "\n" +
                        "Dirección: " + address + "\n" +
                        "Número: " + phoneNumber + "\n" +
                        "Mail: " + email + "\n" +
                        "Dia de Registro: " + bankRegistrationDate + "\n" +
                        "Ganancias Declaradas: " + declaredIncome
                        + "\n"
        );
    }

    public UUID getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBankRegistrationDate() {
        return bankRegistrationDate;
    }

    public void setBankRegistrationDate(LocalDate bankRegistrationDate) {
        this.bankRegistrationDate = bankRegistrationDate;
    }

    public BigDecimal getDeclaredIncome() {
        return declaredIncome;
    }

    public void setDeclaredIncome(BigDecimal declaredIncome) {
        this.declaredIncome = declaredIncome;
    }


}
