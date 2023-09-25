public class binaryToDecimal {
    public static void answer(int binNum)
    {
        int pow =0;
        int decimal = 0 ;
    
        while (binNum>0) {
            int remainder = binNum%10;
            decimal = decimal +(remainder * (int)Math.pow(2,pow));
            binNum = binNum/10;
            pow ++;
        }
             System.out.println(decimal);
    }
    public static void main(String[] args) {
    int input = 1111;
    answer(input);
    }
    
}      
//       eg .       4 + 1*2^3  // here 4 is came from same way 0 +1*xyz
//decimal num = decimal num + lastdigit* 2^x