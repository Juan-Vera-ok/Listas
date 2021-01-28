
public class ListaDesordenada 
{
	Nodo cabeza;
	
	
	public void insertarPrimero(int valor) 
	{
		Nodo nuevo = new Nodo(valor);
		nuevo.setSig(this.cabeza);
		this.cabeza=nuevo;
		
		
		
	}
	
	public void insertarUltimo(int valor)
	{
		Nodo nuevo = new Nodo(valor);
		Nodo aux=this.cabeza;
		if(this.cabeza==null) 
		{this.cabeza=nuevo;}
		else {
		while(aux.getSig()!=null) 
		{
			aux=aux.getSig();
		}
		aux.setSig(nuevo);
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
