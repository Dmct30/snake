package game.snake;

public class Game {

    private Grid grid;
    private Player player;
    private int delay;
    private int velocityCol;
    private int velocityRow;


    Game(int cols, int rows, int delay) {

        grid = new Grid(cols, rows);
        Background background = new Background();
        KeyboardLogic keyboardLogic = new KeyboardLogic();
        CollisionLogic collisionLogic = new CollisionLogic();
        Player player = new Player(grid);
        Player collisionBox = new Player(grid);
        Apple apple = new Apple(grid);
        keyboardLogic.setPlayer(player);
        keyboardLogic.setCollisionBox(collisionBox);
        this.delay = delay;

    }

    public void init(){
        grid.init();
    }

    public void start() throws InterruptedException {

        while (true) {
            velocityCol = 1;
            velocityRow = 1;

            // Pause for a while
            Thread.sleep(delay);

          //  moveSnake();

        }
    }


    //public void moveSnake() {
       // Player.getPlayerCol() += velocityCol;
       // player.getPlayerRow() += velocityRow;
    //}
}
