class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(original == nums[i]){
                original=original*2;
                i=-1;
                // if we not consider i=-1 then we donot find the element which is present in the array at stating ondex after increment of i vaule
            }
            
        }
        return original;
    }
}