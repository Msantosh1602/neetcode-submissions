class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left=0, maxL=0,ans=0;
        int[] chars = new int[26];
        for(int i=0;i<n;i++){
            chars[s.charAt(i)-'A']++;
            maxL=Math.max(maxL,chars[s.charAt(i)-'A']);
            int windowLength=i-left+1;
            int rep = windowLength-maxL;
            while(rep>k){
                chars[s.charAt(left)-'A']--;
                left++;
                windowLength=i-left+1;
                rep = windowLength-maxL;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}
