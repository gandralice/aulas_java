import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        double[]v = new double[n];

        double maior = v[0];
        int posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            v[i] = sc.nextDouble();

            if (v[i] > maior) {
                maior = v[i];
                posicaoMaior = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
    }
}
