package game.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Apple {

    private Rectangle apple;
    private int col;
    private int row;


    public Apple(Grid grid){
        this.col = (int)(Math.random()* grid.getCols());
        this.row = (int)(Math.random()* grid.getRows());
        apple = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
        apple.setColor(Color.RED);
        apple.fill();
    }

    public void appleDisappear(){
        apple.delete();
    }

    public int getAppleCol() {
        return col;
    }

    public int getAppleRow() {
        return row;
    }


}
