import java.util.Arrays;

public class Board {
    private int[][] board;
    private int numberRows;
    private int numberColumns;


    public Board(int rows, int columns) {
        rows = (rows > 0) ? rows : 1;
        columns = (columns > 0) ? columns : 1;
        numberRows = rows;
        numberColumns = columns;
        board = new int[numberRows][numberColumns];
    }
    public int[][] addIlligalQueen(int indexRow,int indexColumn) {
        if (indexRow < 0 || indexRow >= numberRows || indexColumn < 0 || indexColumn >= numberColumns) {
            System.out.println("indexes out of board");
            return board;
        }
        if (board[indexRow][indexColumn] == 1) {
            System.out.println("Queen already there");
            return board;
        }
        board[indexRow][indexColumn] = 1;
        return board;
    }
    public void print() {
        System.out.println("\n");
        for (int i=0; i < numberRows; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

    }
    public boolean check(int indexRow, int indexColumn, int vectorRows, int vectorColumns) {
        if (indexRow < 0 || indexRow >= numberRows || indexColumn < 0 || indexColumn >= numberColumns) {
            System.out.println("indexes out of board");
            return false;
        }
        if (board[indexRow][indexColumn] == 1) {
            System.out.println("Queen already there");
            return false;
        }
        int rowToCheck = indexRow;
        int columnToCheck = indexColumn;
        while (!(rowToCheck <= 0 || rowToCheck >= numberRows - 1 || columnToCheck <= 0 || columnToCheck >= numberColumns - 1)) {
            rowToCheck += vectorRows;
            columnToCheck += vectorColumns;
            if (board[rowToCheck][columnToCheck] == 1) {
                return false;
            }
        }
        rowToCheck = indexRow;
        columnToCheck = indexColumn;
        while (!(rowToCheck <= 0 || rowToCheck >= numberRows - 1 || columnToCheck <= 0 || columnToCheck >= numberColumns - 1)) {
            rowToCheck -= vectorRows;
            columnToCheck -= vectorColumns;
            if (board[rowToCheck][columnToCheck] == 1) {
                return false;
            }
        }
        return true;
    }
    public void addLegalQueen() {
    }



}
