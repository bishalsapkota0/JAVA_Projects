import java.util.Scanner;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double income = sc.nextDouble();
        int tax;
        System.out.println("Income after tax is :: ");
        if (income < 500000) {
            System.out.println(income);
        }
        else if((income >= 500000) && (income < 1000000))
        {
            System.out.println(income*0.80);
        }
        else{ 
            System.out.println(income*0.7);
        }
    }
}
