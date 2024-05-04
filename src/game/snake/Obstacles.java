package game.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Obstacles {
    private Rectangle obstacles;
    private int col;
    private int row;

    public Obstacles (Grid grid) {
        this.col = (int)(Math.random()* grid.getCols());
        this.row = (int)(Math.random()* grid.getRows());
        obstacles = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(),  grid.getCellSize());
        obstacles.setColor(Color.GRAY);
        obstacles.fill();
    }

    //TO BE DECIDED
//    public Obstacles ObstacleH (Grid grid) {
//        this.col = (int)(Math.random()* grid.getCols());
//        this.row = (int)(Math.random()* grid.getRows());
//        obstacles = new Rectangle(grid.columnToX(col), grid.rowToY(row), ((Math.ceil(Math.random() * 5)*grid.getCellSize())), grid.getCellSize();
//        obstacles.setColor(Color.GRAY);
//        obstacles.fill();
//    }

    public int getObstaclesCol() {
        return col;
    }

    public int getObstaclesRow() {
        return row;
    }
}
