package guiadeejerciciosclase5y7;

public class DescuentoFijo extends Descuento{
    
    
    public double valorFinal(double montoInicial){
        return montoInicial - this.dameMontoDesc();
    }

    
    
}
