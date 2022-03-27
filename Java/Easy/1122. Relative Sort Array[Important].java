class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int n : arr1) 
            count[n]++;
        
        int i = 0;
        for(int n : arr2) {
            while(count[n]-- > 0) {
                arr1[i++] = n;
            }
        }
            
        for(int n = 0; n < count.length; n++) {
            while(count[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }
}



// 2nd Approach

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int index = 0;
        int[] ans = new int[arr1.length];
        
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]) {
                    ans[index++] = arr1[j];
                    arr1[j] = 1001;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1001)
                break;
            ans[index++] = arr1[i];
        }
        
         return ans;
    } 
} 
