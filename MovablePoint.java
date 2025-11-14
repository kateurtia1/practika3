package movable;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed; // Уменьшаем y при движении вверх (если y=0 - верхняя граница)
    }

    @Override
    public void moveDown() {
        y += ySpeed; // Увеличиваем y при движении вниз
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; // Уменьшаем x при движении влево
    }

    @Override
    public void moveRight() {
        x += xSpeed; // Увеличиваем x при движении вправо
    }

    @Override
    public String toString() {
        return "MovablePoint[x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
    }
}