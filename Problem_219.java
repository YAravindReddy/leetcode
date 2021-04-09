class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hash_map= new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int cur= nums[i];
           if(hash_map.containsKey(nums[i]) && i- hash_map.get(cur)<=k){
               return true;
           }
           else{
               hash_map.put(cur,i);
           }
    }
       return false;   
    }
}