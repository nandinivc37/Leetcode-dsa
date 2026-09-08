class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        
        // Edge Case: If starting color is already target color
        if (originalColor != color) {
            dfs(image, sr, sc, originalColor, color);
        }
        
        return image;
    }

    private void dfs(int[][] image, int r, int c, int original, int newColor) {
        // Base case: check boundary and color match
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != original) {
            return;
        }

        // Fill color
        image[r][c] = newColor;

        // Recurse in 4 directions
        dfs(image, r - 1, c, original, newColor); // Up
        dfs(image, r + 1, c, original, newColor); // Down
        dfs(image, r, c - 1, original, newColor); // Left
        dfs(image, r, c + 1, original, newColor); // Right
    }
}