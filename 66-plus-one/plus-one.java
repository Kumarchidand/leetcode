class Solution {
    public int[] plusOne(int[] digits) {
       
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
             // if num is less than 9,inc. the  digit value 
             if(digits[i]<9){
               digits[i]++;
               return digits;
             }
            //  if not
             digits[i]=0;
        }
        // if there is one element i.e 9 then inc its arrlength and assign the oth index to to one
        int[] numarr=new int [n+1];
           numarr[0]=1;
           return numarr;
    }
}