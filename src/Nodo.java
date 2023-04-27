public class Nodo {
    
     private int valor;
    
    private Nodo aptSiguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.aptSiguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Nodo aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
   
}
