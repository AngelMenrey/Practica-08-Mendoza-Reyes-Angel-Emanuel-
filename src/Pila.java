
import javax.swing.JOptionPane;

public class Pila {
    
public Nodo pila;
    
    public Pila(){
        pila = null;
    }
    
    public void push(int v){
        Nodo nuevo = new Nodo(v);
        if(pila == null){
            pila =  nuevo;
        }
        else{
            Nodo aux = pila;
            
            while(aux.getAptSiguiente() != null){
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
    }
    
    public String recorrerPila(){
        String datos = "";
        Nodo aux = pila;
         if(pila == null){
         JOptionPane.showMessageDialog(null,"LA PILA ESTA VACIA"); 
        }
         
        else{
            while(aux != null){
            JOptionPane.showMessageDialog(null, "EL VALOR ES: "+aux.getValor());
             aux = aux.getAptSiguiente();
            }
        }
        return datos;   
    }
    public String pop(){
       String mensaje =  "";
        Nodo aux = pila;
        if(pila == null){
        JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA");
        }
        else{
            if(aux.getAptSiguiente() == null){
                pila = null;
            }
            else{
                pila = aux.getAptSiguiente();
                JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
            }
        }
        return mensaje;
    }
}
    


    
   