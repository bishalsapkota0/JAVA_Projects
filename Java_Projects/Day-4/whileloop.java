import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number upto which you have to print");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }
}
