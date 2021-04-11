class Solution {
    public int missingNumber(int[] nums) {
     int l=nums.length;
      int sum= l*(l+1)/2;
        int l_sum=0;
       for(int n : nums) l_sum+=n;
        return sum-l_sum;
    }
}