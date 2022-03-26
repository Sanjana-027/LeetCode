// 2 Approach


class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        for(String sentence : sentences){
            int lengthOfSentence = sentence.split(" ").length;
            // for (String elem : sentence.split(" ")) {
            //     count++;
            // }
            if(lengthOfSentence > max){
                max = lengthOfSentence;
            }
        }
        return max;
    }
}
