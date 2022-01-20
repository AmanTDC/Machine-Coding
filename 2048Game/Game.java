public class Game {
    Board board;
    Player player;
    int maxValue;
    boolean merged;
    boolean gameActive;
    Game() {
        gameActive = true;
        maxValue = 0;
        board = new Board();
        player = new Player(this);

    }
    public void playLeft(){
        merged = false;
        for(int i=3;i>=0;i--){
            for(int j=0;j<4;j++){
                Position position = new Position(i,j);
                Tile tile = this.board.getTile(position);
                tile.move(this,"left");
            }
        }

    }
    public void playRight(){
        merged = false;
        for(int i=3;i>=0;i--){
            for(int j=3;j>=0;j--){
                Position position = new Position(i,j);
                Tile tile = this.board.getTile(position);
                tile.move(this,"right");
            }
        }

    }
    public void playUp(){
        merged = false;
        for(int j=0;j<4;j++){
            for(int i=0;i<4;i++){
                Position position = new Position(i,j);
                Tile tile = this.board.getTile(position);
                tile.move(this,"up");
            }
        }

    }
    public void playDown(){
        merged = false;
        for(int j=0;j<4;j++){
            for(int i=3;i>=0;i--){
                Position position = new Position(i,j);
                Tile tile = this.board.getTile(position);
                tile.move(this,"down");
            }
        }
    }
}
