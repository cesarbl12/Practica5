import java.awt.*;
import java.awt.geom.*;

/**
 * A heart shape that can be manipulated and that draws itself on a canvas.
 */
public class Corazon {
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Corazon() {
        size = 50;
        xPosition = 230;
        yPosition = 90;
        color = "red";
        isVisible = false;
    }

    public Corazon(Posicion p2) {
        xPosition = p2.x;
        yPosition = p2.y;
        size = 50;
        color = "red";
        isVisible = true;
    }

    public void makeVisible() {
        isVisible = true;
        draw();
    }

    public void makeInvisible() {
        erase();
        isVisible = false;
    }

    public void moveRight() {
        moveHorizontal(20);
    }

    public void moveLeft() {
        moveHorizontal(-20);
    }

    public void moveUp() {
        moveVertical(-20);
    }

    public void moveDown() {
        moveVertical(20);
    }

    public void moveHorizontal(int distance) {
        erase();
        xPosition += distance;
        draw();
    }

    public void moveVertical(int distance) {
        erase();
        yPosition += distance;
        draw();
    }

    public void changeSize(int newSize) {
        erase();
        size = newSize;
        draw();
    }

    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            // Here we would create a custom shape for the heart
            GeneralPath heart = new GeneralPath();
            heart.moveTo(xPosition + size / 2, yPosition);
            heart.quadTo(xPosition, yPosition - size / 2, xPosition + size / 2, yPosition + size / 2);
            heart.quadTo(xPosition + size, yPosition - size / 2, xPosition + size / 2, yPosition);
            canvas.draw(this, color, heart);
            canvas.wait(10);
        }
    }

    private void erase() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

    
}
