package game.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class Player {

    private Grid grid;
    private int col;
    private int row;
    private Rectangle player;
    ;

    public Player(Grid grid) {
        this.grid = grid;
        this.col = 25;
        this.row = 25;
        // player = new Picture(300, 300,"resources/snake.png");
        player = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
        player.setColor(Color.GREEN);
        player.fill();
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

    public int getPlayerHeight() {
        return row + grid.getCellSize();
    }

    public void moveRight() {
        if (col < grid.getCols() - 1) {  // Check if moving right will go beyond the grid boundary
            player.translate(GameConfig.GAMESPEED, 0);
            col++;
        }
    }

    public void moveLeft() {
        if (col > 0) {  // Check if moving left will go beyond the grid boundary
            player.translate(-GameConfig.GAMESPEED, 0);
            col--;
        }
    }

    public void moveUp() {
        if (row > 0) {  // Check if moving up will go beyond the grid boundary
            player.translate(0, -GameConfig.GAMESPEED);
            row--;
        }
    }

    public void moveDown() {
        if (row < grid.getRows() - 1) {  // Check if moving down will go beyond the grid boundary
            player.translate(0, GameConfig.GAMESPEED);
            row++;
        }
    }
}