import java.util.*;

class Solution0542 {
    public int[][] updateMatrix(int[][] mat) {
        int sRow = mat.length;
        int sCol = mat[0].length;
        int[][] sMatrix = new int[sRow][sCol];
        List<int[]> sDirections =
                Arrays.asList(new int[]{-1, 0}, new int[]{+1, 0}, new int[]{0, -1}, new int[]{0, +1});
        List<int[]> findList = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        int[][] visited = new int[sRow][sCol];
        // init
        for (int i = 0; i < sRow; i++) {
            for (int j = 0; j < sCol; j++) {
                if (mat[i][j] == 0) {
                    sMatrix[i][j] = 0;
                    findList.add(new int[]{i, j});
                    queue.add(new int[]{i, j});
                    visited[i][j] = 1;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];
            for (int[] direction : sDirections) {
                int row = x + direction[0];
                int col = y + direction[1];
                if (row >= 0 && row < sRow && col >= 0 && col < sCol && visited[row][col] == 0) {
                    sMatrix[row][col] = sMatrix[x][y] + 1;
                    queue.add(new int[]{row, col});
                    visited[row][col] = 1;
                }
            }
        }
        return sMatrix;
    }
}