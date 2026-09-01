package com.devtalles.project.clients;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ClientCompany extends Client {
    private String companyName;
    private String CUIT;
    private String companyActivity;
    private String legalRepesentative;

    public ClientCompany(
            String companyName,
            String address,
            String phoneNumber,
            String email,
            LocalDate bankRegistrationDate,
            BigDecimal declaredIncome,
            String CUIT,
            String companyActivity,
            String legalRepresentative) {
        super(address, phoneNumber, email, bankRegistrationDate, declaredIncome);
        this.companyName = companyName;
        this.CUIT = CUIT;
        this.companyActivity = companyActivity;
        this.legalRepesentative = legalRepresentative;
    }

    @Override
    public void showClient() {
        System.out.println("La información del Cliente Empresa es la siguiente:");
        System.out.println(
                        "Nombre de Empresa: " + companyName + "\n"+
                        "CUIT: " + CUIT + "\n" +
                        "Actividad: " + companyActivity + "\n" +
                        "Representante Legal: " + legalRepesentative
        );
        super.showClient();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getCompanyActivity() {
        return companyActivity;
    }

    public void setCompanyActivity(String companyActivity) {
        this.companyActivity = companyActivity;
    }

    public String getLegalRepesentative() {
        return legalRepesentative;
    }

    public void setLegalRepesentative(String legalRepesentative) {
        this.legalRepesentative = legalRepesentative;
    }
}
