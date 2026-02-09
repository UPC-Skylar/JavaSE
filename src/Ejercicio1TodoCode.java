import java.util.Scanner;

public class Ejercicio1TodoCode {
    public static void main(String[] args) {
        /* Realizar un programa que dado por teclado un límite númerico
         * por teclado (por ejemplo 100) muestre en pantalla todos los
         * numeros hasta ese limite (empezando por 1) */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número por favor: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) System.out.print(i + " \t ");
    }
}
