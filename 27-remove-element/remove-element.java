// store in ptr
// check val != nums,then store nums[ptr]=nums[val]
// inc. ptr ,after that return ptr;
  
class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr=0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]!=val){
            nums[ptr]=nums[i];
            ptr++;
        }
        }
      
    return ptr;
    }
}