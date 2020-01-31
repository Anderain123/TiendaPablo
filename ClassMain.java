import java.util.Scanner;
import java.util.Random;
public class ClassMain
{
    public ClassMain()
    {
    }
    
    public static void main(String[] args)
    {
        boolean seguir = true;
        while(seguir)
        {
        System.out.println("Mi tienda");
        System.out.println("---------");
        System.out.println("1. añadir Producto");
        System.out.println("2. añadir Pedido");
        System.out.println("3. ver todos los Productos");
        System.out.println("4. ver todos los Pedidos");
        System.out.println("5. ver un Producto especifico");
        System.out.println("6. ver un Pedido especifico");
        System.out.println("7. salir");
        
        Almacen almacen = new Almacen();
        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();
        switch(respuesta)
        {
            case 1:
            Producto produ;
            String fabri = "";
            long codigobarras = 0;
            long codigobarrandom = 0; 
            System.out.println("¿Cómo se llama el producto que desea añadir?");
            String nombre = sc.next();
            System.out.println("¿Cuanto cuesta?");
            float precio = sc.nextFloat();
            System.out.println("¿Desea introducir un codigo de barras manual? s/n");
            String siono = sc.next();
            if(siono.equals("s"))
            {
                System.out.println("Dime su codigo de barras");
                codigobarras = sc.nextLong();
            }
            else
            {
                Random r = new Random();
                codigobarrandom = r.nextLong();
            }
            System.out.println("¿Tiene fabricante? s/n");
            String fab = sc.next();
            if(fab.equals("s"))
            {
                System.out.println("Dame el nombre del fabricante");
                fabri = sc.next();
            }
            if(siono.equals("s")&&fab.equals("s"))
            {
                produ = new Producto(nombre,precio,codigobarras,fabri);
                almacen.meterProducto(produ);
            }
            else if(siono.equals("s")&&!fab.equals("s"))
            {
                produ = new Producto(nombre,precio,codigobarras);
                almacen.meterProducto(produ);
            }
            else if(!siono.equals("s")&&fab.equals("s"))
            {
                produ = new Producto(nombre,precio,codigobarrandom,fabri);
                almacen.meterProducto(produ);
            }
            else if(!siono.equals("s")&&!fab.equals("s"))
            {
                produ = new Producto(nombre,precio,codigobarrandom);
                almacen.meterProducto(produ);
            }
            System.out.println("El producto con nombre: " + nombre);
            System.out.println("precio: " + precio);
            if(siono.equals("s"))
                System.out.println("y código: " + codigobarras);
            else
                System.out.println("y código: " + codigobarrandom);
            System.out.println("Ha sido añadido");
            break;
            case 2:
            Pedido pedido;
            long id = 0;
            long idrandom = 0;
            String direccion = "";
            System.out.println("¿Cómo se llama el cliente del pedido?");
            String cliente = sc.next();
            
            System.out.println("¿Desea introducir un id manual? s/n");
            String idres = sc.next();
            if(idres.equals("s"))
            {
                System.out.println("Dime su id");
                id = sc.nextLong();
            }
            else
            {
                Random r = new Random();
                idrandom = r.nextLong();
            }
            System.out.println("¿Tiene direccion? s/n");
            String dire = sc.next();
            if(dire.equals("s"))
            {
                System.out.println("Dame la direccion del cliente");
                direccion = sc.next();
            }
            if(idres.equals("s")&&dire.equals("s"))
                pedido = new Pedido(cliente,id,direccion);
            else if(idres.equals("s")&&!dire.equals("s"))
                pedido = new Pedido(cliente,id);
            else if(!idres.equals("s")&&dire.equals("s"))
                pedido = new Pedido(cliente,idrandom,direccion);
            else if(!idres.equals("s")&&!dire.equals("s"))
                pedido = new Pedido(cliente,idrandom);
            System.out.println("El pedido del cliente: " + cliente);
            if(idres.equals("s"))
                System.out.println("y id: " + id);
            else
                System.out.println("y id: " + idrandom);
            System.out.println("Ha sido añadido");
            break;
            case 3:
            almacen.listarProductos();
            break;
            case 5:
            System.out.println("Dame el codigo de barras del producto que buscas");
            long codabuscar = sc.nextLong();
            almacen.enseñarProducto(codabuscar);
        }  
    }
    }
}
