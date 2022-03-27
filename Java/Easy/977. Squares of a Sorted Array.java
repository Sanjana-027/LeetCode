class Solution {
    public int[] sortedSquares(int[] nums) {
      
        int i = 0;
        int[] arr = new int[nums.length];
        
        for(int num : nums){
            arr[i] = (int)Math.pow(num, 2);
            i++;
        }
      Arrays.sort(arr);

        return arr;
    }
}
