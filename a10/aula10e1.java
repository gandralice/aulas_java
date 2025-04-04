import java.util.Scanner;

public class aula10e1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        try {
            int divisao = n1 / n2;
            System.out.println("Resultado: " + divisao);

        }catch (ArithmeticException e) {
            System.out.println("Não é possível realizar divisão por zero.");
        }
        sc.close();
    }
}