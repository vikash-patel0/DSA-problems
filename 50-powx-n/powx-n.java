class Solution {
    public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2; // Now n is a safely negatable number.
        }
        if(n<0) {
            x=1/x;
            n=-n;
        }//handles negative numbers
        if(n==0) return 1.0; // stopping condition

        double half= myPow(x,(int)(n/2));  //basically we are dividing the power and then squaring
        if(n%2==0) return half*half; //for even power
        else return half*half*x; //for odd power .. one extra x will be there
    }
}