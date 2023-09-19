import java.util.Scanner;

public class Billmaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
          a  = sc.nextInt();
          b= sc.nextInt();
          c = sc.nextInt();
          double sum = a+b+c;
        System.out.print("Before GST::");
        System.out.println(sum);
        System.out.println("Adding 18% GST ");
        sum = (sum * 1.18);
        System.out.print("Final bill is::: ");
        System.out.println(sum);
        
    }
}
