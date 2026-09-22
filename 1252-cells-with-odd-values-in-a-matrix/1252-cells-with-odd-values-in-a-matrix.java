class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            rowCount[row]++;
            colCount[col]++;
        }
        int answer = 0;
     for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = rowCount[i] + colCount[j];
                if (value % 2 != 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}