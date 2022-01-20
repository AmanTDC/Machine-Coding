import java.lang.Math;
public class Board {
    Tile tiles[][];
    Player player;
    int freetiles;
    Board(){
        this.tiles = initializeBoard();
        freetiles = 16;
        addRandomTile();

    }
    private Tile[][] initializeBoard(){
        Tile tiles[][] = new Tile[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                tiles[i][j] = new Tile( new Position(i,j) );
            }
        }

        return tiles;
    }
    public Tile getTile(Position position){
        return tiles[position.x][position.y];
    }
    public void addRandomTile(){
        int x = (int)(Math.random()*(3-0+1));
        int y = (int)(Math.random()*(3-0+1));
        Position position = new Position(x,y);

        while(this.getTile(position).value != 0){
            x = (int)(Math.random()*(3-0+1));
            y = (int)(Math.random()*(3-0+1));
//            System.out.println(x+" "+y);
            position = new Position(x,y);
        }
        freetiles--;
        this.getTile(position).value = 2;
    }
    public void show(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(getTile(new Position(i,j)).value+" ");
            }
            System.out.println();
        }
    }


}
