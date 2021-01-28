
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

	
	
	

}
