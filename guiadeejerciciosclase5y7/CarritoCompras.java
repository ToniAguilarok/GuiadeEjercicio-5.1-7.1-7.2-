package guiadeejerciciosclase5y7;

import java.time.LocalDate;


public class CarritoCompras {
    
    public static void main (String[] args){
            
    Producto prod1 = new Producto (001, "Yerba", 1250.00, "Yerba Mate Playadito 1Kg", 100);
    Producto prod2 = new Producto (002, "Agua", 200.00,"Agua Mineral AquaLive 1LT", 500);
    Producto prod3 = new Producto (003, "Mayonesa", 1100.00,"Mayonesa Hellmans 500grm", 238);
    
  /*  prod1.mostrarProducto();
    prod2.mostrarProducto();
    prod3.mostrarProducto();
           ASI SE MUESTRA SIN USAR EL SYSTEM.OUTPRINT
    */
    Cliente per1= new Cliente (36458243, "Aguilar Alejandro","Punta alta 308","1215747889","elneon92@gmail.com");
    Cliente per2= new Cliente (36458243, "Lucas Perez","Beltramen 145","948513641","Lucas87@gmail.com");
    Cliente per3= new Cliente (36458243, "Juan Florindo","Sarmiento 420","776425420","JuanchoFlorindo@gmail.com");
   
    
    Cliente per4= new Cliente (15654486, "Miguel");       //          SOBRECARGA DE CONSTRUCTORES
                                                                    // EJEMPLO CUANDO NECESITAMOS POR DEFECTO O NO HAY
                                                                    // INFORMACION DE LOS OTROS PARAMETROS FALTANTES
                                                                 
    // PARA MOSTRAR PERSONA POR CONSOLA
   /* per1.mostrarPersona();
    per2.mostrarPersona();
    per3.mostrarPersona(); 
    per4.mostrarPersona();
    ASI SE MUESTRA SIN USAR EL SYSTEM.OUTPRINT
    */   
    
    
    Carrito carro1 = new Carrito (005,per1 );  // instanciamos un nuevo carro desde la clase Carrito (se rellena con idC y cliente)
    
    
    itemsCarrito itemsC1[] = new itemsCarrito[3];  // instanciamos un nuevo vector que llevara 3 itemsCarrito (new carrito[idC,cliente], new producto[codigo,nombre,precio, descripcion], cant)
    
    itemsC1[0]= new itemsCarrito (carro1, prod1, 3);   //
    itemsC1[1]= new itemsCarrito (carro1, prod2, 5);   // instanciamos la funcion itemsCarrito de la clase usando los 3 lugares en el vector
    itemsC1[2]= new itemsCarrito (carro1, prod3, 1);   //
    
    itemsC1[0].dameTitulo(); //imprimimos por pantalla la funcion dametitulo creada en itemCarrito
    
    
    
    
    
    double monto = mostrarComprasPorConsola(itemsC1, carro1, per1);      // aca se genera el monto mostrando la funcion de abajo 
    carro1.dameMontoCarrito();                                        // tambien se lo utiliza como valor inicial a las funciones en descuento y sus herederas
    
    
    //trabajando el descuento
    /*
    Descuento desc1 = new DescuentoFijo(); //creamos un nuevo obj desc1, a diferencia de la herencia normal, cuando es
                                           //una clase abstracta se usa a sus herederos para darle valor al nuevo objeto desc1
    
    desc1.asignaMontoDescFijo(250);       //usando un valor fijo para la funcion dameMontoDescFijo en la clase Descuento
    
    
    System.out.println("El monto total con descuento fijo por Lunes (250) es: $"+ desc1.valorFinal(monto)+"\n\t ** Ejemplo Asignado manualmente **");
    System.out.println("------------------------------------------------------------\n");
    desc1.asignaMontoDescPorcentaje(0.1); // ASIGNANDO (EJEMPLO 10%[0.1]) UN MONTO PARA UN DESCUENTO EN PORCENTAJE. CON FUNCION CREADA EN DESCUENTO
    
    System.out.println("El monto total con un descuento del 10% es: $" + (monto - (desc1.dameMontoDesc()*monto))+"\n\t ** Ejemplo Asignando manualmente **");
    System.out.println("------------------------------------------------------------\n");
    //USANDO DESCUENTO CON PORCENTAJE Y CONDICION (> A 10000)
    Descuento desc2 = new DescuentoPorcentaje(); // creamos un nuevo obj desc2 y como es una clase abstracta se usa a sus herederos para crear un new (clase heredera)
    
    desc2.asignaMontoDescFijo(0.01); // ASIGNANDO (EJEMPLO 10%[0.01]) un monto para desc con porcentaje usando la clase DescuentoPorcentaje
    
    System.out.println("El monto total con un descuento del 15% es: $" +desc2.valorFinal(monto)+"\n** Por haber superado la condicion en DescuentoPorcentaje **");
    System.out.println("------------------------------------------------------------\n");
    
        // DESCUENTO SI SUPERA LOS 10000
      */ 
    carro1.mostrarMontoCarrito(monto);
    descuentos(monto);
    
    
    
    }
        
    
        //la funcion mostrarCompras recibe un new itemsCarrito(itemsC1) un nuevo carrito (carro1) y el cliente(per1)
        // se la crea aca fuera del main despues de generar todos los datos que usaremos
                                    //clase items en ese carrito, clase nuevo carrito generado, Clase y persona agregada a la DB
    
        public static double mostrarComprasPorConsola(itemsCarrito itemsC1[], Carrito carro1, Cliente per1){
        
         double suma = 0;       
            for (itemsCarrito i : itemsC1){      //un for para 
              i.mostrarItem();                   //mostrarItem (Imprime (" "+can+"\t"+p.un_precio()+"\t"+montoItem+"\t\t"+p.un_nombre());
              suma = suma + i.dameMontoItem();   //montoItem = p.un_precio() * can; todas estas funciones estan en itemsCarrito
            }
            
        return suma;
        
        }
        //cambiando el precio de un producto y si supera los 10000 da un descuento del 15%
        // si el monto no supera 10k el descuento en dia par es 450 y impar 7%
        
     public static void descuentos(double monto) { //ASIGNAMOS EL DESCUENTO SEGUN EL DIA, PAR = 1350 DE DEDSCUENTO, IMPAR = %15 [0.15]
		
		LocalDate fecha = LocalDate.now();  //2023-04-03 la fecha
		int dia = fecha.getDayOfMonth();    
                
		if (monto>10000){
                    dia=1;   
                }
                if (dia%2==0) {
		Descuento desc1 = new DescuentoFijo();
                
		desc1.asignaMontoDescFijo(450);
                System.out.println("----------------------------------------\n");
                System.out.println("El Descuento por ser dia par es de $450\n");
		System.out.println("El monto total con descuento es: $"+desc1.valorFinal(monto)+"\n");
		}
                
		else {                    
		Descuento desc2 = new DescuentoPorcentaje();
	
		desc2.asignaMontoDescFijo(0.07);

		System.out.println("El monto total con descuento es: $"+desc2.valorFinal(monto)+"\n");
		}
                }
	}    
        
    

