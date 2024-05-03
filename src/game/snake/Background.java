package game.snake;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {

    private Picture background;

    public Background(){
        background = new Picture(10,10,"resources/sandResize.png");
        background.draw();
    }
}
