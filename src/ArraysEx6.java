import java.util.Random;

public class ArraysEx6 {
    public static void main(String[] args) {
        int num1=0,num2=9;
        int fila=5;
        int columna=5;
        int[][] matriz1 = new int[fila][columna];
        int[][] matriz2 = new int[fila][columna];
        int[][] matriz3 = new int[fila][columna];
        insArray(matriz1,num1,num2);
        insArray(matriz2,num1,num2);
        sumaArray(matriz1,matriz2,matriz3);
        System.out.println("La suma de la matriz 1:");
        imprimirArray(matriz1);
        System.out.println("\nY de la matriz 2: ");
        imprimirArray(matriz2);
        System.out.println("\n es: ");
        imprimirArray(matriz3);

    }
    private static int randomNum(int a, int b){
        Random random = new Random();
        return random.nextInt(a,b);
    }
    public static void insArray(int[][] lista,int a,int b){
        for (int i=0;lista.length>i;i++){
            for (int j=0;j<lista[i].length;j++){
                int num= 0;
                lista[i][j]=randomNum(a,b);
            }
        }
    }
    public static void sumaArray(int[][]lista1,int[][]lista2,int[][]lista3){
        for (int i=0;lista1.length>i;i++){
            for (int j=0;j<lista1[i].length;j++){
                lista3[i][j]=lista2[i][j]+lista1[i][j];
            }
        }
    }
    public static void imprimirArray(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
            }
            System.out.println();
        }
    }
}
