class Solution {
    public int countDigits(int num) {
        int n=num;
        // original num store in n
        int count=0;
        while(num>0){
          int r=num%10; //   we get last digit
          if(n%r==0){
            count++;
          }
          num/=10;
        }
        return count;
    }
}