class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];
        
         for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }
        
        for(boolean existLetter : letters) {
            if(!existLetter) 
                return false;
        }
        
        return true;
    }
}
