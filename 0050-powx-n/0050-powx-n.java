class Solution {
    public double myPow(double x, int n) {

        //return binaryExp(x, (long) n);
        if(n == 0) {
            return 1;
        }
        if(n ==1 ) {
            return x;
        }
        long nn = n;
        double sum = 1;
        if (nn < 0) {
           nn = -nn;
        }
        while(nn > 0) {
            if(nn % 2 == 0) {
                x = x*x;
                nn = nn/2;
            }
            else {
              sum = sum *x;
              nn--;
            }
        }
        if(n <0) {
            sum = 1.0/sum;
        }
       return sum;





    }
/*
    private double binaryExp(double x, long n) {
        if (n == 0) {
            return 1;
        }
       
        if (n < 0) {
            return 1.0 / binaryExp(x, -n);
        }
       
        if (n % 2 == 1) {
            return x * binaryExp(x * x, (n - 1) / 2);
        } else {
            return binaryExp(x * x, n / 2);
        }
        
    }
    */
}