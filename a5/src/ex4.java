import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a hora de inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Informe a hora de término: ");
        int fim = sc.nextInt();

        int duracaoJogo = calcularDuracao(inicio, fim);
        System.out.printf("o tempo de duração do jogo foi de %d hora(s)%n", duracaoJogo);

        sc.close();
    }
    public static int calcularDuracao(int inicio, int fim) {
        if (fim>inicio) {
            return (fim-inicio);
        } else if (fim==inicio) {
            return 24;
        }else {
            return 24 - inicio+fim;
        }
    }
}
