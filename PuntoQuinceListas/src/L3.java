
public class L3 {

	public NodoL1 cabeza,ultimo;
		
	public void insertarNodo(int valor) 
	{
		NodoL1 nuevo= new NodoL1(valor);
		if(this.cabeza==null) 
		{
			this.cabeza=nuevo;
			this.ultimo=nuevo;
			this.cabeza.setSig(this.ultimo);
			return;}
			if(valor<this.cabeza.getInfo()) 
			{
				nuevo.setSig(this.cabeza);
				this.cabeza=nuevo;
				this.ultimo.setSig(nuevo);
				return;
			}
			
				
				NodoL1 puntero =this.cabeza;
				boolean enc=false;
				while(puntero.getSig()!=this.cabeza &&!enc)
				{ 
					if(valor>=puntero.getSig().getInfo()) 
					{
						puntero=puntero.getSig();
						}
					else {enc=true;}
				}
				if(enc) 
				{
				nuevo.setSig(puntero.getSig());
				puntero.setSig(nuevo);
				}
					else 
					{nuevo.setSig(this.cabeza);
					puntero.setSig(nuevo);
					this.ultimo=nuevo;
					}
				
			
			
		
	}
	
	public boolean estaVacia() 
	{
		boolean aux=false;
		if(this.cabeza==null)
		{aux=true;}
		return aux;
	}
	
	public void mostrar() 
	{
		NodoL1 P;
		P=this.cabeza;
		if(!this.estaVacia()) {
		do {
			System.out.println(P.getInfo());

			P=P.getSig();
		}while(P!=this.cabeza);
		}else
			System.out.println("Está vacia");
	}
	
	public boolean suprimir(int valor) 
	{
		NodoL1 P,Q;
		Q=this.cabeza;
		P=null;
		boolean enc=false;
		if(Q.getSig()==Q&&Q.getInfo()==(valor)) 
		{this.cabeza=null;
		return enc;}
		while((this.cabeza!=Q.getSig())&&!enc) 
		{
			if(Q.getInfo()==(valor)) 
			{enc=true;}
			else
			{
				P=Q;
				Q=Q.getSig();
			}
		}
		if(Q.getInfo()==(valor)) 
		{enc=true;}
		if(enc)
			if(P==null) {
				NodoL1 puntero=this.cabeza;
				 do{
					 puntero=puntero.getSig();
				}while(puntero.getSig()!=this.cabeza);
				this.cabeza=this.cabeza.getSig();
				puntero.setSig(this.cabeza);
			}else
				P.setSig(Q.getSig());
		
		
		return enc;
	}
	
	IteradorDeLista3 getIterador() 
	{
		return new IteradorDeLista3(this.cabeza);
	}
	
	
}
