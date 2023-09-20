import java.util.Scanner;

public class posOrnev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>=0) {
          System.out.println("Is +ve");
        }
        else
        System.out.println("Negative");
    }
}
