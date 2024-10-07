import java.awt.*;

public class Espada extends Triangle {
    private Triangle blackTriangle1; // Triángulo negro superior
    private Triangle blackTriangle2; // Triángulo negro izquierdo
    private Triangle blackTriangle3; // Triángulo negro derecho

    public Espada(Posicion p){
         blackTriangle1 = new Triangle();
         blackTriangle2 = new Triangle();
         blackTriangle3 = new Triangle();

        blackTriangle1.changeColor("black"); // Cambiar color a negro
        blackTriangle1.changeSize(10, 15); // Ajustar tamaño
        blackTriangle1.xPosition = p.x + 15; // Mismo x
        blackTriangle1.yPosition = p.y + 20; // Ajustar posición y
        blackTriangle1.makeVisible(); // Hacer visible

        blackTriangle2.changeColor("black"); // Cambiar color a negro
        blackTriangle2.changeSize(10, 15); // Ajustar tamaño
        blackTriangle2.xPosition = p.x + 25; // Ajustar posición x
        blackTriangle2.yPosition = p.y + 20; // Ajustar posición y
        blackTriangle2.makeVisible(); // Hacer visible

        blackTriangle3.changeColor("black"); // Cambiar color a negro
        blackTriangle3.changeSize(10, 15); // Ajustar tamaño
        blackTriangle3.xPosition = p.x + 20; // Ajustar posición x
        blackTriangle3.yPosition = p.y + 13; // Ajustar posición y
        blackTriangle3.makeVisible(); // Hacer visible
    }


    /**
     * Hacer visible la espada dibujando todos sus componentes.
     */
    @Override
    public void makeVisible() {
        // Hacer visibles los triángulos negros
        blackTriangle1.makeVisible();
        blackTriangle2.makeVisible();
        blackTriangle3.makeVisible();
    }

    /**
     * Hacer invisible la espada ocultando todos sus componentes.
     */
    @Override
    public void makeInvisible() {
        // Hacer invisibles los triángulos negros
        blackTriangle1.makeInvisible();
        blackTriangle2.makeInvisible();
        blackTriangle3.makeInvisible();
    }
}
