public class InsertionAgainAgain {
    public static void funn(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {  // Fix: decrement j in each iteration
                int temp;
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");  // Fix: add space between numbers
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 4};
        funn(arr);
    }
}
    

