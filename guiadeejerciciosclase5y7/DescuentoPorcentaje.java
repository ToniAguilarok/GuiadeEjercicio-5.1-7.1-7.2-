package guiadeejerciciosclase5y7;

public class DescuentoPorcentaje extends Descuento{
    
    
    // descuento porcentaje si supera los 10000 pesos la compra
    // en caso de no superar descuento del 1%
    private final double montoMenor = 10000;

	public double valorFinal(double montoInicial) {
		
		
		if (montoInicial > montoMenor ) {
                    System.out.println("------------------------------------------------------\n");
                        System.out.println("El descuento es del 15% po r superar los $10000");
			return montoInicial -(montoInicial * 0.15);
		}
		else 
                    System.out.println("----------------------------------------\n");
                    System.out.println("El Descuento por ser dia impar es de 7% \n");
		return montoInicial -(montoInicial * this.dameMontoDesc());	
		}
        
        
}


