import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Is Even");
        }
        else
        System.out.println("Is odd");

    }
}
