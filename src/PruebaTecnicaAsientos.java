import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // No se permite GUI ni BD
        Scanner sc = new Scanner(System.in);
        char[][] asientos = new char[10][10];
        boolean quiereReservar = true;
        int opcion;

        // Inicializar con todos los asientos libres
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'L';
            }
        }

        // Ejecutar programa
        while(quiereReservar){

            // GUI de consola
            do {
                System.out.println("------------ SISTEMA DE RESERVAS DE ASIENTOS ------------");
                System.out.println("1. Reservar un asiento");
                System.out.println("2. Mostrar asientos disponibles");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 3);

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la fila (0-9): ");
                    int fila = sc.nextInt();
                    System.out.print("Ingrese la columna (0-9): ");
                    int columna = sc.nextInt();
                    if (asientos[fila][columna] == 'L') {
                        asientos[fila][columna] = 'X';
                        System.out.println("Asiento reservado exitosamente.");
                    } else {
                        System.out.println("El asiento ya está reservado. Intente con otro.");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Asientos disponibles:");
                    for (int i = 0; i < asientos.length; i++) {
                        for (int j = 0; j < asientos[i].length; j++) {
                            System.out.print(asientos[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    quiereReservar = false;
                    System.out.println("Gracias por usar el sistema de reservas. ¡Hasta luego!");
                    break;
            }
            System.out.println();
            System.out.println();
        }

    }
}
