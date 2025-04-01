import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        float numero = sc.nextFloat();

        if (numero >= 0 && numero <= 25) {
            System.out.println("O número está no intervalo [0,25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("O número está no intervalo [25,50]");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("O número está no intervalo [50,75]");
        } else if (numero > 75 && numero <= 100) {
            System.out.println("O número está no intervalo [75,100]");
        } else {
            System.out.println("O número está fora de intervalo");
        }
        sc.close();
    }
}