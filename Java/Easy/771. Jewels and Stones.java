class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        for(char jewel : jewels.toCharArray()) {
            for(char stone : stones.toCharArray()){
                if(jewel == stone) {
                    count++;
                } 
            }
           
        }
        return count;
    }
}
