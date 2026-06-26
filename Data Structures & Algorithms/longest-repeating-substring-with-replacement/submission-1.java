class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxFreq = 0;
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            int windowLength = right - left + 1;
            
            if (windowLength - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
                windowLength = right - left + 1;
            }
            maxLength = Math.max(maxLength, windowLength);
        }
        return maxLength;
    }
}
