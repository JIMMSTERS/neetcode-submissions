class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char num = board[row][col];
                if (num == '.') {
                    continue;
                }

                String rowRule = num + " in row " + row;
                String colRule = num + " in col " + col;
                String boxRule = num + " in box " + (row / 3) + "-" + (col / 3);

                if (seen.contains(rowRule) || seen.contains(colRule) || seen.contains(boxRule)) {
                    return false;
                }
                seen.add(rowRule);
                seen.add(colRule);
                seen.add(boxRule);
            }
        }
        return true;

    }   
}
