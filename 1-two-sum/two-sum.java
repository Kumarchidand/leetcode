// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//      int ans[] =new int[2];
//       for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                  if(nums[i]  + nums[j] == target)
//                  {
//                      ans[0]=i;
//                      ans[1]=j;
//                  }
//            }
//       }
//       return ans;
//     }
// }
// O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reqno = target - nums[i];
            if (hm.containsKey(reqno)) {
                return new int[] { hm.get(reqno), i };
            }
            hm.put(nums[i], i);
        }
       return null;
    }
}

