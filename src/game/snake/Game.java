package game.snake;

public class Game {

    private Grid grid;
    private Player player;
    public Apple apple;
    private int delay;
    public Background background;
    private int velocityCol;
    private int velocityRow;


    Game(int cols, int rows, int delay) {

        grid = new Grid(cols, rows);
        background = new Background();
        CollisionLogic collisionLogic = new CollisionLogic();
        KeyboardLogic keyboardLogic = new KeyboardLogic(collisionLogic);
        player = new Player(grid);
        Player collisionBox = new Player(grid);
        apple = new Apple(grid);
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
