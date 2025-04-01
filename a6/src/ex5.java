import java.math.BigInteger;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("numero: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Numero negativo");
        } else {
            BigInteger fatorial = BigInteger.ONE;
            for (int i = 1; i <= num; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fatorial);
        }
        sc.close();
    }
}
