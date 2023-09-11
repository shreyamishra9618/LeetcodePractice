class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int [nums.length];
        int product =1;
        for(int i =0; i < nums.length; i++){
            result[i] = product;
            product *= nums[i];
        }
        product =1;
        for(int j = nums.length -1; j >=0; j--){
            result[j] *= product;
            product *= nums[j];
        }
        return result;
    }
}