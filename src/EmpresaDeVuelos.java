import java.util.Scanner;

public class EmpresaDeVuelos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] vuelos = new int[6][3];
        String[] paisesDestino = {"Rio de Janeiro", "Cancún", "Madrid", "Roma", "Milán", "Iguazú"};
        String[] turnoVuelos = {"Mañana", "Mediodía", "Noche"};

        //Leer el número de asientos
        for(int i = 0; i < vuelos.length; i++){
            for(int j = 0; j < vuelos[i].length; j++){
                System.out.print("Ingres el número de asiento de " + paisesDestino[i] + " | " + turnoVuelos[j] + ": ");
                vuelos[i][j] = sc.nextInt();
            }
        }

        int numeroDestino, numeroTurno, cantBilletes, ventas = 0;
        boolean seguirReservando;


        do{
            // Destino y turno del vuelo
            do {
                System.out.println("------- AGENCIA DE VUELOS -------");
                System.out.println("Hola! Encantados de verte de nuevo!");
                System.out.println("Estos son nuestros vuelos disponibles");
                System.out.println("------------ DESTINOS -----------");
                System.out.println("0. Rio de Janeiro");
                System.out.println("1. Cancún");
                System.out.println("2. Madrid");
                System.out.println("3. Roma");
                System.out.println("4. Milan");
                System.out.println("5. Iguazú");
                System.out.print("Por favor, ingrese el número del destino: ");
                numeroDestino = sc.nextInt();
            } while (numeroDestino < 0 || numeroDestino > 5);

            do {
                System.out.println("------------ TURNOS -----------");
                System.out.println("0. Mañana");
                System.out.println("1. Mediodía");
                System.out.println("2. Noche");
                System.out.print("Por favor, ingrese el número del turno del vuelo: ");
                numeroTurno = sc.nextInt();
            } while(numeroTurno < 0 || numeroTurno > 2 );

            // Proceso de Compra
            do {
                System.out.println("------------ COMPRA -----------");
                System.out.print("Ingrese el número de billetes que desea comprar: ");
                cantBilletes = sc.nextInt();

                if(cantBilletes > vuelos[numeroDestino][numeroTurno]) {
                    System.out.println("Disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
                    break;
                }

                vuelos[numeroDestino][numeroTurno] -= cantBilletes;
                System.out.println("Su reserva fue realizada con éxito");
                ventas += cantBilletes;
            } while (cantBilletes <= 0);

            sc.nextLine();
            System.out.print("Desea seguir reservando? Ingrese finish para terminar la reserva o cualquier valor para continuar: ");
            seguirReservando = !("finish".equalsIgnoreCase(sc.nextLine()));
        } while (seguirReservando);

        System.out.println("Total de billetes vendidos: " + ventas);

        System.out.println();
        // DEMO (como queda al final)
        for(int i = 0; i < vuelos.length; i++){
            for(int j = 0; j < vuelos[i].length; j++){
                System.out.print(vuelos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
