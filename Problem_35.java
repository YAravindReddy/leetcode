class Solution {
    public int searchInsert(int[] nums, int target) {
        //int len=nums.length;
        int j=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        
        while(target>nums[j]){
                    
                    if(j== nums.length-1){
                        return j+1;
                    }
                   j++;
                }
         return j;
    }
}