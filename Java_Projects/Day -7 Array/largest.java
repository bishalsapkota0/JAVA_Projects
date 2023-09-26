import java.util.*;
public class largest {
    public static int largestt(int numbers[])
    {
        int largest = Integer.MIN_VALUE ;
        for(int i = 0 ;i< numbers.length; i++){
            if(largest<numbers[i])
            {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        int ans = largestt(numbers);
        System.out.println(ans);
        
    }
    
}
//Time Complexity = 0 n^2