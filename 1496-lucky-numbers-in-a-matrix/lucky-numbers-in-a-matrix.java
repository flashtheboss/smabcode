import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            // Step 1: Find minimum in current row
            int minCol = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            // Step 2: Check if it is maximum in its column
            int candidate = matrix[i][minCol];
            boolean isLucky = true;

            for (int k = 0; k < rows; k++) {
                if (matrix[k][minCol] > candidate) {
                    isLucky = false;
                    break;
                }
            }

            // Step 3: Add if it is a lucky number
            if (isLucky) {
                ans.add(candidate);
            }
        }

        return ans;
    }
}