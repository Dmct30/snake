import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player {

    private Rectangle player;
    public Player() {
        player = new Rectangle(25, 25, 25, 25);
        player.draw();
    }

    public void moveRight() {
        player.translate(10, 0);
    }
    public void moveLeft() {
        player.translate(-10, 0);
    }
    public void moveUp() {
        player.translate(0, -10);
    }
    public void moveDown() {
        player.translate(0, 10);
    }

}
