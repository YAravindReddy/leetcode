class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int j=0;
        for(int i=0;i<len;i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        
        while(target>nums[j]){
                    
                    if(j== len-1){
                        return j+1;
                    }
                   j++;
                }



        return j;
    }
}