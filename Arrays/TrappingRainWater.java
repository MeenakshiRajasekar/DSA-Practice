Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105

  -------------------------------------------------------------------------------------------------------------------------------
  class Solution {
    public int trap(int[] height) {
        //using two pointers
        int n = height.length;
        int p1=0;
        int p2=n-1;
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;
        int ans =0;
        while(p1<=p2){
            lmax= Math.max(lmax, height[p1]);
            rmax = Math.max(rmax, height[p2]);
            ans+= (lmax<rmax) ? lmax-height[p1++] : rmax-height[p2--];
        }
        return ans;
    }
}
