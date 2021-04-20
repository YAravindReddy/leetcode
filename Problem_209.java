class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min_len=Integer.MAX_VALUE;
        int left=0;
        int l_min;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        if(sum1<target) return 0;
        else{
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                l_min= i+1-left;
                min_len=(l_min<min_len) ? l_min: min_len;
                sum-=nums[left];
                left++;
            }
        }
        }
       // if(sum<target) return 0;
        return min_len;
    }
}