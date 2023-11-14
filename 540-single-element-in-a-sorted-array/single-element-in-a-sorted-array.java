class Solution {
    public int singleNonDuplicate(int[] nums) {
        // edge cases
        if(nums.length==1){
            return nums[0];            // if one element return that value
        }else if ( nums[0]!=nums[1]){
            return nums[0];          // 1st element is dissimilar with 2nd one
        }else if ( nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];    // last element is comapre eith previous one
        }
// now apply BS
        int start = 0 ;
        int end = nums.length-1 ;

        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else if ( mid % 2 ==1 ){ // if mid index is odd

                if(nums[mid-1]==nums[mid]){
                    start = mid+1 ;
                }else{
                    end = mid-1 ;
                }
            }else { // if mid index is even
                    if(nums[mid]==nums[mid+1]){
                        start = mid +1 ;
                    }else{
                        end = mid -1 ;
                    }
            }
        }

        return -1 ;
    }
}