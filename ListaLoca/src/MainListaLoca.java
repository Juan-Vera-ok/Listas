
public class MainListaLoca {

	public static void main(String[] args) 
	{
		ListaLoca ll1= new ListaLoca();
		
		ll1.insertar(1);
		
		ll1.insertar(2);
		
		ll1.insertar(3);
		
		ll1.insertar(4);
		
		ll1.insertarEn(999, 499);
		
		
		
		ll1.mostrar();
		
		System.out.println("-----------------------");
		
		ll1.eliminarEl(5);
		
		

		ll1.mostrar();
		
	}

}
