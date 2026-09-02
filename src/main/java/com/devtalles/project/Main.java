package com.devtalles.project;

import com.devtalles.project.clients.Client;
import com.devtalles.project.clients.ClientCompany;
import com.devtalles.project.clients.IndividualClient;
import com.devtalles.project.clients.PremiumClient;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cliente Individual");
        IndividualClient individualClient = new IndividualClient(
                "Calle Falsa 123",
                "3794123456",
                "juan@email.com",
                LocalDate.now(),
                new BigDecimal("150000.50"),
                40123456,
                LocalDate.of(1995, 8, 15),
                "Programador",
                "Juan",
                "Pérez"
        );
        individualClient.showClient();


}}
//        System.out.println("Cliente Premiun");
//
//        PremiumClient premiumClient = new PremiumClient(
//                "Calle Falsa 123",
//                "3794123456",
//                "juan@email.com",
//                LocalDate.now(),
//                new BigDecimal("150000.50"),
//                40123456,
//                LocalDate.of(1995, 8, 15),
//                "Programador",
//                new BigDecimal("500000.50"),
//                "Juan López",
//                "Acceso VIP, viajes gratis",
//                "Juan",
//                "Pérez"
//        );
//
//
//        System.out.println("Cliente Empresa");
//        System.out.println("Cliente Empresa");
//
//        ClientCompany clientCompany = new ClientCompany(
//                "IBM",
//                "555 Bailey Ave, San Jose, CA 95141",
//                "3794123456",
//                "IBM@email.com",
//                LocalDate.now(),
//                new BigDecimal("2500000.00"),
//                "20-30123456-7",
//                "Desarrollo de Software",
//                "Laura Fernández"
//        );
//
//        List<Client> clients = List.of(individualClient, premiumClient, clientCompany);
//        for (Client client:clients){
//            client.showClient();
//        }

