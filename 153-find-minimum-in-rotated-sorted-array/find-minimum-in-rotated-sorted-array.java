// to find the minimum element always present in unsorted part,so leave the sorted part
class Solution {
    public int findMin(int[] nums) {
        // if length is 1 return first index
        if(nums.length==1){
            return nums[0];
        }
        // if array is already sorted
        else if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        // apply binary search
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid!=0 && nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            else if(mid!=nums.length-1 && nums[mid]>nums[mid+1]){              return nums[mid+1];

            }
            // now find sorted part
            else if(nums[start]<=nums[mid]){
                start=mid+1;
                // left part is sorted
            }
            else{
                end=mid-1;
                // right part is sorted(then discard it)
            }
        }
        return -1;
    }
}