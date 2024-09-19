import java.util.List;

public class Juego {
    public static void main(String[] args) {
        // Crear una baraja
        Mazo mazo = new Mazo();

        mazo.imprimirBaraja();

        mazo.revolver();
    
        mazo.imprimirBaraja(); 

        mazo.reestablecer();
     
        mazo.imprimirBaraja();


        // Método main para probar la clase Jugador
 
        mazo.revolver();

        // Crear un jugador
        mazo.revolver();

        Jugador jugador = new Jugador("Carlos");
        
        jugador.asignarCartas(mazo);
        System.out.println(jugador.obtenerInfo()); // Muestra la información inicial del jugador

       // Deshacerse de una carta específica
       List<Carta> cartasDelJugador = jugador.getCartas(); // Obtener una copia de las cartas del jugador
       if (!cartasDelJugador.isEmpty()) {
           Carta cartaParaEliminar = cartasDelJugador.get(0); // Deshacerse de la primera carta
           jugador.deshacerseCarta(cartaParaEliminar);
           System.out.println(jugador.obtenerInfo()); // Muestra la información actualizada del jugador
       }
    }
}
    
    

   
    
