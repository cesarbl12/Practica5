import java.awt.*;

/**
 * Clase Trebol que representa un trébol utilizando círculos y un tallo.
 */
public class Trebol extends Circle {
    private Square stem;        // El tallo del trébol
    private Circle leftCircle;  // Círculo izquierdo
    private Circle rightCircle; // Círculo derecho
    private Circle topCircle;   // Círculo superior

    public Trebol(Posicion p) {
        // Crear los tres círculos para la parte superior del trébol
        topCircle = new Circle();
        leftCircle = new Circle();
        rightCircle = new Circle();

        // Ajustar posiciones para los tres círculos
        topCircle.xPosition = p.x + 10;
        topCircle.yPosition = p.y + 5 ; // Ajuste vertical para el círculo superior

        leftCircle.xPosition = p.x + 6 ; // Círculo izquierdo a la izquierda
        leftCircle.yPosition = p.y + 11; // Al mismo nivel vertical que el círculo superior

        rightCircle.xPosition = p.x + 14; // Círculo derecho a la derecha
        rightCircle.yPosition = p.y + 11; // Al mismo nivel vertical que el círculo superior

        // Crear el tallo del trébol
        stem = new Square();
        stem.xPosition = p.x + 10; // Centrado con respecto al trébol
        stem.yPosition = p.y + 14; // Colocarlo por debajo de los círculos
        stem.size = 10; // Tamaño del tallo
        stem.color = "black"; // Color del tallo
    }

    /**
     * Hacer el trébol visible dibujando todos sus componentes.
     */
    @Override
    public void makeVisible() {
        topCircle.makeVisible();
        leftCircle.makeVisible();
        rightCircle.makeVisible();
        stem.makeVisible();
    }

    /**
     * Hacer el trébol invisible ocultando todos sus componentes.
     */
    @Override
    public void makeInvisible() {
        topCircle.makeInvisible();
        leftCircle.makeInvisible();
        rightCircle.makeInvisible();
        stem.makeInvisible();
    }

    /**
     * Cambiar el tamaño de los círculos del trébol.
     */
    public void changeSize(int newSize) {
        topCircle.changeSize(newSize);
        leftCircle.changeSize(newSize);
        rightCircle.changeSize(newSize);
    }
}
