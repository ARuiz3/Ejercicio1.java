import java.io.IOException;
import java.util.Scanner;

public class Practica24 {
    public static void main(String[] args) throws IOException {
        Scanner lector= new Scanner(System.in);
        System.out.println("Introduzca el operador de la operación que desee realizar: ");
        String operador1 = lector.next();
        float numero1;
        float numero2;
        float resultado;
        switch (operador1){
            case "-":
                System.out.println("Introduzca los números que desee restar (recuerda que se restara el primero-segundo)");
                numero1 = lector.nextFloat();
                numero2 = lector.nextFloat();
                resultado = numero1 - numero2 ;
                System.out.println("el resultado es = " + resultado);
                break;

            case "+":
                System.out.println("Introduzca los números que desee sumar");
                numero1 = lector.nextFloat();
                numero2 = lector.nextFloat();
                resultado = numero1 + numero2 ;
                System.out.println("el resultado es = " + resultado);
                break;
            case "*":
                System.out.println("Introduzca los números que desee multiplicar");
                numero1 = lector.nextFloat();
                numero2 = lector.nextFloat();
                resultado = numero1 * numero2 ;
                System.out.println("el resultado es = " + resultado);
                break;
            case "/":
                System.out.println("Introduzca los números que desee dividir (recuerda que el primer sera dividido por el segundo)");
                numero1 = lector.nextFloat();
                numero2 = lector.nextFloat();
                resultado = numero1 / numero2 ;
                System.out.println("el resultado es = " + resultado);
                break;
            case "%":
                System.out.println("Introduzca los números que desee dividir y que te de el modulo (recuerda que el primer sera dividido por el segundo)");
                numero1 = lector.nextFloat();
                numero2 = lector.nextFloat();
                resultado = numero1 % numero2 ;
                System.out.println("el resultado es = " + resultado);
                break;
            case "^":
                System.out.println("Introduzca el numero que deseas elevar y a que numero lo deseas elevar");
                numero1 = lector.nextFloat();
                numero2 = lector.nextFloat();
                resultado = (float) Math.pow(numero1, numero2);
                System.out.println("el resultado es = " + resultado);
            default:
                System.out.println("El operador intoducido no es correcto");
        }
    }
}
