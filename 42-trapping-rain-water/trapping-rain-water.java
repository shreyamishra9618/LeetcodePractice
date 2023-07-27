class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left =0;
        int right = n-1;
        int leftBar = height[0];
        int rightBar = height[n-1];
        int ans =0;
        while(left <= right){
            if(leftBar < rightBar){
                if(height[left] >leftBar){
                    leftBar = height[left];
                }
                else{
                    ans += leftBar - height[left];
                    left++;
                }

            }
            else{
             if(height[right] > rightBar){
                 rightBar = height[right];
             }
             else{
                 ans += rightBar - height[right];
                 right--;
             }


            }
        }

        return ans;
    }
}