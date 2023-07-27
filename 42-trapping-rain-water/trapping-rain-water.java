class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n -1;
        int ans =0;
        int leftbar = height[0];
        int rightbar = height [n-1];
        while(left <= right){
            if(leftbar < rightbar ){
                if (height[left] > leftbar){
                    leftbar = height[left];
                }
                else{
                    ans += leftbar - height[left];
                    left++;
                }
            }
            else{
                if (height[right] > rightbar){
                    rightbar = height[right];
                }
                else{
                    ans += rightbar - height[right];
                    right--;
                }
            }
        }
      return ans;
        
    }
}