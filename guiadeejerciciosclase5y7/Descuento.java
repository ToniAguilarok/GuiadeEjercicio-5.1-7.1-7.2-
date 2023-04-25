package guiadeejerciciosclase5y7;

public abstract class  Descuento {
    
    private double monto; // como atributro propio de la clase se usa la variable MONTO creada en el main carritocompras
   
    public double dameMontoDesc(){
        return monto;        
        }
    
    public void asignaMontoDescFijo (double monto){
        this.monto=monto;
        }
     public void asignaMontoDescPorcentaje (double monto){
        this.monto=monto;
        }
    
    public abstract double valorFinal(double montoInicial);
    
}
