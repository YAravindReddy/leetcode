public void rotate(int[] nums, int k) {
        int len= nums.length;
        int local= k%len;
        while(local>0){
            nums= rot(nums);
            local--;
        }
        System.out.println(nums);
        
    }
    public static int[] rot(int[] nums){
        int len= nums.length;
        int temp= nums[len-1];
        for(int i=len-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=temp;
        return nums;
    }