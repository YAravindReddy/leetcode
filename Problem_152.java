class Solution {
    public int maxProduct(int[] nums) {
        int max_product=nums[0];
        int local_pproduct=nums[0];
        int local_nproduct= nums[0];
       // int j=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<0){
                int t1=local_pproduct;
                int t2=local_nproduct;
                local_pproduct= Math.max(nums[i], t2*nums[i]);
                local_nproduct=Math.min(nums[i],t1*nums[i]);
            }
            else{
                local_pproduct=Math.max(nums[i],local_pproduct*nums[i]);
                local_nproduct= Math.min(nums[i], local_nproduct*nums[i]);
            }
            max_product=Math.max(local_pproduct,max_product);
               // System.out.println("i is :" + i);
            }
            return max_product;
    }
}