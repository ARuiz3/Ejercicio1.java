import java.util.Random;

public class ArraysEx3 {
    public static void main(String[] args) {
        //Random random = new Random();
        int numeros, sumatotal=0;
        int array[][] = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        rellenarArray(array);
        System.out.println("La matriz es: ");
        imprimirMatriz(array);
        System.out.println("La suma de columnas es: ");
        sumaColumnas(array);
        System.out.println("La suma de filas es:");
        sumaFilas(array);
        System.out.println("La suma total es:");
        sumaTotal(array);

    }
    public static void rellenarArray(int[][] matriz) {
        Random random = new Random();
        int numeros;
        for (int i = 0; matriz.length > i; i++) {
            for (int c = 0; matriz[i].length > c; ++c) {
                numeros = random.nextInt(0, 9);
                matriz[i][c] = numeros;
            }
        }
    }


    public static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
            }
            System.out.println();
        }
    }
    static void sumaFilas(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            int suma = 0;
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
                suma += matriz[y][x];
            }
            System.out.printf("= %d\n", suma);
        }
    }

    static void sumaColumnas(int[][] matriz) {

        imprimirMatriz(matriz);

        for (int x = 0; x < matriz[0].length; x++) {
            System.out.print("___");
        }
        System.out.println();
        for (int x = 0; x < matriz[0].length; x++) {
            int suma = 0;
            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[y][x];
            }
            System.out.printf("%d ", suma);
        }
        System.out.println();
    }
    public static void sumaTotal(int[][] matriz){


        imprimirMatriz(matriz);

        for (int x = 0; x < matriz[0].length -2; x++) {
            System.out.print("___");
        }

        int suma = 0;
        for (int x = 0; x < matriz[0].length; x++) {

            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[y][x];
            }
        }
        System.out.print(suma);
    }
}
