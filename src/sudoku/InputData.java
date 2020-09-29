package sudoku;

public class InputData {
    public int[][] getData(){
        String data="100026039008700601000000200400900516000000000796004008009000000301002900640180003";
        int arr[][]=new int[9][9];
        for (int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j]=(data.charAt(9*i+j))-'0';
            }
        }
        return arr;
    }
}
