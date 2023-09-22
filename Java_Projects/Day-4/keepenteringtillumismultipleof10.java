import java.util.Scanner;
public class keepenteringtillumismultipleof10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter your number");
            num = sc.nextInt();
            if (num%10==0) {
                break;
            }
            System.out.println("Youur Number was"+num);
        }
        while(true);
    }
}
