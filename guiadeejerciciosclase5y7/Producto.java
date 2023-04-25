
package guiadeejerciciosclase5y7;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private String descripcion;
    private int stock;
    
    //metodo constructor Producto
    
    public Producto(int cod, String nomb, double prec, String descr, int stk){
        
        codigo = cod;
        nombre = nomb;
        precio = prec;
        descripcion = descr;
        stock = stk;
    }

    // metodo Getters
    
    public int un_codigo(){
        return codigo;
    }
    public String un_nombre(){
        return nombre;
    }
    public double un_precio(){
        return precio;
    }
    public String una_descripcion(){
        return descripcion;
        }
    public int un_stock(){
        return stock;
    }
    
    
    public void mostrarProducto (){
        
        System.out.println("Productos: ");
        System.out.println("Codigo: " + codigo + " -- " + "Nombre: " + nombre );    
        System.out.println("Precio: " + precio + " -- " + "Descripcion: " + nombre );    
        System.out.println("Stock: " + stock + " -- ");
        
        

        
        
    }
    
    
    }
    
