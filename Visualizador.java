public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        Square square = new Square(p); 
        square.makeVisible();

        
        for (int i = 0; i < c.getValor(); i++) {
            Posicion nuevaPosicion = new Posicion(p.x, p.y + (i * 10)); 

            Circle circle = new Circle(nuevaPosicion); 
            if (c.getTipo() == Palo.CORAZONES){
                circle.changeColor("red");
            } else if (c.getTipo() == Palo.DIAMANTES) {
                circle.changeColor("blue");
            } else if (c.getTipo() == Palo.PICAS){ 
                circle.changeColor("green");
            } else 
            circle.changeColor("black");


            circle.makeVisible(); 
        }
    }
}
