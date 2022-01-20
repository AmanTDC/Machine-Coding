import java.util.*;
public class main {
    private static String intToDirection(int i){
        switch (i){
            case 0:return "left";
            case 1:return "right";
            case 2:return "up";
            case 3:return "down";
        }
        return null;
    }
    public static void main(String s[]){
        Game game = new Game();
        Player player = new Player(game);
        Scanner sc= new Scanner(System.in);
        game.board.show();
        while(game.gameActive){
            int i = sc.nextInt();
            player.playMove(intToDirection(i));
        }

    }
}
