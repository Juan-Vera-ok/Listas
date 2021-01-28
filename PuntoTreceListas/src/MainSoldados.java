
public class MainSoldados 
{
	public static void main(String[] args) 
	{
		ListaCircularSoldados ls = new ListaCircularSoldados();
		
		ls.insertarSoldado("A");
		ls.insertarSoldado("B");
		ls.insertarSoldado("C");
		ls.insertarSoldado("D");
		ls.insertarSoldado("E");
		
		
		System.out.println("--------------");
		ls.mostrar();

		System.out.println("--------------");
		
		ls.escapar(3);
		
		
		
	}
}
