
public class Carta implements Comparable<Carta>{
    private int valor;
    private Palo tipo;
   

    //primer constructor
    public Carta (int valor, Palo tipo){
        this.valor = valor;
        this.tipo = tipo; 
    }

    public int getValor(){
        return this.valor;
    }

    public Palo getTipo(){
        return this.tipo;
    }

    public String getValorString() {
        switch (valor) {
            case 14: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return Integer.toString(valor);
        }
    }

    @Override
    public String toString() {
        return tipo + " " + getValorString();
    }

    public void mostrarCarta() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Carta otraCarta) {
        int comparacionPalo = this.tipo.ordinal() - otraCarta.tipo.ordinal();
        if (comparacionPalo != 0 ){
            return comparacionPalo;
        }
        return this.valor - otraCarta.valor;
    }
}
