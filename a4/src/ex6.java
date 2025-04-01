import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com 3 valores: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("TRIANGULO: " + (a*c)/2);
        System.out.println("CIRCULO: " + Math.PI* Math.pow(c,2));
        System.out.println("TRAPEZIO: " + ((a+b)*c)/2);
        System.out.println("QUADRADO: " + (b*b));
        System.out.println("RETANGULO: " + (a*b));
        sc.close();
    }
}
