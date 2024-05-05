package game.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;

public class Player implements Movable{

    private Grid grid;
    private int col;
    private int row;
    private Rectangle player;
    private Direction currentDirection;
    private ArrayList<Rectangle> bodyParts;

    public Player(Grid grid, Direction currentDirection) {
        this.grid = grid;
        this.currentDirection = Direction.RIGHT;
        this.col = 25;
        this.row = 25;
        // player = new Picture(300, 300,"resources/snake.png");
        bodyParts = new ArrayList<>();
        player = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
        player.setColor(Color.GREEN);
        player.fill();
        bodyParts.add(player);
    }

    public void addBodyPart() {
        Rectangle newBodyPart = new Rectangle(player.getX(), player.getY(), player.getWidth(), player.getHeight());
        newBodyPart.setColor(Color.GREEN);
        newBodyPart.fill();
        bodyParts.add(newBodyPart);
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
        //Move the player's head
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

        //Move the body parts
        for(int i = bodyParts.size() - 1; i > 0; i--) {
            Rectangle currentPart = bodyParts.get(i);
            Rectangle nextPart = bodyParts.get(i - 1);
            currentPart.translate(nextPart.getX() - currentPart.getX(), nextPart.getY() - currentPart.getY());
        }
    }
    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void playerDisappear(){
        player.delete();
        bodyParts.clear();
    }

    public ArrayList<Rectangle> getBodyParts() {
        return bodyParts;
    }
}