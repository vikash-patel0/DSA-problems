class Solution {
    public double myPow(double x, int n) {
        
        if(n<0){
            return 1/divPow(x,n);
        }
        return divPow(x,n);
    }
    static double divPow(double x, long n){
        if(x==0) return 0;
        if(n==0) return 1;
        double half=divPow(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
}