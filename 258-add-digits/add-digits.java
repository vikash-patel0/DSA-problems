class Solution {
    public int addDigits(int num) {
        if(num%10==num) return num;
        num=add(num);
        return addDigits(num);
    }
    static int add(int num){
        if(num==0) return 0;
        return num%10+add(num/10);
    }
}