import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Segundos: ");
        int s = sc.nextInt();
        System.out.println("Horas: " + horas(s));
        System.out.println("Minutos: " + minutos(s));
        System.out.println("Segundos restantes: " + resto(s));
        sc.close();
    }
    public static int minutos(int segundos){
        return (segundos % 3600)/ 60;
    }
    public static int horas(int segundos){
        return segundos / 3600;
    }
    public static int resto(int segundos){
        return segundos % 60;
    }
}
