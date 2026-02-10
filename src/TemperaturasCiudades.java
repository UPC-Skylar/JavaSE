import java.util.Scanner;

public class TemperaturasCiudades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CANTIDAD_CIUDADES = 5;
        int indexTempMin = 0, indexTempMax = 0;
        String[] ciudades = new String[CANTIDAD_CIUDADES];
        int[] temperaturasMinimas = new int[CANTIDAD_CIUDADES], temperaturasMaximas = new int[CANTIDAD_CIUDADES];

        //Leer datos
        for(int i = 0; i < CANTIDAD_CIUDADES; i++){
            System.out.print("Ingrese el nombre de la ciudad: ");
            ciudades[i] = sc.nextLine();
            System.out.print("Ingrese la temperatura minima(°C): ");
            temperaturasMinimas[i] = sc.nextInt();
            System.out.print("Ingrese la temperatura maxima(°C): ");
            temperaturasMaximas[i] = sc.nextInt();
            sc.nextLine();
        }

        // Averiguamos el indice con menorTemperatura y mayorTemperatura
        int minTemperatura = temperaturasMinimas[0], maxTemperatura = temperaturasMaximas[0];
        for(int i = 0; i < CANTIDAD_CIUDADES; i++){
            if(temperaturasMinimas[i] < minTemperatura){
                minTemperatura = temperaturasMinimas[i];
                indexTempMin = i;
            }

            if(temperaturasMaximas[i] > maxTemperatura){
                maxTemperatura = temperaturasMaximas[i];
                indexTempMax = i;
            }
        }

        // Imprimimos
        System.out.println("La ciudad con menor temperatura fue: " + ciudades[indexTempMin]);
        System.out.println("La ciudad con mayor temperatura fue: " + ciudades[indexTempMax]);
    }
}
