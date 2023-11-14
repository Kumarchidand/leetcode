class Solution {
    public void sortColors(int[] nums) {
       int low=0;
       int mid=0;
       int high=nums.length-1;
       while(mid<=high){
           if(nums[mid]==0){
            //    if mid=0,swap(l,m) l++ ,m++
               swap(nums,low,mid);
               low++;
               mid++;
           }
           else if(nums[mid]==1){
               mid++;
           }
           else{
            //    mid==2
               swap(nums,high,mid);
               high--;
           }
       }
    }
    public void swap(int [] nums,int i,int j){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }
}