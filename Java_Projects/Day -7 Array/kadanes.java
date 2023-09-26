import java.util.*;
public class kadanes {
    public static int kadanesAlgo(int arr[])
    {
        int cs =0;
        int ms = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE; 
        for(int i =0 ; i<arr.length; i++)
        {
        cs += arr[i];
        cs = Math.max(cs,0);
        ms = Math.max(ms,cs);
        }

        //if all of the numbers are -ve  then 
        if(ms<=0){
            for(int i = 0 ; i < arr.length;i++)
            {
                {
                    max =Math.max(max,arr[i]);
                }
            }
            return max;
        }

        return ms;

    }
    public static void main(String[] args) {
        int arr[]={-2,-3,-4,-1,-2,-1,-5,-3};
        int ans = kadanesAlgo(arr);
        System.out.println(ans);
    }
}
