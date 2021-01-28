
public class L1 
{
	public NodoL1 cabeza;
	
	public void insertarNodo(int valor) 
	{
		NodoL1 nuevo= new NodoL1(valor);
		if(this.cabeza==null) 
		{
			this.cabeza=nuevo;
		}
		else {
			if(valor<this.cabeza.getInfo()) 
			{
				nuevo.setSig(this.cabeza);
				this.cabeza=nuevo;
			}
			else 
				{
				NodoL1 puntero =this.cabeza;
				boolean enc=false;
				while(puntero.getSig()!=null&&!enc)
				{ 
					if(valor>=puntero.getSig().getInfo()) 
					{
						puntero=puntero.getSig();
						}
					else {enc=true;}
				}
				nuevo.setSig(puntero.getSig());
				puntero.setSig(nuevo);
				}
			}	
	}
	
	public void mostrar() 
	{
		NodoL1 puntero;
		puntero =this.cabeza;
		while(puntero!=null) 
		{
			System.out.println(puntero.getInfo());
			puntero=puntero.getSig();
		}
	}
	
	public boolean suprimir(int valor) 
	{
		NodoL1 P,Q;
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
	
	IteradorDeLista getIterador() 
	{
		return new IteradorDeLista(this.cabeza);
	}


}
