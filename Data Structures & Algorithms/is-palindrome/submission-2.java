class Solution {
    public boolean isPalindrome(String s) {

        int len=s.length()-1;
        int f=0;
        while(f<len){
            while(f<len && !Character.isLetterOrDigit(s.charAt(f))){
                f++;
            }
            while(f<len && !Character.isLetterOrDigit(s.charAt(len))){
                len--;
            }
        if(Character.toLowerCase(s.charAt(f))!=Character.toLowerCase(s.charAt(len))){
            return false;
        }
        f++;
        len--;
        }
    return true;
        
    }
}
