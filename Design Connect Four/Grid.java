class Grid{
    private int rows;
    private int cols;
    private int[][] grid;
    private int rowTobePlaced;

    public void initGrid(int rows,int cols){
        this.rows = rows;
        this.cols = cols;

        grid = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
               grid[row][col] = GridPosition.EMPTY.ordinal();
            }
        }
        rowTobePlaced = grid.length;
    }   
    public int placePiece(int col, Player piece){
        if(grid[rowTobePlaced][col] != Enum.EMPTY){
            return -1;
        }else{
            GridPosition gp = piece.getPieceColor();
            grid[rowTobePlaced][col] = gp.ordinal();;
        }
        return rowTobePlaced++;
    }
    public boolean checkNConnected(int connectN, int row, int col, int piece ){
        //check for left diagnoal, right doagonal, horizontal and vertical
        while(row >=0 && row<grid.length && col>=0 && col.length < grid[0].length){
            //check diagonal
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){

                }
            }
        }
    } 
}

//   - rows, columns       int
//   - grid                int[][]
//   + initGrid()          void
//   + placePiece(col, piece) → int (returns the row where piece landed)
//   + checkNConnected(connectN, row, col, piece) → boolean
//   + getColumnCount()    int
