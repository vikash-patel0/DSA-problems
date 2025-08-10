class Solution {
    public boolean isPowerOfTwo(int n) {
    if(n<=0){
        return false;
    }
    return (n & (n-1))==0;
    }
}
// firstly n will always be positive
// n =8 1000
// n-1 = 7  0111
// if n is power of two then & between n and n-1 should be zero
// because  n and n-1 will never overlap both will be just opposite



// logn=xlog2

//2
//3,5,7
//divided by 2.. but not divided by composite numbers

//2^0 =1        000001
//2^1 = 2       000010
//2^2 = 4       000100
//2^3 = 8       001000
//2^4 = 16      010000
//2^5 = 32      100000