public class Game {

    private Grid grid;

    private int delay;

    Game(int cols, int rows, int delay) {

        grid = new Grid(cols, rows);
        Background background = new Background();
        this.delay = delay;

    }

    public void init(){
        grid.init();
    }

    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            //moveSnake();
        }

    }
}
