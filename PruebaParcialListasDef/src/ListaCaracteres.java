public class ListaCaracteres
{
	NodoCaracter cabeza;
	
	
	void insertarNodo(char valor)
	{
		NodoCaracter nuevo=new NodoCaracter(valor);
		
		if(cabeza==null) 
		{
			this.cabeza=nuevo;
			return;
		}
		NodoCaracter puntero=this.cabeza;
		
		while(puntero.getSig()!=null) 
		{
			puntero=puntero.getSig();
		}
		
		puntero.setSig(nuevo);		
	}
	
	
	public void mostrar() 
	{
		NodoCaracter puntero;
		puntero =this.cabeza;
		while(puntero!=null) 
		{
			System.out.println(puntero.getInfo());
			puntero=puntero.getSig();
		}
	}
	
	
	
	public boolean suprimir(char valor) 
	{
		NodoCaracter P,Q;
		Q=this.cabeza;
		P=null;
		boolean enc=false;
		while(Q!=null &&!enc) 
		{
			if(Q.getInfo()==valor) 
			{enc=true;}
			else
			{
				P=Q;
				Q=Q.getSig();
			}
		}
		if(enc)
			if(P==null)
				this.cabeza=this.cabeza.getSig();
			else
				P.setSig(Q.getSig());
		return enc;
	}
	
	void SilabasPosibles(ListaCaracteres lA, ListaCaracteres lB) 
	{
		IteradorDeListaCaracteres ii1=lA.getIterador();
		IteradorDeListaCaracteres ii2=lB.getIterador();
		char a,b;
		while(ii1.tieneProximo()) 
		{
			a=ii1.getActual();
			while(ii2.tieneProximo()) 
			{
				b=ii2.getActual();
				System.out.println(a+""+b);
				ii2.proximo();
			}
			System.out.println("-----------");
			if(ii1.tieneProximo()) {
			ii1.proximo();}
			else 
			{break;}
			IteradorDeListaCaracteres auxi2=lB.getIterador();
			ii2=auxi2;
			
			
			
		}
	}
	
	IteradorDeListaCaracteres getIterador()
	{
		return new IteradorDeListaCaracteres(this.cabeza);
	}
	
	

}
