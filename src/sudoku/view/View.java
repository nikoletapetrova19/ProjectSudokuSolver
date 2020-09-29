package sudoku.view;

import sudoku.model.Tile;

public class View {
    public void printBoard(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            for (int j = 0; j < arr.length; j++) {
                if (j % 3 == 0)
                    System.out.println(" ");

                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}

