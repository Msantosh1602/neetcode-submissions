class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        for(int i=n-1;i>=0;i--){
            int j=i+1;
            while(j<n && temperatures[i]>=temperatures[j]){
                if(ans[j]==0){
                    j=n;
                    break;
                }
                j+=ans[j];
            }
            if(j<n){
                ans[i]=j-i;
            }
        }
        return ans;
    }
}
