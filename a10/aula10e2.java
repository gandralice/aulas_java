import java.util.Scanner;

public class aula10e2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        try {
            int y = Integer.parseInt(x);
            System.out.println(y);

        }catch (NumberFormatException e){
            System.out.println("Erro: Não foi possivel realizar a conversão.");
        }
        sc.close();
    }
}