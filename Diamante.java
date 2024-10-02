import java.awt.*;
import java.awt.geom.*;

/**
 * A diamond shape that can be manipulated and that draws itself on a canvas.
 */
public class Diamante {
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Diamante() {
        size = 25;
        xPosition = 300;
        yPosition = 200;
        color = "black";
        isVisible = false;
    }

    public Diamante(Posicion p2) {
        xPosition = p2.x;
        yPosition = p2.y;
        size = 25;
        color = "black";
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
        moveHorizontal(100);
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
            // Custom shape for diamond
            Polygon diamond = new Polygon();
            diamond.addPoint(xPosition, yPosition + size / 2);
            diamond.addPoint(xPosition + size / 2, yPosition);
            diamond.addPoint(xPosition + size, yPosition + size / 2);
            diamond.addPoint(xPosition + size / 2, yPosition + size);
            canvas.draw(this, color, diamond);
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
