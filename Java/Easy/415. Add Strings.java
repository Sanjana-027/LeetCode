class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder res = new StringBuilder();
        while(i >= 0 || j >= 0 || carry != 0){
            if (i >= 0)
                carry += num1.charAt(i--) - '0';
            if (j >= 0)
                carry += num2.charAt(j--) - '0';
            res.insert(0, carry % 10);
            carry /= 10;
        }
        return res.toString();
    }
}
