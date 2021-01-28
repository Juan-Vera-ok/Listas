
public class ListaElementos 
{
	public Nodo cabeza;
	
	
	public void InsertarElemento(int valor) 
	{

		Nodo nuevo = new Nodo(valor);
		if(this.cabeza==null){
		this.cabeza=nuevo;
		}
		else
		{
			Nodo aux=this.cabeza;
			Nodo aux2=this.cabeza;
			boolean enc=false;
			
			do {
				if(aux2.getInfo()==valor) 
				{
					aux2.setCont((aux2.getCont())+1);
				enc=true;
				}
				aux2=aux2.getSig();
			}while(aux2!=null&&enc==false);
			if(enc==false) {
			while(aux.getSig()!=null) 
			{
				aux=aux.getSig();
			}
			aux.setSig(nuevo);
			
			}
			
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
		if(enc) {
			if(P==null) {
				Q.setCont((Q.getCont())-1);
				if(Q.getCont()==0) {
				this.cabeza=this.cabeza.getSig();
								   }
						}
						else 
						{
							Q.setCont((Q.getCont())-1);
							if(Q.getCont()==0) 
							{
							P.setSig(Q.getSig());
							}
						}
		}
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
		}if(this.cabeza==null)
			System.out.println("Lista vacia");
	}
	
	
	
	
	
	
}
