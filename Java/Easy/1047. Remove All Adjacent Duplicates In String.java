    class Solution {
        public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while(i < sb.length() - 1) {
            if(sb.charAt(i) == (sb.charAt(i + 1))) {
                sb.delete(i, i + 2);

                if(i > 0)
                    i -= 1;              
             }
             else {
                i++;
            }
        }
            return sb.toString();
        }
}
