package com.devtalles.project.clients;

import java.math.BigDecimal;
import java.time.LocalDate;

public class IndividualClient extends Client {
    private Integer DNI;
    private LocalDate birthDate;
    private String profession;
    private String firstName;
    private String lastName;

    public IndividualClient(String address,
                            String phoneNumber,
                            String email,
                            LocalDate bankRegistrationDate,
                            BigDecimal declaredIncome,
                            Integer DNI,
                            LocalDate birthDate,
                            String profession,
                            String firstName,
                            String lastName) {
        super(address, phoneNumber, email, bankRegistrationDate, declaredIncome);
        this.DNI = DNI;
        this.birthDate = birthDate;
        this.profession = profession;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void showClient() {
        System.out.println(
                "La información del Cliente Individual es la siguiente: " + "\n" +
                        "Nombre: " + firstName + "\n" +
                        "Apellido: " + lastName + "\n" +
                        "DNI: " + DNI + "\n" +
                        "Cumpleaños: " + birthDate + "\n" +
                        "Profesión: " + profession
        );
        super.showClient();

    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
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
