import java.util.Scanner;

public class Practica28 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String[] datos = new String[3];
        System.out.println("Introduzca su nombre");
        String name = lector.next();
        datos[0] = name;
        System.out.println("Introduzca su edad");
        int edad = lector.nextInt();
        datos[1] = String.valueOf(edad);
        System.out.println("Introduzca su salario (los decimales van con coma)");
        double salario = lector.nextDouble();
        datos[2] = String.valueOf(salario);
        double resultado;
        if (edad < 16){
            System.out.println(datos[0] + " no tiene edad para trabajar");
        } else if ((19 < edad)&&(edad < 50)) {
            resultado = salario + (salario * 0.05);
            datos[2] = String.valueOf(resultado);
            System.out.println("El salario de " + datos[0] + " por tener "+datos[1]+  " años es de " + datos[2] + "€");
        } else if ((51<edad)&&(edad<60)) {
            resultado = salario + (salario * 0.1);
            datos[2] = String.valueOf(resultado);
            System.out.println("El salario de " + datos[0] + " por tener "+datos[1]+  " años es de " + datos[2] + "€");
        }
        else {
            resultado = salario + (salario * 0.15);
            datos[2] = String.valueOf(resultado);
            System.out.println("El salario de " + datos[0] + " por tener "+datos[1]+  " años es de " + datos[2] + "€");
        }

    }
}
