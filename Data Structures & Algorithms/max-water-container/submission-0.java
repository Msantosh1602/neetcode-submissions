class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max=0,area=0;
        while(left<right){
            area=(right-left)*Math.min(heights[left],heights[right]);
            max=Math.max(max,area);
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return max;
    }
}
