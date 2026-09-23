class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }

        int longest = 0;
        for (int num: set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int maxLength = 1;

                while (set.contains(current + 1)) {
                    current++;
                    maxLength++;
                }
                longest = Math.max(longest, maxLength);
            }
        }
        return longest;
    }
}