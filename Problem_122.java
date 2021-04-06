class Solution {
    public int maxProfit(int[] prices) {
         int min= Integer.MAX_VALUE;
        int max_Profit=0;
        int count=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(count==0){
                max_Profit=Math.max(max_Profit, prices[i]-min);
                //System.out.println(max_Profit);
                min=prices[i];
                count++;
            }
            else{
                //System.out.println(max_Profit + " "+min +" "+prices[i] );
                max_Profit +=prices[i]-min;
                min=prices[i];

            }
        }
        return max_Profit;
    }
}