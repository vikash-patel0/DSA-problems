class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        prefix= new int[n+1][m+1];

        for(int i=1;i<n+1;i++){
            int sum=0;
            for(int j=1;j<m+1;j++){
                    sum+=matrix[i-1][j-1];
                    prefix[i][j]=sum+prefix[i-1][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix[row2+1][col2+1]
            -prefix[row2+1][col1]
            -prefix[row1][col2+1]
            +prefix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */