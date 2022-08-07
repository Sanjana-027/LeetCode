class Solution {
    public int longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, count = 0;
        boolean flag = false;
        while (i < s.length()) {
            if(i != s.length() - 1 &&  arr[i] == arr[i + 1]) {
                i += 2;
                count += 2; 
            }
            else {
                i++;
                flag = true;
            }
        }

        if(flag) return count + 1; 
        return count;
    }
}


//Better Approach

class Solution {
    public int longestPalindrome(String s) {
       
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count * 2 + 1;
        return count * 2;
    }
}
// 3rd Approach

class Solution {
    public int longestPalindrome(String s) {
        int len = s.length();
        int size = 128;
        int[] counts = new int[size];
        for (int i = 0; i < len; i++) {
            counts[s.charAt(i)]++;
        }

        int result = 0;
        for (int i = 0, bound = size; i < size; i++) {
            result += (counts[i] / 2 * 2);
        }
        return result == len? result: result + 1;
        
    }
}

