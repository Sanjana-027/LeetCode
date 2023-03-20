class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0) return true;
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) continue;

            if (i == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            else if (i == flowerbed.length - 1  && flowerbed[i - 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            else if (i > 0 && i < flowerbed.length - 1 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        if (n <= 0) return true;
        else return false;
    }
}
