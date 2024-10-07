import java.awt.*;

/**
 * A rectangle that extends Square but can have different width and height.
 */
public class Cuadrado extends Square {
    private int width;  // Width in pixels
    private int height; // Height in pixels

    /**
     * Default constructor. Initializes width and height to specific values.
     */
    public Cuadrado() {
        width = (int) (3 * 41.8);  // Convert 9 cm to pixels
        height = (int) (6 * 41.8); // Convert 6 cm to pixels
        xPosition = 100;
        yPosition = 10;
        color = "black";
        isVisible = false;
    }

    /**
     * Constructor that sets the position and initializes the rectangle.
     */
    public Cuadrado(Posicion p1) {
        xPosition = p1.x+5;
        yPosition = p1.y+5;
        width = 100;
        height = 150;  // Example height
        color = "white";
        isVisible = true;
    }

    @Override
    protected void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Rectangle(xPosition, yPosition, width, height));
            canvas.wait(10);
        }
    }
}
