class Solution {
    public int maximumWealth(int[][] accounts) {
     int maxWealth = Integer.MIN_VALUE;
        for (int[] customer: accounts) {
            int customerWealth = 0;
            for (int bank = 0; bank < customer.length; bank++) {
                customerWealth += customer[bank];
                if (customer.length - 1 == bank && customerWealth > maxWealth)
                    maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }
}
