// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int n : nums) {
//             map.put(n, map.getOrDefault(n, 0) + 1);
//         }
//         List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//         list.sort((a, b) -> b.getValue() - a.getValue());
//         int[] result = new int[k];
//         for (int i = 0; i < k; i++) {
//             result[i] = list.get(i).getKey();
//         }
//         return result;
//     }
// }


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: create buckets
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: fill buckets by frequency
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            int number = e.getKey();
            int count = e.getValue();
            buckets[count].add(number);
        }

        // Step 4: collect from highest frequency down
        List<Integer> res = new ArrayList<>();
        for (int i = nums.length; i >= 0 && res.size() < k; i--) {
            for (int num : buckets[i]) {
                res.add(num);
                if (res.size() == k)
                    break;
            }
        }

        // Step 5: convert list to array
        return res.stream().mapToInt(i -> i).toArray();
    }
}