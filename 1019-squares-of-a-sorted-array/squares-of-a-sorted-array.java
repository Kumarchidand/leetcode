class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int s=0;
        int e=nums.length-1;
        int ptr=ans.length-1;
        while(s<=e){
            int st=nums[s]*nums[s];
            int en=nums[e]*nums[e];
            if(st<en){
                ans[ptr]=en;
                e--;
            }
            else{
                ans[ptr]=st;
                s++;
            }
            ptr--;
        }
        return ans;
    }
}