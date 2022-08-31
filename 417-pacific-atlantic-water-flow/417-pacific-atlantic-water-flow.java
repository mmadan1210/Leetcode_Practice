class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        if (heights.length < 1) {
            return result;

        }

        int[][] pacificOcean = new int[heights.length][heights[0].length];
        int[][] atlanticOcean = new int[heights.length][heights[0].length];

        for (int i = 0; i <= heights[0].length - 1; i++) {
            dfs(heights, 0, i, Integer.MIN_VALUE, pacificOcean);
            dfs(heights, heights.length - 1, i, Integer.MIN_VALUE, atlanticOcean);

        }

        for (int j = 0; j <= heights.length - 1; j++) {
            dfs(heights, j, 0, Integer.MIN_VALUE, pacificOcean);
            dfs(heights, j, heights[0].length -1, Integer.MIN_VALUE, atlanticOcean);
        }

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (pacificOcean[i][j] == 1 && atlanticOcean[i][j] == 1) {
                    List<Integer> set = new ArrayList<>();
                    set.add(i);
                    set.add(j);
                    result.add(set);
                }
            }
        }
        return result;
    }


    public void dfs(int[][] matrix, int i, int j, int prev, int[][] ocean) {


        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return;

        if (ocean[i][j] == 1) return;

        if (matrix[i][j] < prev) return;

        ocean[i][j] = 1;

        dfs(matrix, i + 1, j, matrix[i][j], ocean);
        dfs(matrix, i - 1, j, matrix[i][j], ocean);
        dfs(matrix, i, j + 1, matrix[i][j], ocean);
        dfs(matrix, i, j - 1, matrix[i][j], ocean);
    }
}