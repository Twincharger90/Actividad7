package main.pojo;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        System.out.println("Actividad 7 ");
        System.out.println("Seleccione una opcion: ");
        System.out.println("1: Menu Principal");
        System.out.println("2: Lista Subpartidas");
        System.out.println("3: Salida");
        int opMenu = scanner.nextInt();


        do {
            switch (opMenu) {
                case 1:

                    RegistroItem.gestorSalida();


                    break;
                case 2:
                    System.out.println("Lista de subpartidas se implementara en cuanto se tenga mas informacion");
                    break;
                case 3:
                    System.out.println("Adios");
                    opMenu = -20;

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opMenu != -20);
        return 0;

    }


}
