import java.util.Scanner;

public class BucleDePalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        String palabra;

        while(true){
            System.out.print("Ingresa una palabra: ");
            palabra = sc.nextLine();

            if(palabra.equalsIgnoreCase("salir")) break;
            System.out.println("Palabra " + number + " :" + palabra);
            number++;
        }
    }
}
