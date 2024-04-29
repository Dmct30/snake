package game.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Apple {

    private Rectangle apple;
    private Grid grid;
    private int col;
    private int row;
    private Rectangle appleCollisionBox;
    public  boolean eaten = false;

    public Apple(Grid grid){
        this.grid = grid;
        this.col = (int)(Math.random()* grid.getCols());
        this.row = (int)(Math.random()* grid.getRows());
        apple = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
        appleCollisionBox = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
        apple.setColor(Color.RED);
        apple.fill();
    }

    public Rectangle apple(){
        return apple;
    }

    public int getAppleCol() {
        return col;
    }

    public int getAppleRow() {
        return row;
    }

    public int getAppleWidth() {
        return col + grid.getCellSize();
    }

    public int getAppleHeight(){
        return row + grid.getCellSize();
    }

    public boolean isEaten() {
        return eaten;
    }
    public void eat() {
        eaten = true;
        apple.delete();
        System.out.println("Here");
    }

}
