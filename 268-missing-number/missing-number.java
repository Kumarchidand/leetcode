class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actualSum=n*(n+1)/2;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
        }
        int res=actualSum-currSum;
        return res;
    }
}