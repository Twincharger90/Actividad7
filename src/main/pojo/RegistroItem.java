package main.pojo;


import java.util.Scanner;

public class RegistroItem{

    private static Scanner scn = new Scanner(System.in);

    public static void gestorSalida(){

        SolicitudMaterial solicitudMaterial = new SolicitudMaterial();

        System.out.println("Ingresa nombre Solicitante");
        solicitudMaterial.setSolicitante(scn.nextLine());
        System.out.println("Ingresa Id Solicitante");
        solicitudMaterial.setIdSolicitante(scn.nextLine());
        System.out.println("Ingresa Id Item");
        solicitudMaterial.setId(scn.nextLine());
        System.out.println("Ingresa la fecha");
        solicitudMaterial.setFecha(scn.nextLine());
        System.out.println("Ingresa el status del Item");
        solicitudMaterial.setEstatus(scn.nextLine());

        System.out.println(solicitudMaterial.toString());
    }

}
