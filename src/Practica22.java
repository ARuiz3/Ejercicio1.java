import java.util.Objects;
import java.util.Scanner;

public class Practica22 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String contra = "contraseña";
        boolean comprobador = false;

        byte contador = 3;
        while (contador > 0){
            System.out.println("Escriba la contraseña , le quedan " + contador + " intentos restantes");
            String passwordID = lector.next();
            if (Objects.equals(passwordID, contra)){
                System.out.println("Enhorabona, has encertat");
                contador = 0;
                comprobador = true;
            }
            contador--;
        }
        if(!comprobador) {
            System.out.println("Ho sentim, no has encertat");
        }
    }
}
