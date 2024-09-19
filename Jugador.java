import java.util.ArrayList;
import java.util.List;

public class Jugador {
    // Atributo público nombre
    public String nombre;
    // Atributo privado para almacenar las cartas
    private List<Carta> cartas;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.cartas = new ArrayList<>();
    }

    // Método para asignar cartas al jugador desde el mazo
    public void asignarCartas(Mazo mazo) {
        List<Carta> cartasAsignadas = mazo.repartirMano();
        this.cartas.addAll(cartasAsignadas);
    }

    // Método para deshacerse de una carta específica
    public void deshacerseCarta(Carta carta) {
        if (cartas.contains(carta)) {
            cartas.remove(carta);
        } else {
            System.out.println("La carta " + carta + " no está en la mano del jugador.");
        }
    }

    // Método para obtener la información del jugador en forma de cadena
    public String obtenerInfo() {
        if (cartas.isEmpty()) {
            return "Jugador: " + nombre + ", sin cartas";
        } else {
            return "Jugador: " + nombre + ", Cartas: " + cartas.toString();
        }
    }

    // Método para obtener una copia de las cartas del jugador
    public List<Carta> getCartas() {
        return new ArrayList<>(cartas); // Devuelve una copia de la lista de cartas
    }
}
