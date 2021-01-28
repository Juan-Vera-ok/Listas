
public class Main {

	public static void main(String[] args) 
	{
		L1 listaUno= new L1();
		L2 listaDos= new L2();
		L3 listaTres=new L3();
		
		System.out.println("----------Lista 1----------");
		listaUno.insertarNodo(1);
		listaUno.insertarNodo(2);
		listaUno.insertarNodo(33);
		listaUno.insertarNodo(4);
		listaUno.insertarNodo(5);
		
		listaUno.mostrar();
		
		System.out.println("----------Lista 2----------");
		listaDos.insertarNodo(12);
		
		listaDos.insertarNodo(2);
		listaDos.insertarNodo(33);
		
		listaDos.insertarNodo(4);
		listaDos.insertarNodo(5);

		listaDos.mostrar();
		
		System.out.println("----------Lista 3----------");
		listaTres.insertarNodo(33);
		listaTres.insertarNodo(44);
		listaTres.insertarNodo(55);
		listaTres.insertarNodo(66);
		listaTres.mostrar();
		
		System.out.println("---------------------------");
		System.out.println("Actualizar listas");
		IteradorDeLista i1=listaUno.getIterador();
		


	
		
		while(i1.tieneProximo()) 
		{
			IteradorDeLista2 i2=listaDos.getIterador();
			IteradorDeLista2 aux2=i2;
				while(aux2.tieneProximo())
					{
						if(aux2.getActual()==i1.getActual()) 
						{
							listaDos.suprimir(i1.getActual());
						}	
						aux2.proximo();
					}
				i1.proximo();
			
		}
		IteradorDeLista ii1=listaUno.getIterador();
		
		while(ii1.tieneProximo()) 
		{
			IteradorDeLista3 i3=listaTres.getIterador();
			IteradorDeLista3 aux3=i3;
			boolean enc=false;
			
			while (true) {
				  if(ii1.getActual()==aux3.getActual()) 
				  {enc=true;
				  break;}
				  if (aux3.tieneProximo()) {
				    aux3.proximo();
				  } else {
				    break;
				  }
				}
				if(!enc) {
				System.out.println("Insertando "+ii1.getActual());
				System.out.println("------------Before------------");
				listaTres.mostrar();
				System.out.println("------------Before------------");
				listaTres.insertarNodo(ii1.getActual());
				System.out.println("-------------After-----------");
				listaTres.mostrar();
				System.out.println("------------After------------");
				listaUno.suprimir(ii1.getActual());
				}
			ii1.proximo();
		} 
		
		
		
		
		
		
		System.out.println("----------Lista 1----------");
		listaUno.mostrar();
		
		System.out.println("----------Lista 2----------");
		listaDos.mostrar();
		
		System.out.println("----------Lista 3----------");
		listaTres.mostrar();
		
		System.out.println("Fin");
	}
}


