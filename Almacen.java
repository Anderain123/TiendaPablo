import java.util.ArrayList;
/**
 * Es el gestor de almacen de nuestra tienda y almacena los productos que hemos hecho.
 * 
 * @author Ander
 * @version 28/01/2020
 * @see Producto
 */
public class Almacen
{
    
    private ArrayList<Producto> almacen;

    public Almacen()
    {
        almacen = new ArrayList();
    }
    /**
     * Introduce un producto en el almacen.
     * @param Producto producto que vayamos a meter.
     */
    public void meterProducto(Producto produ)
    {
        almacen.add(produ);
    }
    /**
     * Lista los productos existentes en el almacen.
     */
    public void listarProductos()
    {
        for(Producto productito: almacen)
            System.out.println(productito.toString());
    }
    /**
     * Busca un producto en concreto y lo muestra.
     * @param long el codigo de barras del producto
     */
    public void enseñarProducto(long codigobarras)
    {
        for(int i = 0;i<almacen.size();i++)
        {
            if(almacen.get(i).getCodigo_de_barras()==codigobarras)
            {
                System.out.println(almacen.get(i).toString());
                break;
            } 
        }
    }
}
