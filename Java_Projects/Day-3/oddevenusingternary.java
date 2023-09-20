import java.util.Scanner;

public class oddevenusingternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 15;
        //ternary operators
      String numb =  ((number%2)==0) ? "even" : "odd";
      System.out.println(numb);
    }
}

