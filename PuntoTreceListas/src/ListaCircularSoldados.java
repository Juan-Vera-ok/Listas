
public class ListaCircularSoldados 
{
	public NodoSoldado cabeza;
	
	public void insertarSoldado(String valor) 
	{
		NodoSoldado nuevo =  new NodoSoldado(valor);
		if(this.cabeza==null) 
		{this.cabeza=nuevo;
		this.cabeza.setSig(this.cabeza);}
			else
			{
				NodoSoldado puntero=this.cabeza;
				do {
					puntero=puntero.getSig();
				}while(puntero.getSig()!=this.cabeza);
				puntero.setSig(nuevo);
				nuevo.setSig(this.cabeza);
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
		NodoSoldado P;
		P=this.cabeza;
		if(!this.estaVacia()) {
		do {
			System.out.println(P.getInfo());
			P=P.getSig();
		}while(P!=this.cabeza);
		}else
			System.out.println("Está vacia");
	}
	
	public void escapar(int n) 
	{
		NodoSoldado Q;
		Q=this.cabeza;
		int countSoldados=1;
		int countAux=1;
		while(this.cabeza.getSig()!=this.cabeza) {
			
			while(n!=countAux) 
			{
				Q=Q.getSig();
				countAux=countAux+1;
			}
			countAux=0;
			this.suprimir(Q.getInfo());
			System.out.println("Soldado eliminado número "+countSoldados+":");
			countSoldados=countSoldados+1;
		System.out.println("Soldado "+Q.getInfo()+" eliminado");
		System.out.println("----------------------------------");
		this.mostrar();
		System.out.println("----------------------------------");
		}
		System.out.println("Soldado "+this.cabeza.getInfo()+" ha escapado con éxito.");
	}
	
	
	public boolean suprimir(String valor) 
	{
		NodoSoldado P,Q;
		Q=this.cabeza;
		P=null;
		boolean enc=false;
		if(Q.getSig()==Q&&Q.getInfo().equals(valor)) 
		{this.cabeza=null;
		return enc;}
		while((this.cabeza!=Q.getSig())&&!enc) 
		{
			if(Q.getInfo().equals(valor)) 
			{enc=true;}
			else
			{
				P=Q;
				Q=Q.getSig();
			}
		}
		if(Q.getInfo().equals(valor)) 
		{enc=true;}
		if(enc)
			if(P==null) {
				NodoSoldado puntero=this.cabeza;
				 do{
					 puntero=puntero.getSig();
				}while(puntero.getSig()!=this.cabeza);
				this.cabeza=this.cabeza.getSig();
				puntero.setSig(this.cabeza);
			}else
				P.setSig(Q.getSig());
		
		
		return enc;
	}
	
	

}
