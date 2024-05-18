class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        // 0 to n-1 arr
        reverse(nums,0,k-1);
        // 0 to k-1 term
        reverse(nums,k,n-1);
        // k to remaining
      
    }
    public static void reverse(int nums[],int st,int end){
        while(st<end){
         int temp=nums[st];
         nums[st]=nums[end];
         nums[end]=temp;
         st++;
         end--;
        }
    }
}