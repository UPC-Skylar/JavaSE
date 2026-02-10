import java.util.Scanner;

public class Ejercicio2TodoCode {
    public static void main(String[] args) {
        //Crea un arbolito de Navidad, el tamaño sera ingresado por el usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Christmas tree (must be greather than 2): ");
        int rows = sc.nextInt();

        if (rows <= 2) {
            System.out.println("Error: You must choose a size greather than 2");
            System.exit(0);
        }

        for(int i = 1; i <= rows; i++) {
            for(int j = 0; j < rows - i; j++) System.out.print(" ");
            for(int k = 0; k < (i * 2) - 1; k++) System.out.print("*");
            System.out.println();
        }

        int spaces = rows - 2;
        for(int i = 0; i < spaces; i++) System.out.print(" ");
        System.out.println("|||");


    }
}
