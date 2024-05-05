package game.snake;

public class Game {

    private Grid grid;
    private Direction direction;
    private Player player;
    private Apple apple;
    public Background background;
    public int delay;
    int applesEaten = 0;

    Game() {
        this.grid = new Grid(50, 50);
        this.background = new Background();
        this.apple = new Apple(grid);
        this.player = new Player(grid, direction);
        KeyboardLogic keyboardLogic = new KeyboardLogic();
        keyboardLogic.setPlayer(player);
        this.delay = 150;
    }

    public void init(){
        grid.init();
    }

    public void start() throws InterruptedException {

        while (true) {

            Thread.sleep(delay);

            moveSnake();
        }
    }

    public void moveSnake(){
        player.move();
        checkApple();
        checkCollisions();
    }

    public void checkApple(){
        if ((player.getPlayerCol() == apple.getAppleCol()) && (player.getPlayerRow() == apple.getAppleRow())) {
            //bodyParts++;
            applesEaten++;
            apple.appleDisappear();
            apple = new Apple(grid);
        }
    }

    public void checkCollisions(){
        //TODO check collision with body
        //for (int i = bodyParts; i > 0; i--){
        //    if ((player.getPlayerCol()[0] == player.getPlayerCol()[i]) && (player.getPlayerRow()[0]) == player.getPlayerRow()[i])){
                //terminate game
        //    }
        //}

        //Left Wall
        if (player.getPlayerCol() < 0){
            System.out.println("Game Over");
        }
        //Right Wall
        if (player.getPlayerCol() > grid.getCols() -1 ){
            System.out.println("Game Over");
        }
        //Top Wall
        if (player.getPlayerRow() < 0){
            System.out.println("Game Over");
            //stop();
        }
        //Down Wall
        if (player.getPlayerRow() > grid.getRows() -1){
            System.out.println("Game Over");
        }
    }
}
