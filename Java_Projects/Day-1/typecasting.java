import java.util.*;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 23.1;
        //int b  = a;//this is wrong line cause java wont allow us to do so
        //but 
        int b = (int) a;
        System.out.println(b);

        char ch  = 'a';
        int number = (int)ch;
        System.out.println(number);
    }
}
