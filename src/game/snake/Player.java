package game.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player {

    private Grid grid;
    private int col;
    private int row;
    private Rectangle player;
    private Rectangle collisionBox;
    private boolean collisionDetected = false;
    private CollisionLogic collisionLogic;

    public Player(Grid grid) {
        this.grid = grid;
        this.col = 25;
        this.row = 25;
        // player = new Picture(300, 300,"resources/snake.png");
        player = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
        player.setColor(Color.GREEN);
        player.fill();
        collisionBox = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
    }

    public int getPlayerCol() {
        return col;
    }

    public int getPlayerRow() {
        return row;
    }

    public int getPlayerWidth() {
        return col + grid.getCellSize();
    }

    public int getPlayerHeight(){
        return row + grid.getCellSize();
    }

    public void moveRight() {
        player.translate(GameConfig.GAMESPEED, 0);
        collisionBox.translate(GameConfig.GAMESPEED,0);
    }
    public void moveLeft() {
        player.translate(-GameConfig.GAMESPEED, 0);
        collisionBox.translate(-GameConfig.GAMESPEED,0);
    }
    public void moveUp() {
        player.translate(0, -GameConfig.GAMESPEED);
        collisionBox.translate(0,-GameConfig.GAMESPEED);
    }
    public void moveDown() {
        player.translate(0, GameConfig.GAMESPEED);
        collisionBox.translate(0,GameConfig.GAMESPEED);
    }

}
