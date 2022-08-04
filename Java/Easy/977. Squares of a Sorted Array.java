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


// 2nd Approach

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, end = n - 1, start = 0;
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++) {
            if(Math.abs(nums[start]) > nums[end]) {
                ans[n - 1 - i] = nums[start] * nums[start];
                start++;
            }
            else ans[n - 1 - i] = nums[end] * nums[end--];
        }
        return ans;
    }
}

// 3rd Approach

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, end = n - 1, start = 0;
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++) {
            
            ans[n - 1 - i] = (Math.abs(nums[start]) > nums[end]) ?  nums[start] * nums[start++] :  nums[end] * nums[end--];
          
        }
        return ans;
    }
}

