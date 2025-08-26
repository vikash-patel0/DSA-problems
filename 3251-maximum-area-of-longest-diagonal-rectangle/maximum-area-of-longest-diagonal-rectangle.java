class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=-1;
        int x=0;
        int size=0;
        int maxArea=0;
        for(int i=0;i<dimensions.length;i++){
            double a=Math.pow(dimensions[i][0],2)+Math.pow(dimensions[i][1],2);
            double b=Math.sqrt(a);
            int area=dimensions[i][0]*dimensions[i][1];
            if(Math.abs(max - b) < 1e-9){
                maxArea = Math.max(maxArea, area);
            }
            if(max<b){
                max= b;
                maxArea=area;
            }
        }
        return maxArea;
    }
}