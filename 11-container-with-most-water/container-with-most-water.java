class Solution {
    public int maxArea(int[] height) {
    //    start and last idx
        int st=0;
        int lt=height.length-1;
           int max=0;
           while(st<lt){
               // store the value st and lt of the height in variable;
        int lh=height[st];
        int rh=height[lt];
     
        int min_h=Math.min(lh,rh);
        int len=lt-st;
        int curr_area=len*min_h;
        max=Math.max(max,curr_area);
        // which value has min height then inc. that pointer

        if(lh<rh){
            st++;
        }
        else{
            lt--;
        }
           }
          return max;
    }
  
}