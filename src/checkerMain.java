public class checkerMain {
    int lastCheckedRow;
    int lastCheckedColumn;
    int lastCheckedRightUp;
    int lastCheckedLeftUp;
    int numColumns;
    int numRows;
    int[][] board;
    Checker checker;
    BoardGenerator generator;

    public checkerMain(int [][] board, Checker checker, BoardGenerator generator) {
        lastCheckedColumn = 0;
        lastCheckedRow = 0;
        lastCheckedRightUp = 0;
        lastCheckedLeftUp = 0;
        this.board = board;
        numColumns = board.length;
        numRows = board[0].length;
        this.checker = checker;
        this.generator = generator;
    }
    public int wchichRow() {
        while (lastCheckedRow < numRows) {
            if (checker.checkRow(board, lastCheckedRow)) {
                return lastCheckedRow;
            }
            lastCheckedRow ++;
        }
        System.out.println("not possible to add row");
        return lastCheckedRow;
    }

    public int whichColumn() {
        while (lastCheckedColumn < numColumns) {
            if (checker.checkColumn(board, lastCheckedColumn)) {
                return lastCheckedColumn;
            }
            lastCheckedColumn ++;
        }
        System.out.println("not possible to add columns");
        return lastCheckedColumn;
    }

    public int[][] doingMove() {
        generator.print(board);
        int columnToCheck = whichColumn();
        int rowToCheck = wchichRow();
        while (columnToCheck < numColumns && rowToCheck < numRows) {
            if (checker.checkCrosswise(board, columnToCheck, rowToCheck)) {
                board[columnToCheck][rowToCheck] = 1;
                return board;
            }
            if (rowToCheck < numRows - 1) {
                rowToCheck ++;
            } else {
                if (columnToCheck < numColumns -1) {
                    rowToCheck = lastCheckedRow;
                    columnToCheck++;
                } else {
                    System.out.println("not possible to add anything");
                    return board;
                }
            }
        }
        System.out.println("not possible to add anything B");
        return board;
    }


}
