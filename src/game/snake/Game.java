package game.snake;

public class Game {

    private Grid grid;
    private Direction direction;
    private Player player;
    private int bodyParts;
    private Apple apple;
    public Background background;
    public int delay;
    int applesEaten = 0;
    private boolean isRunning;

    Game() {
        this.grid = new Grid(50, 50);
        this.background = new Background();
        this.apple = new Apple(grid);
        this.player = new Player(grid, direction);
        KeyboardLogic keyboardLogic = new KeyboardLogic();
        keyboardLogic.setPlayer(player);
        this.delay = 150;
        this.isRunning = false;
    }

    public void init(){
        grid.init();
    }

    public void start() throws InterruptedException {
        isRunning = true;

        while (true) {

            Thread.sleep(delay);

            if(isRunning) {
                moveSnake();
            }
        }
    }

    public void stop() {
        isRunning = false;
        player.playerDisappear();
        background.drawGameOver();
        //System.exit(0);
    }

    public void moveSnake(){
        player.move();
        checkApple();
        checkCollisions();
    }

    public void checkApple(){
        if ((player.getPlayerCol() == apple.getAppleCol()) && (player.getPlayerRow() == apple.getAppleRow())) {
            applesEaten++;
            apple.appleDisappear();
            apple = new Apple(grid);
            player.addBodyPart();
        }
    }

    public void checkCollisions(){
        //TODO check collision with body
        /*for (int i = bodyParts; i > 0; i--){
            if ((player.getPlayerCol()[0] == player.getPlayerCol()[i]) && (player.getPlayerRow()[0] == player.getPlayerRow()[i])){
                System.out.println("Game Over");
                System.out.println("Apples Eaten: " + applesEaten);
                stop();
            }
        }*/

        //Left Wall
        if (player.getPlayerCol() < 0) {
            System.out.println("Game Over");
            System.out.println("Apples Eaten: " + applesEaten);
            stop();
        }
        //Right Wall
        if (player.getPlayerCol() > grid.getCols() -1 ){
            System.out.println("Game Over");
            System.out.println("Apples Eaten: " + applesEaten);
            stop();
        }
        //Top Wall
        if (player.getPlayerRow() < 0){
            System.out.println("Game Over");
            System.out.println("Apples Eaten: " + applesEaten);
            stop();
        }
        //Down Wall
        if (player.getPlayerRow() > grid.getRows() -1){
            System.out.println("Game Over");
            System.out.println("Apples Eaten: " + applesEaten);
            stop();
        }
    }
}
