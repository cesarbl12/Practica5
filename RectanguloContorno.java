import java.awt.*;

/**
 * A rectangle that extends Square but can have different width and height.
 */
public class RectanguloContorno extends Square {
    private int width;  // Width in pixels
    private int height; // Height in pixels

    /**
     * Default constructor. Initializes width and height to specific values.
     */
    public RectanguloContorno() {
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
    public RectanguloContorno(Posicion p1) {
        xPosition = p1.x;
        yPosition = p1.y;
        width = 110;
        height = 160;  // Example height
        color = "black";
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
