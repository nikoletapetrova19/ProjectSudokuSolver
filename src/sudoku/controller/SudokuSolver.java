package sudoku.controller;

import sudoku.InputData;
import sudoku.model.Board;

public class SudokuSolver {
    private int arr[][];
    private Board board;


    public void start(){
        if(!readData()){
            System.out.println("Data source failed.");
            return;
        }

        board=new Board(arr);

    }

    public boolean readData(){
        arr=new InputData().getData();
        return true;
    }

    private void reduceAvailableValues(){
        reduceAvailableValuesInRow();
        reduceAvailableValuesInCol();
        reduceAvailableValuesInSquare();
    }
    private void reduceAvailableValuesInRow(){

    }
    private void reduceAvailableValuesInCol(){

    }
    private void reduceAvailableValuesInSquare(){

    }
}
