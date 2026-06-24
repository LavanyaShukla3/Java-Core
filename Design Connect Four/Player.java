class Player{
    private String name;
    private GridPosition gridposition;

    public Player(String name, GridPosition gridposition){
        this.name = name;
        this.gridposition = gridposition;
    }
    public String getName(){
        return name;
    }
    public GridPosition getPieceColor(){
        return gridposition;
    }

}