class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even =0 , odd = 1;
        
        int[] arr = new int[nums.length];
        
        for(int num : nums){
            if( num % 2 == 0){
               arr[even] = num;
                even += 2;
            }
            else{
                arr[odd] = num;
                odd += 2;
            }
        }
        return arr;
    }
}
