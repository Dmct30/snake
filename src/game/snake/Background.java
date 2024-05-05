package game.snake;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {

    private Picture background;
    private Picture overBackground;

    public Background() {
        background = new Picture(10,10,"resources/sandResize.png");
        overBackground = new Picture(10,10,"resources/GameOver.png");
        drawBackground();
    }

    public void drawBackground(){
        background.draw();
    }

    public void drawGameOver(){
        overBackground.draw();
    }
}
