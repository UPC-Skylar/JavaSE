import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ALUMNOS = 4, NUM_NOTAS = 3;
        int[][] notasAlumnos = new int[NUM_ALUMNOS][NUM_NOTAS + 1];

        // Leer notas
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            int sumNotas = 0;
            for (int j = 0; j < NUM_NOTAS; j++) {
                System.out.print("Alumno " + (i + 1) + ", Nota " + (j + 1) + ": ");
                notasAlumnos[i][j] = sc.nextInt();
                sumNotas += notasAlumnos[i][j];
            }
            // Promedio preciso
            notasAlumnos[i][NUM_NOTAS] = (int) Math.round(sumNotas / 3.0);
        }

        // Mostrar matriz
        System.out.println("\n=== MATRIZ DE NOTAS ===");
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                if (j == NUM_NOTAS) System.out.print("Promedio: ");
                System.out.print("[" + notasAlumnos[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
