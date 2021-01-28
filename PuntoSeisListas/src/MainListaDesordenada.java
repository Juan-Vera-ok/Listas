
public class MainListaDesordenada {

	public static void main(String[] args) {
		ListaDesordenada l1=new ListaDesordenada();
		
		
		l1.insertarPrimero(10);
		l1.insertarUltimo(7);
		l1.insertarUltimo(1);
		l1.insertarUltimo(4);
		l1.insertarPrimero(6);
		
		l1.mostrar();
		
		
		System.out.println(l1.BuscarElemento(4));
		
		l1.suprimir(6);
		l1.mostrar();

	}

}
