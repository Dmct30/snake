package game.snake;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardLogic implements KeyboardHandler {

    private Keyboard keyboard;
    public Player player;
    public Player collisionBox;
    public CollisionLogic collisionLogic;
    public Apple apple;


    public KeyboardLogic(CollisionLogic collisionLogic) {
        keyboard = new Keyboard(this);
        this.collisionLogic = collisionLogic;
        init();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setCollisionBox(Player collisionBox) {
        this.collisionBox = collisionBox;
    }

    private void init() {
        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_D);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_A);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_W);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_S);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_D){
            player.moveRight();
            collisionBox.moveRight();
//            collisionLogic.collisionDetected(player,apple);
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_A){
            player.moveLeft();
            collisionBox.moveLeft();
//            collisionLogic.collisionDetected(player,apple);
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_W){
            player.moveUp();
            collisionBox.moveUp();
//            collisionLogic.collisionDetected(player,apple);
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_S){
            player.moveDown();
            collisionBox.moveDown();
//            collisionLogic.collisionDetected(player,apple);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}