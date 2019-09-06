import java.util.Arrays;

public class BoardGenerator {

    public int[][] generateBoard(int numColumns, int numRows) {
        if (numColumns <= 0)
            numColumns = 1;
        if (numRows <= 0)
            numRows = 1;
        int[][] board = new int[numRows][numColumns];

        return board;
    }

    public int[][] addQueen(int[][] board) {
        int numColumns = board.length;
        int numRows = board[0].length;
        if (! isNotFull(board)) {
            System.out.println("Not possible to add another queen");
            return board;
        }
        while (true) {
            int columnIndex = (int) (Math.random() * numColumns);
            int rowIndex = (int) (Math.random() * numRows);
            if (board[columnIndex][rowIndex] == 1) {
                continue;
            } else {
                board[columnIndex][rowIndex] = 1;
                return board;
            }

        }
    }

    public boolean isNotFull(int[][] board) {
        int numColumns = board.length;
        int numRows = board[0].length;
        int sum = 0;
        for (int i = 0; i < numColumns; i++) {
            for (int x = 0; x < numRows; x++) {
                sum += board[i][x];
            }
        }
        return (sum < numColumns * numColumns);
    }

    public void print(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println("\n");
    }
}
