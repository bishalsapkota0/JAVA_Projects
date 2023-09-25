public class product {
    public static int product(int a , int b ){
        int ans = a*b;
        return ans;
    }
    public static void main(String[] args) {
        int final_ans = product(3,4); //call by value means pass the copy of a and b not the orginal and b
        //means a and b in main function remain unchanged
        System.out.println(final_ans);
    }
}
