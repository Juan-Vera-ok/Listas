
public class ListaLoca 
{
Nodo cabeza;
	
	
	public void insertar(int valor)
	{
		
		Nodo nuevo = new Nodo(valor);
		if(this.cabeza==null) 
		{cabeza=nuevo;}
		else {
		Nodo aux=this.cabeza;
		while(aux.getSig()!=null) 
		{
			aux=aux.getSig();
		}
		aux.setSig(nuevo);
		}
	}
	
	public void insertarEn(int posicion,int valor) 
	{
		Nodo nuevo = new Nodo(valor);
		if(posicion==0) 
		{
			nuevo.setSig(this.cabeza);
			this.cabeza=nuevo;
		}
		else {
			Nodo puntero=this.cabeza;
			int posicionesTotales=0;
			while(puntero!=null) 
			{
				posicionesTotales=posicionesTotales+1;
				puntero=puntero.getSig();
			}
			Nodo punteroTestigo=null;
			puntero=this.cabeza;
			if(posicion<=posicionesTotales) 
			{
				int count=0;
				do 
				{
					count=count+1;
					punteroTestigo=puntero;
					puntero=puntero.getSig();
				}while(count!=posicion);
				
				punteroTestigo.setSig(nuevo);
				nuevo.setSig(puntero);
				
			}
			punteroTestigo=null;
			puntero=this.cabeza;
			if(posicion>posicionesTotales) 
			{
				if(valor<500)
				{
				int count=0;
				if(posicionesTotales!=1) 
					{
						do
						{
							count=count+1;
							punteroTestigo=puntero;
							puntero=puntero.getSig();
						}while(count!=(posicionesTotales-1));
						punteroTestigo.setSig(nuevo);
						nuevo.setSig(puntero);
					}
				else 
					{nuevo.setSig(this.cabeza);
					this.cabeza=nuevo;
						
					}
				}
				else 
				{
					nuevo.setSig(this.cabeza.getSig());
					this.cabeza.setSig(nuevo);
					
				}
			}
		
		}
		
	}
	
	public void eliminarEl(int posicion) 
	{
		Nodo puntero=this.cabeza;
		int posicionesTotales=0;
		while(puntero!=null) 
		{
			posicionesTotales=posicionesTotales+1;
			puntero=puntero.getSig();
		}
		if(posicion>=posicionesTotales||posicion==0) 
		{
			this.cabeza=this.cabeza.getSig();
		}
		else {
				Nodo punteroTestigo=null;
				puntero=this.cabeza;
				int count=0;
				do 
				{
					count=count+1;
					punteroTestigo=puntero;
					puntero=puntero.getSig();
				}while(count!=posicion);
				punteroTestigo.setSig(puntero.getSig());
			}
		
		
		
	}
	
	
	
	
	
	public boolean suprimir(int valor) 
	{
		Nodo P,Q;
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
	
	
	
	
	public void mostrar() 
	{
		Nodo puntero;
		puntero =this.cabeza;
		while(puntero!=null) 
		{
			System.out.println(puntero.getInfo());
			puntero=puntero.getSig();
		}
	}
	
	public boolean BuscarElemento(int buscado)
	{
		
		boolean enc=false;
		Nodo puntero;
		puntero=this.cabeza;
		while(puntero!=null&&enc==false) 
		{
			if(puntero.getInfo()==buscado) 
			{enc=true;}
			else
			{
			
			
		puntero=puntero.getSig();
			}
		}
		return enc;
	}
	

}
