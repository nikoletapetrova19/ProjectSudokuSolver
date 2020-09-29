package sudoku;
import sudoku.controller.SudokuSolver;
import sudoku.view.View;

public class Main {
    public static void main(String[] args) {
        int[][]arr= new InputData().getData();
        new View().printBoard(arr);
        new SudokuSolver().readData();
    }
}
