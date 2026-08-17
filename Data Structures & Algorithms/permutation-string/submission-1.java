class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int count = s1.length();
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        if(count>s2.length()) return false;
        for(int i=0;i<count;i++){
            c1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<count;i++){
            c2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(c1,c2)) return true;

        for(int right=count;right<s2.length();right++){
            int left=right-count;
            c2[s2.charAt(left)-'a']--;
            c2[s2.charAt(right)-'a']++;
            if(Arrays.equals(c1,c2)) return true;
        }
        return false;
    }
}