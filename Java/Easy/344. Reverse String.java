class Solution {
    public void reverseString(char[] s) {
        reverseRecursion(s, 0);
    }
    
    private void reverseRecursion(char[] s, int index){
        if(index == s.length) {
            return;
        }
        char temp = s[index];
        reverseRecursion(s, index + 1);
        s[s.length - 1  - index] = temp;
        
    }
}
