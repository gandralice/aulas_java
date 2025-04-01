import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n = sc.nextInt();
        int soma = calcSoma(n);
        System.out.println(soma);
        sc.close();
    }
    public static int calcSoma(int n) {
        n = Math.abs(n);
        int soma = 0;
        while (n > 0) {
            soma += n % 10;
            n /= 10;
        }
        return soma;
    }
}
