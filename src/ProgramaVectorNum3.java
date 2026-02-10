import java.util.Scanner;

public class ProgramaVectorNum3 {
    public static void main(String[] args) {
        //Creamos un vector con capacidad para 15 numeros
        int[] vector = new int[15];
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        for(int num : vector){
            System.out.print("Ingresa un número: ");
            num = sc.nextInt();
            if(num == 3) contador++;
        }

        System.out.println("La cantidad de veces que se ingreso el 3 es: " + contador);
    }
}
