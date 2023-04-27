import javax.swing.JOptionPane;

public class Cola {
     public Nodo cola;
    
    public Cola(){
        cola = null;
    }
    
    public void encolar(int v){
        Nodo nuevo = new Nodo(v);
        if(cola == null){
            cola =  nuevo;
        }
        else{
            Nodo aux = cola;
            
            while(aux.getAptSiguiente() != null){
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
    }
    
    public String recorrerCola(){
      String datos = "";
        Nodo aux = cola;
         if(cola == null){
         JOptionPane.showMessageDialog(null,"LA COLA ESTA VACIA"); 
        }
         
        else{
            while(aux != null){
            JOptionPane.showMessageDialog(null, "EL VALOR ES: "+aux.getValor());
             aux = aux.getAptSiguiente();
            }
        }
        return datos;   
    }
        
    public String desencolar(){
        
        String mensaje =  "";
        Nodo aux = cola;
        if(cola == null){
        JOptionPane.showMessageDialog(null, "LA COLA ESTA VACIA");
        }
        else{
            if(aux.getAptSiguiente() == null){
                cola = null;
            }
            else{
                cola = aux.getAptSiguiente();
                JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
            }
        }
        return mensaje;
    }

}
