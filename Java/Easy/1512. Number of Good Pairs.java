class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]) count++;
            }
        }
        
        return count;
    }
}
// TC = n2

// 2nd Approach

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for(int i:nums)
        {
            int friendCount = hm.getOrDefault(i,0);
            ans+=friendCount;
            
            hm.put(i,friendCount+1);
        }
        
        
        return ans;
    }
}

// 1, 1, 1 , 1
//  1 --> 4
//  ans = 1 + 2 + 3   
    
    
