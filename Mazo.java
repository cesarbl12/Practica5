import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartasRestantes;

    // Constructor 
    public Mazo() {

        cartasRestantes = new ArrayList<>();
        Palo[] tipos = Palo.values();

        for (Palo i : tipos) {
            for (int numero = 2; numero <= 14; numero++) {
                cartasRestantes.add(new Carta(numero, i));
            }
        }
    }

    // Método para revolver la baraja
    public void revolver() {
        Collections.shuffle(cartasRestantes);
    }

    // Mostrar la baraja
    public void imprimirBaraja() {
        for (Carta carta : cartasRestantes) {
            System.out.println(carta.toString());
        }
    }

    public void reestablecer(){
        Collections.sort(cartasRestantes);
    }

    // Método para repartir una mano de 7 cartas y removerlas de la baraja
    public ArrayList<Carta> repartirMano() {
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < 7 && !cartasRestantes.isEmpty(); i++) {
            mano.add(cartasRestantes.remove(0));
        }
        return mano;
    }
    //agregar carta al mazo
    public void agregarCarta(Carta otraCarta){
        cartasRestantes.add(otraCarta);
    }
    //eliminar carta al mazo
    public void eliminarCarta(Carta otraCarta){
        cartasRestantes.remove(otraCarta);
    }

}
