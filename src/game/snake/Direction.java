package game.snake;

public enum Direction {

    UP,
    DOWN,
    RIGHT,
    LEFT;

    public static Direction chooseDirection() {
        return Direction.values()[(int)(Math.random()*Direction.values().length)];
    }

}
