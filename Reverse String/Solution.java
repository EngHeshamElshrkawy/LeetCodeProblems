class Solution {
    public void reverseString(char[] s) {
        char c;
        for(int i = 0; i < Math.floorDiv(s.length, 2); i++){
            c = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c;
        }        
    }
}