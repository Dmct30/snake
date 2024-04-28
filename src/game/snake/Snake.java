package game.snake;

public class Snake {
    public static void main(String[] args) throws InterruptedException {

        Game game = new Game(50,50,150);

        game.init();
        game.start();
    }
}


