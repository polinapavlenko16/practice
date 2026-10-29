package part3_shapes_movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Метод проверки, что обе точки имеют одинаковую скорость
    public boolean isSpeedSame() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    // Если скорости одинаковые, двигаем обе точки (левый верхний и правый нижний углы)
    @Override
    public void moveUp() {
        if (isSpeedSame()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        } else {
            System.out.println("Ошибка: скорости точек разные, прямоугольник не может двигаться!");
        }
    }

    @Override
    public void moveDown() {
        if (isSpeedSame()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (isSpeedSame()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (isSpeedSame()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
    
    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft.toString() + 
               ", bottomRight=" + bottomRight.toString() + "]";
    }
}
