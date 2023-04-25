package guiadeejerciciosclase5y7;


public class Carrito {
    
    private int idC;
    private Cliente clien;
    private double montoCarrito;
    
    
    public Carrito(int idC, Cliente c){
        
        this.idC= idC;
        this.clien= c;
        
    }
    
    public int dameIdC(){
        return idC;
    }
    public double dameMontoCarrito(){
        return montoCarrito;
    }
    public void mostrarMontoCarrito(double monto){
        montoCarrito= monto;
        System.out.println("----------------------------------------");
        System.out.println("\n");
        System.out.println("\tEl Total de la compra es: $"+montoCarrito);
        System.out.println("\n");

    }
    public Carrito(){
        
    }
}
