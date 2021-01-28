public class MainCaracteres {

	public static void main(String[] args) 
	{
		
		ListaCaracteres Vocales=new ListaCaracteres();
		ListaCaracteres Consonantes=new ListaCaracteres();
		
		Vocales.insertarNodo('A');
		Vocales.insertarNodo('E');
		Vocales.insertarNodo('I');

		Consonantes.insertarNodo('G');
		Consonantes.insertarNodo('L');		
		Consonantes.insertarNodo('T');
		Consonantes.insertarNodo('P');
		Consonantes.insertarNodo('N');

		System.out.println("Vocales");
		Vocales.mostrar();
		System.out.println("----------------------");

		System.out.println("Consonantes");
		Consonantes.mostrar();
		
		
		
			
			//IteradorDeListaCaracteres ii1=Consonantes.getIterador();
			//IteradorDeListaCaracteres ii2=Vocales.getIterador();
		String a,b;

		System.out.println("----------------");
		System.out.println("Silabas posibles:");
		System.out.println("----------------");
				/*while(ii1.tieneProximo()) 
				{
					a=ii1.getActual();
					while(ii2.tieneProximo()) 
					{
						b=ii2.getActual();
						System.out.println(a+b);
						ii2.proximo();
					}
					System.out.println("-----------");
					if(ii1.tieneProximo()) {
					ii1.proximo();}
					else 
					{break;}
					IteradorDeListaCaracteres auxi2=Vocales.getIterador();
					ii2=auxi2;
				}*/
		
		Vocales.SilabasPosibles(Consonantes, Vocales);
		
		
		
		}
}
