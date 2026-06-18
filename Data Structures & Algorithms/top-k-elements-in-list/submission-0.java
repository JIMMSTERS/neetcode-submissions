class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<>();
        
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int num: map.keySet()) {
            int freq = map.get(num);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        for (int freq = bucket.length - 1; freq >= 1 && index < k; freq--) {
            if (bucket[freq] != null) {
                for (int num: bucket[freq]) {
                    result[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
