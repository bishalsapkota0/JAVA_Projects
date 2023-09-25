import java.util.Scanner;

public class fun4 {
     public static int sum(int a, int b){ ///parameters or formal parameters
        int sum1 = a+b;
        return sum1;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = sum(a,b);//arguments or actual parameters
        System.out.println(ans);
    }
    
}
