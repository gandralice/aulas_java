import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de alunos: ");
        int qnt = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[qnt];
        double[] n1 = new double[qnt];
        double[] n2 = new double[qnt];

        for (int i = 0; i < qnt; i++) {
            System.out.println("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.println("Nota 1: ");
            n1[i] = sc.nextDouble();

            System.out.println("Nota 2: ");
            n2[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("APROVADOS= ");
        for (int i = 0; i < qnt; i++) {
            double media = (n1[i] + n2[i]) / 2;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}