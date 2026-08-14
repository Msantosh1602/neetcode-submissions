class Solution {
    public int maxProfit(int[] prices) {
        int b=Integer.MAX_VALUE,pr=0;
        for(int p:prices){
            b=Math.min(b,p);
            pr=Math.max(pr,p-b);
        }
        return pr>0?pr:0;
    }
}
