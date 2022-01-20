public class Player {
    Game game;
    Player(Game game){
        this.game = game;
    }
    public void playMove(String direction){

        if(direction==null)
            return;
        if(direction.equals("left"))
            game.playLeft();
        else if(direction.equals("right"))
            game.playRight();
        else if(direction.equals("up"))
            game.playUp();
        else if(direction.equals("down"))
            game.playDown();

        System.out.println(game.board.freetiles);

        if(game.board.freetiles==0||game.maxValue==2048){
            gameOver();
        }

        game.board.addRandomTile();
        game.board.show();

    }
    private void gameOver(){
        if(game.board.freetiles==0){
            System.out.println("Game Over");
        }
        else
            System.out.println("You won!");
        game.gameActive = false;
    }


}
