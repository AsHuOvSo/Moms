import java.util.Scanner;
import java.lang.String;

public class Moms {
    //Started code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indskriv pris: ");
        double purchaseAmount = input.nextDouble();

        System.out.println("Dansk moms udgør: " + ((int) (plusDanskMoms(purchaseAmount) * 100) / 100.0) + " af beløbet");
        System.out.println("Tysk moms udgør: " + ((int) (plusTyskMoms(purchaseAmount) * 100) / 100.0) + " af beløbet");

    }

    public static double plusDanskMoms(double amount) {
        double momsAmountDansk = amount * 0.25;
        return momsAmountDansk;
    }

    public static double plusTyskMoms(double amount) {
        double momsAmountTysk = amount * 0.16;
        return momsAmountTysk;
    }
}
