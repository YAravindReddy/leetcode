class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int sum;
        Arrays.sort(nums);
        int diff1= Integer.MAX_VALUE;
     for(int i=0;i<nums.length && diff1 != 0;i++){
         int s=i+1;
         int e=nums.length-1;
         while(s<e){
             sum= nums[i]+nums[s]+nums[e];
             if (Math.abs(target - sum) <Math.abs(diff1)){
                 diff1 = target - sum;
             }
             if(nums[i]+nums[s]+nums[e] <target){ s++;}
             else {e--;}
         }
     }
        int res=target-diff1;
        return res;
    }
}