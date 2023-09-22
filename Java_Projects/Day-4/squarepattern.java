 
import java.util.Scanner;
public class squarepattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = 4;
        for (int i = 0; i < number; i++) {
           System.out.println("* * * * ");
        }
        System.out.println("/////////////////////////////////////////////////////////////");
        int incr=0;
        while (incr<number) {
            System.out.println("* * * * ");
              incr++;
        }

    }
}
