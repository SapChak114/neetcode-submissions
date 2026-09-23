class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);

            if (map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                List<String> li = new ArrayList<>();
                li.add(str);
                map.put(s, li);
            }
        }

        ans.addAll(map.values());

        return ans;
    }
}
