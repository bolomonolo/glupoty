public class Checker {

    public boolean checkColumn(int[][] board, int columnIndex) {
        for (int i =0; i < board[0].length; i++) {
            if (board[columnIndex][i] == 1) {
                return false;
            }
        }
        return true;
    }

    public boolean checkRow(int[][] board, int rowIndex) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][rowIndex] == 1) {
                return false;
            }
        }
        return true;
    }

    public boolean checkRightUp(int[][] board, int columnIndex, int rowIndex) {
        int numRows = board[0].length;
        int numColumns = board.length;
        int checkedColumn = columnIndex;
        int checkedRow = rowIndex;
        while (checkedColumn < numColumns && checkedRow < numRows) {
            if (board[checkedColumn][checkedRow] > 0) {
                return false;
            }
            checkedColumn++;
            checkedRow++;
        }
        while (columnIndex >= 0 && rowIndex >= 0) {
            if (board[columnIndex][rowIndex] > 0) {
                return false;
            }
            columnIndex--;
            rowIndex--;
        }
        return true;
    }

    public boolean checkLeftUp(int[][] board, int columnIndex, int rowIndex) {
        int numRows = board[0].length;
        int numColumns = board.length;
        int checkedColumn = columnIndex;
        int checkedRow = rowIndex;
        while (checkedColumn < numColumns && checkedRow >=0) {
            if (board[checkedColumn][checkedRow] > 0) {
                return false;
            }
            checkedColumn++;
            checkedRow--;
        }
        while (columnIndex >= 0 && rowIndex < numRows) {
            if (board[columnIndex][rowIndex] > 0) {
                return false;
            }
            columnIndex--;
            rowIndex++;
        }
        return true;
    }

    public boolean checkAll(int[][] board, int columnIndex, int rowIndex) {
        return  (checkColumn(board,columnIndex) && checkRow(board,rowIndex) && checkRightUp(board, columnIndex, rowIndex)
                && checkLeftUp(board, columnIndex, rowIndex));

    }

    public boolean checkCrosswise(int[][] board, int columnIndex, int rowIndex) {
        return (checkRightUp(board, columnIndex, rowIndex) && checkLeftUp(board, columnIndex, rowIndex));
    }
}




