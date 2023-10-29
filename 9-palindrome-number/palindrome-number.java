class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int r;
        int reverse=0;
        if(x<0){
            return false;
        }
        while(x>0){
            r=x%10;
            reverse=reverse*10+r;
            x=x/10;
        }
        if(reverse==temp){
            return true;
        }
        else{
            return false;
        }
    }
}