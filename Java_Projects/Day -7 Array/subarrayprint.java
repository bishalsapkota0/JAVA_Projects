public class subarrayprint {
    public static void fun(int arr[]){
        int start;
        int end;
        for(int i = 0 ; i<arr.length;i++)
        {
            start = i;
            for(int j = i ; j<arr.length;j++)
            {
                end = j;
                for(int k = start ;k<=end; k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        fun(arr);

    }
}
