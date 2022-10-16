// class Solution {
//     public int compress(char[] chars) {
        
//         int count = 0;
//         int start = 1;
//         char temp = chars[0];
        
//         for (int i = 0; i < chars.length; i++) {
//             if (chars[i] == temp) {
//                 count++;
//             }
//             else {
//                 if (count != 1){
//                 for (char c : Integer.toString(count).toCharArray()) 
//                     chars[start++] = c;
//                 }
//                 chars[start] = chars[i];
//                 start++;
//                 count = 1;
//                 temp = chars[i];
                    
                
//             }
//         }
//         if (count != 1){
//             for (char c : Integer.toString(count).toCharArray()) 
//                 chars[start++] = c;
            
//         }
        
//         return start;
        
//     }
// }

// 2nd Way

class Solution {
    public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray()) 
                    chars[indexAns++] = c;
        }
        return indexAns;
    }   
}
