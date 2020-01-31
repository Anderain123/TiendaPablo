import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Almacena pedidos en formato HashMap
 *
 * @author David L.F.
 * @version (a version number or a date)
 */
public class Albaran
{
    
    HashMap<Long, Pedido> albaran;
    /**
     * Constructor for objects of class Albaran
     */
    public Albaran()
    {
        albaran = new HashMap<>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void meterPedido(Pedido pedidito)
    {
      albaran.put(pedidito.getId(),pedidito);  
    }
    public void listarPedidos(){
    Iterator<Long> it= albaran.keySet().iterator();
    while(it.hasNext()){
        System.out.println(albaran.get(it.next()).toString());
    }
    
    }
    public void pedidoEspecifico(long clavedelPedido){
        System.out.println(albaran.get(clavedelPedido).toString());
    }
}
