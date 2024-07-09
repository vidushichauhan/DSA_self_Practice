class Solution {
    public int maxProfit(int[] prices) {
        int j=0;
        int max=Integer.MIN_VALUE;
        int min=0;
        if(prices.length== 0 || prices.length== 1){return 0;}
        for(int i =0;i<prices.length;i++){
            if(prices[i]<prices[min]){min=i;j=i;}
            else if(prices[i]-prices[min]>max){
                max = prices[i]-prices[min];
            }
        }
return max;
    }
}