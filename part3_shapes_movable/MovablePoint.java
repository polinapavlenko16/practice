package part3_shapes_movable;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override 
    public void moveUp() { 
        y += ySpeed; // Движение вверх (увеличение координаты Y)
    }
    
    @Override 
    public void moveDown() { 
        y -= ySpeed; // Движение вниз (уменьшение координаты Y)
    }
    
    @Override 
    public void moveLeft() { 
        x -= xSpeed; 
    }
    
    @Override 
    public void moveRight() { 
        x += xSpeed; 
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
