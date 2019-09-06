public class Main {
    public static void main(String[] args) {
        BoardGenerator generator = new BoardGenerator();
        Checker checker = new Checker();
        // generuje se tablice
        int[][] board = generator.generateBoard(3,5);
        // przypisuje do głównego checkera checker pomocniczy i tablice
        checkerMain mainChecker = new checkerMain(board, checker, generator);

        //staram się dodać kolejną królowa
        mainChecker.doingMove();


        //staram się dodać kolejną królowa
        mainChecker.doingMove();


        //staram się dodać kolejną królowa
        mainChecker.doingMove();

        //staram się dodać kolejną królowa
        mainChecker.doingMove();

        mainChecker.generator.print(mainChecker.board);



        }

    public static void testowanko(int[][] board, BoardGenerator generator) {
        generator.print(board);
        generator.addQueen(board);

    }

}

