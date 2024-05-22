class Solution {
    public int findDuplicate(int[] nums) {
     Arrays.sort(nums);
       int dup=0;
        // loop go to nums.length beacuse i+1 is used otherwise if only n  it gives index out of bound exception
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                 dup=nums[i];
            }
        }  
        return dup;     
    }
}