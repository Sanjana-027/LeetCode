// 2 Approach

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String elem : operations){
           
            x = elem.equals("X++") || elem.equals("++X") ? ++x : --x;
            
          // if(elem.equals("X++") || elem.equals("++X") ){
          //     x++;
          // }
          //   else {
          //       x--;
          //   }
        }
        
        return x;
    }
} 
