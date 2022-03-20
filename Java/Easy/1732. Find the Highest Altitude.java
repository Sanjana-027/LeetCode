class Solution {
    public int largestAltitude(int[] gain) {
       
         int altitudes = 0, highestAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitudes += gain[i];
            if (highestAltitude < altitudes)
                highestAltitude = altitudes;
        }
        return highestAltitude;
    }
}
