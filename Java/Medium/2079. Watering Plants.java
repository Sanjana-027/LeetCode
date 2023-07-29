class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int countSum = 0;
        int backupCapacity = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] > capacity) {
                capacity = backupCapacity;
                countSum += i + i;
            }
            capacity -= plants[i];
            countSum++;
        }
        return countSum;
    }
}
