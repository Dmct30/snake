package game.snake;

public class Game {

    private Grid grid;
    private Player player;
    private Apple apple;
    private int delay;
    public Background background;

    Game(int cols, int rows, int delay) {

        grid = new Grid(cols, rows);
        background = new Background();
        apple = new Apple(grid);
        player = new Player(grid);
        CollisionLogic collisionLogic = new CollisionLogic();
        KeyboardLogic keyboardLogic = new KeyboardLogic(collisionLogic);
        Player collisionBox = new Player(grid);
        keyboardLogic.setPlayer(player);
        keyboardLogic.setApple(apple);
        keyboardLogic.setCollisionBox(collisionBox);
        this.delay = delay;
    }

    public void init(){
        grid.init();
    }

    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);
            checkCollision(player, apple);
          //  moveSnake();

        }
    }

    public void checkCollision (Player player, Apple apple) {
//        if (player.getPlayerCol() + player.getPlayerWidth() > apple.getAppleCol()
//                && player.getPlayerRow() + player.getPlayerHeight() > apple.getAppleRow()
//                && player.getPlayerCol() < apple.getAppleCol() + apple.getAppleWidth()
//                && player.getPlayerRow() < apple.getAppleRow() + apple.getAppleHeight()) {

        if (player.getPlayerCol() == apple.getAppleCol()
        && player.getPlayerRow() == apple.getAppleRow()) {

            System.out.println("Colided");
            apple.eat();
        }

    }

}
