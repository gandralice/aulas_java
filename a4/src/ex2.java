import  java.text.DecimalFormat;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Raio do circulo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        DecimalFormat df = new DecimalFormat("#.####");
        String resultado = df.format(area);
        System.out.println("A= " + resultado);
        sc.close();
    }

}
