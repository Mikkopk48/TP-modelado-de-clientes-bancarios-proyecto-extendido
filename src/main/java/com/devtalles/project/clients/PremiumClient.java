package com.devtalles.project.clients;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PremiumClient extends Client {
    private Integer dni;
    private LocalDate birthDate;
    private String profession;
    private BigDecimal specialCreditLimit;
    private String asignedEjective;
    private String specialBenefits;
    private String firstName;
    private String lastName;

    public PremiumClient(String address,
                         String phoneNumber,
                         String email,
                         LocalDate bankRegistrationDate,
                         BigDecimal declaredIncome,
                         Integer dni,
                         LocalDate birthDate,
                         String profession,
                         BigDecimal specialCreditLimit,
                         String asignedEjective,
                         String specialBenefits,
                         String firstName,
                         String lastName) {
        super(address, phoneNumber, email, bankRegistrationDate, declaredIncome);
        this.dni = dni;
        this.birthDate = birthDate;
        this.profession = profession;
        this.specialCreditLimit = specialCreditLimit;
        this.asignedEjective = asignedEjective;
        this.specialBenefits = specialBenefits;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void showClient() {
        System.out.println(
                        "Nombre: " + firstName + "\n" +
                        "Apellido: " + lastName + "\n" +
                        "Límite de Crédito Especial: " + specialCreditLimit + "\n" +
                        "Ejecutivo Asignado: " + asignedEjective + "\n" +
                        "Beneficios Especiales: " + specialBenefits
        );
        super.showClient();
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public BigDecimal getSpecialCreditLimit() {
        return specialCreditLimit;
    }

    public void setSpecialCreditLimit(BigDecimal specialCreditLimit) {
        this.specialCreditLimit = specialCreditLimit;
    }

    public String getAsignedEjective() {
        return asignedEjective;
    }

    public void setAsignedEjective(String asignedEjective) {
        this.asignedEjective = asignedEjective;
    }

    public String getSpecialBenefits() {
        return specialBenefits;
    }

    public void setSpecialBenefits(String specialBenefits) {
        this.specialBenefits = specialBenefits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

