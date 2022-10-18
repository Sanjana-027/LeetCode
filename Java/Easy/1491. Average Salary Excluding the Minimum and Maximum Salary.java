class Solution {
    public double average(int[] salary) {
        double sum = 0.0;
        int min = Integer.MAX_VALUE, max = 0;
        for (int sal : salary) {
            min = Math.min(min, sal);
            max = Math.max(max, sal);
            sum += sal;
        }
        return (sum - (max + min)) / (salary.length - 2);
    }
}
