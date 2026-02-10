public class MatrizDe5 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 5;
            }
        }

        for(int i = 0; i < matriz.length; i++) {
            for(int num : matriz[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
