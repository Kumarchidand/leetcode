// imp** create hashmap to store element with counts,list for return 
// if element is in present in map then add to list
// if not increment value of count in hashmap
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        // Iterate through the array
        for (int num : nums) {
            // Check if the number is already in the hashmap
            if (map.containsKey(num)) {
                // If it's already in the hashmap, it's a duplicate
                duplicates.add(num);
            } else {
                // Otherwise, add it to the hashmap with count 1
                map.put(num, 1);
            }
        }
        return duplicates;
    
    
    }
}
