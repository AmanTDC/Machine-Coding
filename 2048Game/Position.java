public class Position {
    int x ;
    int y;
    Position(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Position getNext(String direction){
        if(direction.equals("up")){
            if(x>0)
                return new Position(x-1,y);
        }
        else if(direction.equals("down")){
            if(x<3)
                return new Position(x+1,y);
        }
        else if(direction.equals("left")){
            if(y>0)
                return new Position(x,y-1);
        }
        else if(direction.equals("right")){
            if(y<3)
                return new Position(x,y+1);
        }
        return null;
    }


}
