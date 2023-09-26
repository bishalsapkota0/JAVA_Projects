public class Binarysearch {
    public static int findKey(int numbers[],int key)
    {
        int start = 0;
        int end = numbers.length-1;
        while(start <= end)
        {
            //find mid
            int mid = (start+end)/2 ;
            //comparision
            if(numbers[mid]==key)
            {
              return mid;
            }
            if(numbers[mid]<key)//right case
            {
                start = mid+1;
            }
            else{ //left case
                 end = mid -1;

            }
            
        }


        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 98;
        System.out.println(findKey(numbers, key));

    }
}


//Prerequisite -> array should be sorted
//Time complexity is  O(log N) 

