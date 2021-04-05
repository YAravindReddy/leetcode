import java.util.ArrayList;
class Solution {
    public static int removeDuplicates(int[] nums) {
        int x= nums.length;
if (x == 0) return 0;
    int i = 0;
    for (int j = 1; j < x; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
   
}
}