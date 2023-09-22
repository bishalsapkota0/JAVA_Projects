import java.util.Scanner;
public class dontdisplayMultipleof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Your Number");
            int num  =sc.nextInt();

            if(num %10 == 0)
            continue;
            System.out.println("The number was::"+num);
        }
        while(true);
    }
}




