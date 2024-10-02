import java.awt.*;

public class Cuadrado extends Square  {
    private int width;        // Width in pixels (9 cm = ~340 pixels)
    private int height;

    public Cuadrado() {
        width = (int)(3 * 41.8);  // Convert 9 cm to pixels
        height = (int)(6 * 41.8); // Convert 6 cm to pixels
        xPosition = 100;
        yPosition = 10;
        color = "black";
        isVisible = false;
    }
    public Cuadrado (Posicion p1){
        xPosition= p1.x;
        yPosition= p1.y;
        size = 150;
        color = "purple";
        isVisible = true;
    }


    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Rectangle(xPosition, yPosition, width, height));
            canvas.wait(10);
        }
    }

    
}
