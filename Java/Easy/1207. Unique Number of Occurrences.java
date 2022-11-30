class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                count++;
            }
            else {
                if (!hs.add(count))
                  return false;
                temp = arr[i];
                count = 1;
            }            
        }
        if (!hs.add(count))
        return false;

        return true;
    }
}
// 1 1 1 2 2 3
