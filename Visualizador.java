public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        RectanguloContorno rContorno = new RectanguloContorno(p);
        rContorno.makeVisible();
        Cuadrado cuadrado = new Cuadrado(p);
        cuadrado.makeVisible();
        
       
    

        
        for (int i = 0; i < c.getValor(); i++) {
            int columna = i / 5; // Calcula cuántas columnas hay, cambiando cada 5 elementos
            int offsetX = columna * 30; // Mueve a la derecha cada vez que se completa una columna
            Posicion nuevaPosicion = new Posicion(p.x + offsetX, p.y + ((i % 5) * 30));  

            

            if (c.getTipo() == Palo.CORAZONES){
                Corazon corazon2 = new Corazon(nuevaPosicion);
                corazon2.makeVisible();
                corazon2.changeColor("red");
            } else if (c.getTipo() == Palo.DIAMANTES) {
                Diamante diamante2 = new Diamante(nuevaPosicion);
                diamante2.makeVisible();
            } else if (c.getTipo() == Palo.PICAS){ 
                Espada espadas2 = new Espada(nuevaPosicion);
                espadas2.makeVisible();
            } else if(c.getTipo() == Palo.TREBOLES){
                Trebol trebol2 = new Trebol(nuevaPosicion);
                trebol2.makeVisible();
            }


        }
    }
}
