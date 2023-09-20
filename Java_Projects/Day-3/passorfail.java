import java.util.Scanner;
public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = 75;
        String res =  (marks >75)? "pass": "fail";
        System.out.println(res);
    }
}
