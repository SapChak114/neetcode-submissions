class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int res = 0;
        for (int num : nums) {
            if (!set.contains(num-1)) {
                int streak = 0, curr = num;
                while (set.contains(curr)) {
                    streak++;
                    curr++;
                }

                res = Math.max(res, streak);
            }
        }

        return res;
    }
}
