import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nome: ");
        String nome = sc.nextLine();
        System.out.println(saudacao(nome));
        sc.close();
    }
    public static String saudacao(String nome) {
        return "Seja bem vindo(a) " + nome + "!";
    }
}
