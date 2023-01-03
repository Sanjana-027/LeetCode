class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i)  > strs[j + 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        } 

        return count;
    }
}


// class Solution {
//     public int minDeletionSize(String[] strs) {
//         int count = 0;
//         for (int i = 0; i < strs[0].length(); i++) {
//             for (int j = 0; j < strs.length - 1; j++) {
//                 if (Character.compare(strs[j].charAt(i), strs[j + 1].charAt(i)) > 0) {
//                     count++;
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }
