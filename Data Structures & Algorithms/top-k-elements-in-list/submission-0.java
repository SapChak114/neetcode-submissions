class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] bucket = new ArrayList[n+1];
        
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int num : nums) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
            int key = e.getKey();
            int val = e.getValue();

            if (bucket[val] == null) {
                bucket[val] = new ArrayList<>();
            }

            bucket[val].add(key);
        }

        List<Integer> ans = new ArrayList<>();
        int c = 0;
        for (int i = bucket.length - 1; i>=0; i--) {
            if (bucket[i] == null) {
                continue;
            }

            for (int num : bucket[i]) {
                if (c >= k) {
                    break;
                }
                ans.add(num);
                c++;
            }
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i<res.length; i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
