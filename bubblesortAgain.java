public class bubblesortAgain {
    public static void fun(int arr[]){
        boolean swapped ;
        for(int i = 0 ; i<arr.length;i++){
            swapped =false;
            for(int j = 1;j<=arr.length -i-1; j++)
            {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                    swapped = true;
                }
            }
            if(!swapped)
            break;
        }

        for(int k = 0 ;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        fun(arr);


    }
    
}
//Time complexity for this programme is O(n2) cause for n i's j is going to take time n-1, n-2, n-3....

