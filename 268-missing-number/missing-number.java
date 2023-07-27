
class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0)
            return 0;

        int len = nums.length;
        Arrays.sort(nums);

        // Handling the case where 0 is missing
        if (nums[0] != 0)
            return 0;

        for (int i = 1; i < len; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        // If no missing number is found, the missing number is len
        return len;
    }
}
