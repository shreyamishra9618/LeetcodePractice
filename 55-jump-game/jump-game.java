class Solution {
    public boolean canJump(int[] nums) {
        int goodlastpos = nums.length -1;
        for(int i =  nums.length -1; i >=0; i--){
            if(i+ nums[i] >=  goodlastpos){
                goodlastpos = i;
            }
        }
       return goodlastpos == 0;
    }
}

// [23114]
// g = 4
// i= 4, nums[i]= 4
// 8 >= 4
// g =4
// i--
// i =3, nums[i] = 1
// 4>= 4
// g= 3
// i--
// i =2, nums[i] =1
// 3 >= 3
// g = 2
// i--;
// i =1 nums[i] = 3
// 4 >= 2
// g = 1
// i--
// i =0; nums[i] =2
// 2 >= 1
// g = 0
