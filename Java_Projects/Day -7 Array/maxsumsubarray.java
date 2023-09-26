public class maxsumsubarray {
    public static int fun(int arr[]){
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        int prifixSum[] = new int[arr.length];
        prifixSum[0]=arr[0];
        //calculate prefix array
        for(int i = 1 ; i<prifixSum.length;i++)
        {
          prifixSum[i] = prifixSum[i-1]+arr[i];
        }

        for(int i = 0 ;i<arr.length; i++)
        { int start = i;
            for(int j = i ; j<arr.length; j++)
            {
                int end = j ;
                currSum = start ==0? prifixSum[end]: prifixSum[end]-prifixSum[start-1];
                 if(maxSum<currSum)
                 {
                    maxSum = currSum;
            }
                 }
        }
        return maxSum;
       
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
       int anss= fun(arr);
       System.out.println(anss);


    }
}
