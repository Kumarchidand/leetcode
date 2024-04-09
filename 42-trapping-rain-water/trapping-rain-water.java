class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];
        int max=0;int total=0;
        for(int i=0;i<n;i++){
           max=Math.max(max,height[i]);
           leftMax[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
          max=Math.max(max,height[i]);
          rightMax[i]=max;
        }
        for(int i=0;i<n;i++){
        int  water=Math.min(leftMax[i],rightMax[i])-height[i];
          total=total+water;
        }
        return total;
    }
}