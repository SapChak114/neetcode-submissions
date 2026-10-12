class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0, r = n - 1, ans = 0;

        while (l < r) {
            int min = Math.min(heights[l], heights[r]);
            
            ans = Math.max(ans, min * (r-l));
            
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return ans;
    }
}
