import java.util.Scanner;

public class Maraton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, categoria;
        int DNI, edad;

        while(true) {
            System.out.println("--- Federación de Colectividades ---");

            System.out.print("Ingresa tu DNI: ");
            DNI = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa tu nombre: ");
            nombre = sc.nextLine();

            if (DNI == 0 && nombre.equalsIgnoreCase("fin")) break;

            System.out.print("Ingresa tu edad: ");
            edad = sc.nextInt();
            sc.nextLine();

            if (edad >= 6 && edad <= 10) categoria = "Menores A";
            else if (edad <= 17) categoria = "Menores B";
            else if (edad <= 30) categoria = "Juveniles";
            else if (edad <= 50) categoria = "Adultos";
            else categoria = "Adultos mayores";

            System.out.println("La categoria  a la que pertenece es: " + categoria);
            System.out.print("\n\n");
        }
    }
}
