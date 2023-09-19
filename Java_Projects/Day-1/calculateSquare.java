import java.util.Scanner;

public class calculateSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of square");
        int length = sc.nextInt();
        int area = length * length;
        System.out.print("Area is :: ");
        System.out.println(area);

    }
}
