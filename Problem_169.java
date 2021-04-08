class Solution {
    public int majorityElement(int[] nums) {
         int len= nums.length;
         int majority=nums[0];
         int count=1;
         for(int i=1;i<len;i++){
             //System.out.println("hi");
             if(majority!=nums[i]){
                 count--;
                 //majority=nums[i];
             }
             else{
                 count++;
             }
             if(count==0){
                 majority=nums[i];
                 count++;
                 //System.out.println("majority changed to:"+ majority);
             }
         }
        // System.out.println(majority);
        return majority;
    }
}