
public class MainLista {

	public static void main(String[] args) 
	{
		
		Lista l1=new Lista();
		
		l1.insertarNodo(-100);
	
		l1.insertarNodo(2);
		l1.insertarNodo(89);
		l1.insertarNodo(1);
		l1.insertarNodo(-1);
		l1.insertarNodo(4);
		l1.insertarNodo(9);
		l1.insertarNodo(3);
		
		
		l1.mostrar();
		
		System.out.println(l1.BuscarElemento(8));
		System.out.println(l1.SumaElementos());
		System.out.println("El mayor es "+l1.devolverMayor());
		System.out.println("El menor es "+l1.devolverMenor());
		
		//l1.mostrarConPila();
		
		//System.out.println("Lista con recursividad");
		//l1.mostrarRecursivamenteFinal();
		
		System.out.println("Invirtiendo lista");
		l1.invertirLista();
		l1.mostrar();
		
		
		System.out.println("Copiando lista");
		Lista l2=l1.copiarLista();
		l2.mostrar();
		
		
		
	}
}
