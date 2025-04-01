import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = 0;
        int out = 0;
        int x = 0;
        System.out.print("Qnt números: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Número : ");
            x = sc.nextInt();
            if ((x >= 10) && (x <= 20)) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + "in");
        System.out.println(out + "out");
        sc.close();
    }
}
