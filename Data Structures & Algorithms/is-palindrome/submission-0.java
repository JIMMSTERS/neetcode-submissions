class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char startChar = Character.toLowerCase(s.charAt(start));
            char endChar = Character.toLowerCase(s.charAt(end));
            while (start < end && !Character.isLetterOrDigit(startChar)) {
                start++;
                startChar = Character.toLowerCase(s.charAt(start));
            }
            while (start < end && !Character.isLetterOrDigit(endChar)) {
                end--;
                endChar = Character.toLowerCase(s.charAt(end));
            }
            if (startChar != endChar) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
