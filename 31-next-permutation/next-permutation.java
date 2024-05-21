class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int K=n-2;
        // null check
        if(n==0 || nums==null){
            return ;
        }
        // find k
        for(int i=n-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                K--;
            }else{
               break;
            }
        }
        // if k==-1,reverse it
        if(K==-1){
            reverse(nums,0,n-1);
            return ;
        }
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[K]){
                int temp=nums[K];
                nums[K]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse(nums,K+1,n-1);
     }
     void reverse(int[] nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}