/**
 * functionoverloading
 */
public class functionoverloading {
    public static int sum(int a , int b )
    {
        int sum = a+b;
        return sum;
    }
    public static float sum(int a , int b , int c)
    {
        int ans = a+b+c;
        return ans;
    }
 public static void main(String[] args) {
    int first = sum(3,4);
    int second = sum(3.0,4.5,5.5);
    System.out.println(first );
    System.out.println(second);
    
 }
    
}