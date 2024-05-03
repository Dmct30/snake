package game.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

import java.security.PublicKey;

public class Player {

    private Grid grid;
    private int col;
    private int row;
    private Rectangle player;
    public Game game;

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


    public void moveRight() {
        player.translate(GameConfig.GAMESPEED, 0);
        col++;
    }

    public void moveLeft() {
        player.translate(-GameConfig.GAMESPEED, 0);
        col--;
    }

    public void moveUp() {
        player.translate(0, -GameConfig.GAMESPEED);
        row--;
    }

    public void moveDown() {
       player.translate(0, GameConfig.GAMESPEED);
       row++;
    }

    /*@Override
    public void move(){

        switch (direction) {
            case UP:
                pos.moveUp();
                break;
            case DOWN:
                pos.moveDown();
                break;
            case LEFT:
                pos.moveLeft();
                break;
            case RIGHT:
                pos.moveRight();
                break;

        }*/
}