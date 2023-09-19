import java.util.*;
public class programtocalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        int sum = (a+b+c)/3;
        System.out.print("The average is ::");
        System.out.println(sum);

    }
    
}
