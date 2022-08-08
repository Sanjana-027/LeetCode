class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, lenA = a.length(), lenB = b.length();
        for (int i = 0; i < lenA || i < lenB; i++) {
            int ia = (i < lenA) ? a.charAt(lenA - 1 - i) - '0' : 0;
            int ib = (i < lenB) ? b.charAt(lenB - 1 - i) - '0' : 0;
            sb.insert(0, (ia + ib + carry) % 2);
            carry = (ia + ib + carry) / 2;
        }
        if (carry != 0) sb.insert(0, carry);
        return sb.toString();
    }
}
