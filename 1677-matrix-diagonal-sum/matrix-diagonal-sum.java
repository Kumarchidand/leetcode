class Solution {
    public int diagonalSum(int[][] mat) {
        int res=0;
        int n=mat.length;
        int mid=n/2;
        for(int i=0;i<n;i++){
            res+=mat[i][i]+mat[i][n-1-i];
        }
        if(n%2==1){
            res-=mat[mid][mid];
        }
        return res;
    }
}