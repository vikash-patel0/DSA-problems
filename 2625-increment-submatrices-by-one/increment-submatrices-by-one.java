class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];
        for(int i=0;i<queries.length;i++){
            int r1=queries[i][0];
            int c1=queries[i][1];
            int r2=queries[i][2];
            int c2=queries[i][3];
            for(int j=r1;j<=r2;j++){
                mat[j][c1]++;
                if(c2+1<n){
                    mat[j][c2+1]--;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=1;j<mat[i].length;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        return mat;
    }
}

//learned the approach