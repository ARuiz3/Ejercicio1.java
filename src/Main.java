import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.print("Quina taula de multiplicar vols?");
        int taula = lector.nextInt();
        for (int i=0; i<=10;i++) {
            int resultat = taula*i;
            System.out.print(taula + "*" + i + "=" + resultat + " ");
        }
    }
}