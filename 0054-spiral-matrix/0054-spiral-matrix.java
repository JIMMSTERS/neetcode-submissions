class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0; // index of topmost unvisited row
        int bottom = matrix.length - 1; // index of bottommost unvisited row
        int left = 0; // index of leftmost unvisited column
        int right = matrix[0].length - 1; //index of rightmost unvisited column 

         while (top <= bottom && left <= right) {

            // 1. Traverse top row: left to right
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            // 2. Traverse right column: top to bottom
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // 3. Traverse bottom row: right to left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // 4. Traverse left column: bottom to top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }
}