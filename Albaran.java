import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Almacena pedidos en formato HashMap en un albarán
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
     * Agrega un pedido al albaran
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void meterPedido(Pedido pedidito)
    {
        albaran.put(pedidito.getId(),pedidito);  
    }

    /**
     * Lista todos los pedidos almacenados en el albaran
     * @param nada
     * @return lista imprime albaran
     */
    public void listarPedidos(){
        Iterator<Long> it= albaran.keySet().iterator();
        while(it.hasNext()){
            System.out.println(albaran.get(it.next()).toString());
        }

    }
    /**
     * Muestra un pedido especifico del albaran
     * 
     * @param long 
     * @return devuelte el valor de la clave calvedelPedido del albaran
     */
    public void pedidoEspecifico(long clavedelPedido){
        System.out.println(albaran.get(clavedelPedido).toString());
    }
}
