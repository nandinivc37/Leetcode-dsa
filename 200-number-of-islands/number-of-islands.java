class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int res = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    res++;              // 1. Increment island count
                    dfs(grid, r, c);     // 2. Call DFS to sink the connected island
                }
            }
        }

        return res;                      // 3. Return total count after loops finish
    }

    public void dfs(char[][] grid, int r, int c) {
        // Added missing closing parenthesis for the if-condition
        if ((r < 0) || (r >= grid.length) || (c < 0) || (c >= grid[0].length) || (grid[r][c] == '0')) {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
    }
}