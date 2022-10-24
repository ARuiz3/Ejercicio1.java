import java.util.Scanner;

public class Practica7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Si desea convertir Euros a Pts escriba 1\nSi desea convertir Pts a Euros escriba 2");
        byte selector= lector.nextByte();
        double resultado;
        if (selector ==1){
            System.out.println("Cuantos Euros deseas convertir?");
            double euros = lector.nextDouble();
            resultado =euros/ 166.39;
            System.out.println(euros + "€ son " + resultado + "Pts");
        }
        else if (selector == 2) {
            System.out.println("Cuantas Pts deseas convertir?");
            int pesetas = lector.nextInt();
            resultado = (double)pesetas / 0.0060;
            System.out.println(pesetas + "Pts son " + resultado + "Euros");
        }
        else {
            System.out.println("El numero introducido no es válido");
        }

    }
}
