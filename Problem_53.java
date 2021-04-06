class Solution {
    public int maxSubArray(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
        int c_sum=0;
        for(int i=0;i < nums.length;i++){
            arr.add(nums[i]);
        }
        
        int max_sum= arr.get(0);
        int current_sum;
        int len= arr.size();
        int ran=0;
        int previous_value=arr.get(0);
        for(int i=1;i<len;i++){

            c_sum= previous_value+arr.get(i);
            int curr= arr.get(i);
            current_sum= Math.max(curr,c_sum);
            
            if(c_sum>=curr) {
                if(current_sum>max_sum) {
                    max_sum = current_sum;
                }
                previous_value+=curr;
                
            }
            else if(curr>c_sum)
            {
                if(current_sum>max_sum){
                max_sum=current_sum;}
                previous_value=curr;
               
            }
            else{
                
            }
        }
        return max_sum;
    }
}