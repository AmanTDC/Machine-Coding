
public class Tile {
    int value;
    Position position;
    Tile(Position position){
        this.position = position;
        value = 0;
    }
    public boolean isEqual (Tile tile){
        return tile.value == this.value;
    }
    public void move(Game game,String direction){


        Position position = this.position.getNext(direction);
        if(position==null)
                return;
        Tile targetTile = game.board.getTile(position);

        if((targetTile.value!=0&&targetTile.value != this.value) || this.value==0)
            return;

        if(this.value==targetTile.value){
            if(game.merged)
                return;
            else {
                game.merged = true;
                game.maxValue = this.value*2;
                game.board.freetiles++;
            }
        }
        targetTile.value += this.value;
        this.value = 0;
        targetTile.move(game,direction);

    }




}
