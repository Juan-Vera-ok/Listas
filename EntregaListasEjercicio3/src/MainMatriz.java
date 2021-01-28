
public class MainMatriz {

	public static void main(String[] args)
	{
		ListaMatriz lm=new ListaMatriz(2,3);
		ListaMatriz lm2=new ListaMatriz(2,4);

		lm.insertarElemento(5);
		lm.insertarElemento(2);
		lm.insertarElemento(7);
		lm.insertarElemento(15);
		lm.insertarElemento(3);
		lm.insertarElemento(4);
		System.out.println("------Mostrar por Filas------");
		lm.mostrarFilas();
		System.out.println("------Soy-una-barra-separadora------");
		System.out.println("------Mostrar-Por-Columnas------");
		lm.mostrarColumnas();
		System.out.println("------Soy-una-barra-separadora------");
		lm2.insertarElemento(7);
		lm2.insertarElemento(1);
		lm2.insertarElemento(8);
		lm2.insertarElemento(5);
		lm2.insertarElemento(9);
		lm2.insertarElemento(2);
		lm2.insertarElemento(10);
		lm2.insertarElemento(4);
		System.out.println("------Mostrar por Filas------");
		lm2.mostrarFilas();
		System.out.println("------Soy-una-barra-separadora------");
		System.out.println("------Mostrar-Por-Columnas------");
		lm2.mostrarColumnas();
		System.out.println("------Soy-una-barra-separadora------");
		
		
		
	}

}
