class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        int profit=0;
        for(int stockprice:prices){
         min=Math.min(stockprice,min);
         profit=stockprice-min;
         max=Math.max(profit,max);
        }
        return max;
    }
}