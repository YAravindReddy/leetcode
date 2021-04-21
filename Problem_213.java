class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] sub1= Arrays.copyOfRange(nums, 0, nums.length-1); // subArray(nums, 0, nums.length-2);
        int[] sub2=  Arrays.copyOfRange(nums, 1, nums.length); // subArray(nums,1,nums.length-1);
        int x= sub(sub1);
        //System.out.println(x);
        int y= sub(sub2);
        //System.out.println(y);
        return Math.max(x,y);
    }
    public int sub(int[] arr){
        int[] dp= new int[arr.length+1];
        dp[0]=0;
        dp[1]= arr[0];
        for(int i=1;i<arr.length;i++){
            dp[i+1]= Math.max(dp[i],dp[i-1]+arr[i]);
        }
        return dp[arr.length];
    }
}