class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        
        for (int i = 0; i < spells.length; i++) {
            int start = 0, end = potions.length - 1;
            while(start < end) {
                int mid = start + (end - start) / 2;
                
                long pro = (long)potions[mid] * spells[i];
                if (pro >= success) {
                    end = mid;
                    
                }
                else {
                    start = mid + 1;
                }
            }
            if (start == potions.length - 1 && (long)potions[start] * spells[i] < success) {
                    start = start + 1;
            }
            res[i] = potions.length - start;
            
        }
        return res;
    }
}
// s<e

// s   m   e
// 1 2 3 4 5
    
// s m e
// 1 2 3 4 5
    
// m
// s e
// 1 2 3 4 5
  
//   e
//   s
// 1 2 3 4 5
    
    
// s   m   e
// 1 2 3 4 5
    
// s m e
// 1 2 3 4 5

//   m  
//   s e
// 1 2 3 4 5
    
    
//     s
//     e
// 1 2 3 4 5
    
    
    
// s   m   e
// 1 2 3 4 5 
    
//       m
//       s e
// 1 2 3 4 5  
    
//         
//         s
//         e
// 1 2 3 4 5 
    
    // s<=e
