import java.io.IOException;


public class Practica13 {
    public static void main(String[] args) throws IOException {

        System.out.println("introduce dos caracteres juntos");
        char car1 = (char) System.in.read();
        char espacio = (char) System.in.read();
        char car2 = (char) System.in.read();
        if (car1 == car2){
            System.out.println(car1 + " " + car2+ " son iguales");
        }
        else {
            System.out.println(car1 + " " + car2 + " no son iguales");
        }
    }
}
