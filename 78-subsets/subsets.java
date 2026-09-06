class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(res, curr, nums, 0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> curr, int[] nums, int idx) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }    
    

        curr.add(nums[idx]);
        backtrack(res, curr, nums, idx+1);
        curr.remove(curr.size() - 1);
        backtrack(res, curr, nums, idx+1);
    }
}