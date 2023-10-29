class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans =new ArrayList<>();
        int carry=0; // always initialize as zero
        int p=num.length-1; 
        while(p>=0 || k>0){
            int numVal=0;
            if(p>=0){
                numVal=num[p];
            }
            int d=k%10;
            int sum=numVal+d+carry;
            int digit=sum%10;
            carry = sum/10;
            // add digits into list 
            ans.add(digit);
            p--;
            k=k/10;
        }
        if(carry>0){
            ans.add (carry);
            // adding carrt elements into list
        }
        Collections.reverse(ans);
        // reverse the list value 
        return ans;
    }
}