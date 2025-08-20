
class Solution {
    int sum=0;
    public int reverse(int x) {
        int digit = x % 10;
        // Check for positive overflow
        if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && digit > 7)) {
            sum = 0; 
            return 0;
        }
        // Check for negative overflow
        if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && digit < -8)) {
            sum = 0;
            return 0;
        }
        sum=sum*10+(x%10);
        x=x/10;
        if(x==0){
            int sum2=sum;
            sum=0;
            return sum2;
        }
        return reverse(x);
    }
}

