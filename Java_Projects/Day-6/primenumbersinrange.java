public class primenumbersinrange {
    public static boolean isPrime(int num){
        if(num==2)
        return true;
        for(int i = 2; i<=num-1;i++)
        {
            if (num%i==0) {
                return false;    
            }
        }
        return true;
    }
    public static void finalans(int n)
    {
        for (int index = 0; index < n; index++) {
            if(isPrime(index))
            {
                System.out.println(index);
            }   
        }

    }
    public static void main(String[] args) {
       int n = 100;
       finalans(n) ;
    }
    
}
