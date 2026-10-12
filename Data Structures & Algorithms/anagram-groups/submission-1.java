class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> map = new HashMap<>();
        int n = strs.length;

        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];

            for (char c : strs[i].toCharArray()) {
                arr[c - 'a']++;
            }

            String key = Arrays.toString(arr);

            if (map.containsKey(key)) {
                map.get(key).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(key, list);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<String> temp = new ArrayList<>();

            for (int index : entry.getValue()) {
                temp.add(strs[index]);
            }

            ans.add(temp);
        }

        return ans;
    }
}