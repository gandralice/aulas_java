import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num:");
        int num = sc.nextInt();
        System.out.println(verif(num));
        sc.close();
    }
    public static boolean verif(int n){
        if(n%2==0){
            return true;
        }else {
            return false;
        }
    }
}

