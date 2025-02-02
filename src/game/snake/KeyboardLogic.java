package game.snake;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardLogic implements KeyboardHandler {

    private Keyboard keyboard;
    public Player player;

    public KeyboardLogic() {
        keyboard = new Keyboard(this);
        init();
    }

    public void setPlayer(Player player) {
        this.player = player;
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

        switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_A:
                    if (player.getCurrentDirection() != Direction.RIGHT) {
                        player.setCurrentDirection(Direction.LEFT);
                    }
                break;
                case KeyboardEvent.KEY_D:
                    if (player.getCurrentDirection() != Direction.LEFT) {
                        player.setCurrentDirection(Direction.RIGHT);
                    }
                break;
                case KeyboardEvent.KEY_W:
                    if (player.getCurrentDirection() != Direction.DOWN) {
                        player.setCurrentDirection(Direction.UP);
                    }
                break;
                case KeyboardEvent.KEY_S:
                    if (player.getCurrentDirection() != Direction.UP) {
                        player.setCurrentDirection(Direction.DOWN);
                    }
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}
