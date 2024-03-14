class Solution {
    public int differenceOfSum(int[] nums) {
        int ele_sum=0;
        int digit_sum=0;
        // cal element sum
        for(int i=0;i<nums.length;i++){
            ele_sum=ele_sum+nums[i];
        }
        // cal digit sum
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                digit_sum+=nums[i]%10;
                nums[i]/=10;
            }
        }
        return Math.abs(digit_sum-ele_sum);
    }
}