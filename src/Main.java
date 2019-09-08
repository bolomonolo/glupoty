public class Main {
    public static void main(String[] args) {
        Board board = new Board(3,4);
        board.print();
        board.addIlligalQueen(2,0);
        board.print();
        System.out.println(board.check(1,1,1,0));



        }

    public static void testing(int[][] board, BoardGenerator generator, int iterations, checkerMain mainChecker) {
        for (int i = 0; i < iterations; i++) {
            mainChecker.doingMove();
        } mainChecker.generator.print(mainChecker.board);
    }

    public Main() {

    }
}

