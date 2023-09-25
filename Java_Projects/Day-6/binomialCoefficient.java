public class binomialCoefficient {
    public static int factorial(int n ) {
        if(n<=0)
        {
            return 1;
        }
        int facto=1;
        for(int i = 1; i<=n ; i++)
        {
            facto = facto *i;
        }
        return facto; 
    }
    public static int binCoef(int n ,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoef = fact_n/(fact_r*fact_nmr);
        return binCoef;
    }
    public static void main(String[] args) {
        int ans = binCoef(5, 2);
        System.out.println(ans);
    }
}
