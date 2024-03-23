// imp**
class Solution {
    public int maxSubArray(int[] nums) {
        // int currsum=nums[0];
        // int max=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(currsum+nums[i] > nums[i]){
        //         currsum+=nums[i];
        //     }else{
        //     currsum=nums[i];
        //     }
        //     max=Math.max(max,currsum);
        // }
        //   return max;
         int sum=0;
         int maxi=nums[0];
         for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
         }
         return maxi;
    }
}