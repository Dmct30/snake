package game.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player implements Movable{

    private Grid grid;
    private int col;
    private int row;
    private Rectangle player;
    private Direction currentDirection;

    public Player(Grid grid, Direction currentDirection) {
        this.grid = grid;
        this.currentDirection = Direction.RIGHT;
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
        if (currentDirection != Direction.LEFT){
            player.translate(GameConfig.GAMESPEED, 0);
            col++;
        }
    }

    public void moveLeft() {
        if (currentDirection != Direction.RIGHT){
            player.translate(-GameConfig.GAMESPEED, 0);
            col--;
        }
    }

    public void moveUp() {
        if (currentDirection != Direction.DOWN) {
            player.translate(0, -GameConfig.GAMESPEED);
            row--;
        }
    }

    public void moveDown() {
       if (currentDirection != Direction.UP){
           player.translate(0, GameConfig.GAMESPEED);
           row++;
       }
    }

    @Override
    public void move() {

        switch (currentDirection) {
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
        }
    }
    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }
}