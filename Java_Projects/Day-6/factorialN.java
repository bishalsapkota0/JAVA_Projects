/**
 * factorialN
 */
import java.util.*;
public class factorialN {
    public static int factorial(int n ){
        if(n==0)
        return 1;
        int f = 1;
        for (int i  = 1; i<=n ;i++) {
            f= f*i; 
        }
        return f;

    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = factorial(0);
    System.out.println(ans);
      

    
 }
    
}
