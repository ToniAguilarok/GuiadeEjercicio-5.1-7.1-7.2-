package guiadeejerciciosclase5y7;

public class itemsCarrito {
	private Carrito num;
	private Producto p;
	private int cant;
	private double montoItem;
	
	public itemsCarrito(Carrito numero, Producto prod ,int cant) {
		
		num = numero;
		p = prod;
		this.cant = cant;
		montoItem = p.un_precio() * cant;
	}
        public itemsCarrito() {		
		}

	public double dameMontoItem() {
		return montoItem;
	}
	public int dameCantidad() {
		return cant;
	}
	public void mostrarItem() {
		System.out.println(" "+cant+"\t"+p.un_precio()+"\t"+montoItem+"\t\t"+p.un_nombre());
		
	}
        
	public void dameTitulo() {
		System.out.println("Cant\tPrecio\tSubTotal\tProducto");
                System.out.println("----------------------------------------");
	}

}
