
public class L2 
{
	NodoL2 cabeza;
	
	public void insertarNodo(int valor) 
	{
		NodoL2 nuevo= new NodoL2(valor);
		if(this.cabeza==null) 
		{
			this.cabeza=nuevo;
		}
		else {
			if(valor<this.cabeza.getInfo()) 
			{
				nuevo.setSig(this.cabeza);
				this.cabeza.setAnt(nuevo);
				this.cabeza=nuevo;
			}
			else 
				{
				NodoL2 puntero =this.cabeza;
				boolean enc=false;
				while(puntero.getSig()!=null&&!enc)
				{ 
					if(valor>=puntero.getSig().getInfo()) 
					{
						puntero=puntero.getSig();
						}
					else {enc=true;}
				}
				if(enc==true) {
				nuevo.setAnt(puntero);
				nuevo.setSig(puntero.getSig());
				puntero.setSig(nuevo);
				nuevo.getSig().setAnt(nuevo);
					}else 
					{
						nuevo.setAnt(puntero);
						nuevo.setSig(puntero.getSig());
						puntero.setSig(nuevo);
					}
				}
			}	
	}
	
	public void mostrar() 
	{
		NodoL2 puntero;
		puntero =this.cabeza;
		while(puntero!=null) 
		{
			System.out.println(puntero.getInfo());
			puntero=puntero.getSig();
		}
	}
	
	public boolean suprimir(int valor) 
	{
		NodoL2 Q;
		Q=this.cabeza;
		boolean enc=false;
		if(this.cabeza==Q&&Q.getInfo()==valor&&Q.getAnt()==null&&Q.getSig()==null) 
		{this.cabeza=null;}else {
		while(Q!=null &&!enc) 
		{
			if(Q.getInfo()==valor) 
			{enc=true;}
			else
			{
				Q=Q.getSig();
			}
		}
		if(enc)
		{
			if(Q.getAnt()==null&&Q.getInfo()==valor) 
			{
				this.cabeza=this.cabeza.getSig();
				Q.getSig().setAnt(null);;
			}else {
				if(Q.getSig()==null&&Q.getInfo()==valor) 
				{
					Q.getAnt().setSig(null);
					Q.setAnt(null);
				}else {
			Q.getSig().setAnt(Q.getAnt());
			Q.getAnt().setSig(Q.getSig());}
			}
		}
		}
		
		return enc;
	}
	
	IteradorDeLista2 getIterador() 
	{
		return new IteradorDeLista2(this.cabeza);
	}
	

}
