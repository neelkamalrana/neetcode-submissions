class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        int n = strs.size();
        for (int i = 0; i < n; i++) {
            int strlen = strs.get(i).length();
            if (strlen < 10) {
                str.append("0");
            }
            str.append(strlen);
            str.append(strs.get(i));

        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int n = str.length();
        int i = 0;
        while (i < n) {
            int size = Integer.valueOf(str.substring(i, i+2));
            String encoded = str.substring(i+2, i+2+size);
            ans.add(encoded);
            i = i+2+size;
        }
        return ans;
        
    }
}
