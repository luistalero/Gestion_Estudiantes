package com.gestion_estudiante;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de estudiantes: ");
        while (!sc.hasNextInt()) {
                System.err.println("Error: Debe Ingresar un numero.");
                sc.next();
                System.out.print("\nIngrese la cantidad de estudiantes: ");

            }
        int estudiantes = sc.nextInt();
        sc.nextLine();

        List<String> listaEstudiantes = new ArrayList<>();
        for (int i = 0; i < estudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            while (sc.hasNextInt() || sc.hasNextDouble()) {
                System.err.println("Error: Debe Ingresar un Nombre.");
                sc.next();
                System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");

            }
            String nombre = sc.nextLine();
            listaEstudiantes.add(nombre);
        }

        int opcion;

        do {
            String menu = """
            ==============================
            ===    ¿Que desea hacer?   ===
            ==============================
            1. Ver Lista de Estudiantes
            2. Ver Lista En Orden A-Z
            3. Buscar Estudiante
            4. Salir
            """;
            System.out.println(menu);     
            System.out.print("Selecione una opción: ");

            while (!sc.hasNextInt()) {
                System.err.println("Error: Debe Ingresar un numero.");
                sc.next();
                System.out.print("Seleccione una opción: ");

            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nLista completa de estudiantes: ");
                    for (String lista : listaEstudiantes) {
                        System.out.println(lista);
                    }
                    break;

                case 2:
                    Collections.sort(listaEstudiantes);
                        System.out.println("\nLista de estudiantes ordenada alfabéticamente: ");
                    for (String lista : listaEstudiantes) {
                        System.out.println(lista);
                    }
                    break;

                case 3:
                    boolean buscarOtro;
                    do {
                        System.out.println("\nIngrese el nombre del estudiante que desea buscar: ");
                        String nombreBusqueda = sc.nextLine();
                        if (listaEstudiantes.contains(nombreBusqueda)) {
                            System.out.println("El estudiante \"" + nombreBusqueda + "\" está en la lista." );
                        } else {
                            System.out.println("El estudiante \"" + nombreBusqueda + "\" no está en la lista.");
                        }

                        System.out.println("¿Desea Buscar otro estudiante? (S/N): ");
                        String respuesta = sc.nextLine();
                        buscarOtro = respuesta.equalsIgnoreCase("s");

                    } while (buscarOtro);
                    break;

                case 4:
                    System.out.println("Gracias por usar este programa....");
                    break;

                default:
                System.out.println("Esta opción no es valida...");
                    break;
            }

        } while (opcion != 4);
        
        sc.close();
    }
}