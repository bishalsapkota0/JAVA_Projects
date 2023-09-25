public class decimalToBinary {
    public static int binToDec(int n){
             int pow = 0;
             int binNum = 0;
             while(n>0)
             {
                int rem = n%2;
                binNum = binNum+ (int)Math.pow(10,pow);
                pow ++;
                n= n/2;
             }


            return binNum;

    }
    public static void main(String[] args) {
        int ans = binToDec(100);
        System.out.println(ans);
    }
}
