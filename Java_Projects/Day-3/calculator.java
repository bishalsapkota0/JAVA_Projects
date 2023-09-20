import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first_num = sc.nextInt();
        System.out.println("Enter Second Number");
        int second_num = sc.nextInt();
        System.out.println("*******************************");
        System.out.println("***********************************************");
        System.out.println("**************************************************************************");
        System.out.println("Please tell me what do you want to do::");
        char operator = sc.next().charAt(0); //to input single character
        switch (operator) {
            case '+': System.out.println(first_num+second_num); break;
            case '-': System.out.println(first_num-second_num);break; 
            case '*': System.out.println(first_num*second_num); break;
            case '/': System.out.println(first_num/second_num); break;
            default: System.out.println("Please re enter your data");
                break;
        }
    }
}
