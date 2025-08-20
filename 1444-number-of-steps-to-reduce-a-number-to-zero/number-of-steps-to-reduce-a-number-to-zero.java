class Solution {
    public int numberOfSteps(int num) {
        return steps(num,0);
    }
    static int steps(int num,int count){
        if(num==0) return count;
        if(num%2==0) num/=2;
        else num-=1;
        return steps(num,++count);
    }
}