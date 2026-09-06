class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(res, curr, candidates, target, 0, 0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> curr, int[] candidates, int target, int currSum, int idx) {
        if (currSum == target) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (idx == candidates.length || currSum > target) {
            return;
        }

        // Include candidates[idx]
        curr.add(candidates[idx]);
        backtrack(res, curr, candidates, target, currSum + candidates[idx], idx);
        curr.remove(curr.size() - 1);

        // Skip candidates[idx]
        backtrack(res, curr, candidates, target, currSum, idx + 1);
    }
}