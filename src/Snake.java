
public class Snake {
    public static void main(String[] args) throws InterruptedException {

        Game game = new Game(50,50,150);
        Player player = new Player();
        game.init();
        game.start();
        KeyboardLogic keyboardLogic = new KeyboardLogic();
    }
}


