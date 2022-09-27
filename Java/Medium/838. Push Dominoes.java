class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder res =  new StringBuilder(dominoes);
        boolean flag = false; 
        int start = -1, end = -1;
        
        for(int i = 0; i < dominoes.length(); i++){
            if (dominoes.charAt(i) == '.') continue;
            
            else if (dominoes.charAt(i) == 'L') {
                end = i - 1;
                if (!flag) {
                    while (end >= 0 && dominoes.charAt(end) == '.') {
                        res.setCharAt(end, 'L');
                        end--;
                    } 
                }
                else {
                    while (start < end) {
                        res.setCharAt(start, 'R');
                        res.setCharAt(end, 'L');
                        start++;
                        end--; 
                    }
                    flag = false;
                }
            }
            else if (dominoes.charAt(i) == 'R') {
                if (flag) {
                    while (start < i) {
                        res.setCharAt(start, 'R');
                        start++;
                    }
                }
                start = i + 1;
                flag = true;     
            }
        }
        if(flag) {
            while (start < dominoes.length()) {
                res.setCharAt(start, 'R');
                start++;
            }
        }
        
        return res.toString();
        
    } 
}

// if(.) == skip

// if()L 
//     if flag = false
//     for(left L)
        
//    if flag = true 
//         start end
        
//         flag = flase
        
    
    
//  . . R . . . L . . R. . 
 
 
//  if R == start, flag = true
