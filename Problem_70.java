class Solution {
    public int climbStairs(int n) {
       if(n==0 || n==1){
           return 1;
       }
       int[] nums= new int[n+1];
       nums[0]=1;
       nums[1]=1;
       int len=nums.length;
       for(int i=2;i<len;i++){
           nums[i]=nums[i-1]+nums[i-2];
       }
       return nums[n];
    }
}