class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word: strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String s = new String(chars);

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}
