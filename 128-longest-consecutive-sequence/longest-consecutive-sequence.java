class Solution {
    public int longestConsecutive(int[] nums) {
        // create HashMap
        HashMap<Integer,Boolean> hm=new HashMap<>();
        // traversing all element with initialize with false
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],false);
        }
        // deduced key value where it is false decalred as true
        for(int key:hm.keySet()){
            if(hm.containsKey(key-1)==false){
                hm.put(key,true);
            }
        }
        int max=0;
        for(int key:hm.keySet()){
            int k=1;
            if(hm.get(key)==true){
                while(hm.containsKey(key+k)==true){
                    k++;
                }
            }
            max=Math.max(max,k);
        }
        return max;
    }
}