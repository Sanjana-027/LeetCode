class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
                    
        int count = 0, maxDefence = Integer.MIN_VALUE;

        for (int i = properties.length - 1; i >= 0; i--) {
            if(properties[i][1] < maxDefence)
                count++;
            else		
                maxDefence = properties[i][1];
        }

        return count;  
    }
}

// [[7,7],[1,2],[9,7],[7,3],[3,10],[9,8],[8,10],[4,3],[1,5],[1,5]]

// [[1, 5], [1, 5], [1, 2], [3, 10], [4, 3], [7, 7], [7, 3], [8, 10], [9, 8], [9, 7]]


