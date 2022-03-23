class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indice = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int value = numbers[left] + numbers[right];
            if (value == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                return indice;
            } else if (value > target) {
                right--;
            } else {
                left++;
            }
        }
        return indice;
    }
}
