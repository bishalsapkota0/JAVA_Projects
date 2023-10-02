import java. util.Arrays;
public class selection {
    public static void swapArray(int arr[],int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    public static void selectionSort(int arr[])
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            //find the maximum item in the remaining array and swap with correct index
            int last = arr.length -i-1;
            int maxIndex = getMaxindex(arr, 0, last);
            swapArray(arr, i, i);
        }
        for(int k = 0 ; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }
    public static int getMaxindex(int arr[],int start, int end){
        int max = start;
        for(int i = start ; start<= end ; i++){
            if (arr[max] <arr[i]){
                swapArray(arr, i, end);
                max= i;
            }
        }
       return max;
    }
    public static void main(String[] args) {
        int arr[]={5,4,2,1,6,3};
        selectionSort(arr);

    }
}
