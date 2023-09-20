import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean x = (year%4)==0;
        boolean y = (year%100) !=0;
        boolean z = ((year%100==0)&& (year%400==0));
        if(x && (y || z)) //must divisible by 4 and must be divided by either 100 or 400
        System.out.println("is a leap year");
        else
        System.out.println(" not a year leap year");
    }
    
}
