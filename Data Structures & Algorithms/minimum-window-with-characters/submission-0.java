class Solution {
    public String minWindow(String s, String t) {
        int[] req=new int[128];
        int[] window=new int[128];
        int reqch=0;

        for(char c:t.toCharArray()){
            if(req[c]==0) reqch++;
            req[c]++;
        }

        int left=0,formed=0,minL=Integer.MAX_VALUE, start=0;
        for(int right=0;right<s.length();right++){
            char pres = s.charAt(right);
            window[pres]++;
            if(window[pres]==req[pres]){
                formed++;
            }
            while(formed==reqch){
                if(right-left+1<minL){
                    minL=right-left+1;
                    start=left;
                }
                char leftchar = s.charAt(left);
                window[leftchar]--;
                if(window[leftchar]<req[leftchar]) formed--;
                left++;
            }
        }
        return minL==Integer.MAX_VALUE ? "" : s.substring(start, start+minL);
    }
}