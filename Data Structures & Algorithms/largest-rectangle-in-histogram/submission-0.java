class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack();
        int max=0;
        for(int i=0;i<=heights.length;i++){
            int currHeight = (i==heights.length) ? 0 : heights[i];
            while(!s.isEmpty() && currHeight<heights[s.peek()]){
                int h = heights[s.pop()];
                int w = s.isEmpty() ? i : i-s.peek()-1;
                max=Math.max(max,h*w);
            }
            s.push(i);
        }
        return max;
    }
}