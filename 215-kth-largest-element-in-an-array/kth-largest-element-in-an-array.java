class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue <Integer> pq=new PriorityQueue<>();
    //    for(int i=0;i<nums.length;i++){
    //        if(pq.size()<k){
    //            pq.add(nums[i]);
    //        }
    //        else if(pq.peek()<nums[i]){
    //            pq.remove();
    //            pq.add(nums[i]);
    //        }
    //    }
    //    return pq.peek();
     
     int i=0;
     while(i<k){
        pq.add(nums[i]);
        i++;
     }
     while(i<nums.length){
        if(nums[i]>pq.peek()){
            pq.remove();
            pq.add(nums[i]);
        }else{}
        i++;
     }
     return pq.remove();
    }
}