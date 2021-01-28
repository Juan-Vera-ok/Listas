import java.util.*;
public class Lista 
{
	Nodo lista;
	int mayor, menor;
	
	


	public void insertarNodo(int valor) 
	{
		Nodo nuevo= new Nodo(valor);
		if(this.lista==null) 
		{
			this.lista=nuevo;
			this.mayor=this.lista.getInfo();
			this.menor=this.lista.getInfo();
	
		}
		else {
			if(valor<this.lista.getInfo()) 
			{
				this.menor=valor;
				nuevo.setSig(this.lista);
				this.lista=nuevo;
			}
			else 
				{
	
				if(valor>this.mayor) {
				this.mayor=valor;}
				Nodo puntero =this.lista;
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
	
	public boolean BuscarElemento(int buscado)
	{
		
		boolean enc=false;
		Nodo puntero;
		puntero=this.lista;
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
	
	public int SumaElementos() 
	{
		int total=0;
		Nodo puntero;
		puntero=this.lista;
		while(puntero!=null) 
		{
			total=total+puntero.getInfo();
			puntero=puntero.getSig();
		}
		
		return total;
	}
	
	
	
	public int devolverMayor() 
	{return this.mayor;}
	
	public int devolverMenor() 
	{return this.menor;}
	
	public Nodo getLista() 
	{return this.lista;}
	
	public void setLista(Nodo a) 
	{this.lista=a;}
	
	
	public void mostrar() 
	{
		Nodo puntero;
		puntero =this.lista;
		while(puntero!=null) 
		{
			System.out.println(puntero.getInfo());
			puntero=puntero.getSig();
		}
	}
	
	public void mostrarConPila() 
	{
		Stack pilaAux= new Stack();
		Nodo puntero;
		puntero =this.lista;
		while(puntero!=null) 
		{
			pilaAux.push(puntero);
			puntero=puntero.getSig();
		}
		while(!pilaAux.isEmpty()) 
		{
		Nodo a=(Nodo)pilaAux.pop();
		System.out.println(a.getInfo());
		}
	}
	
	public void mostrarRecursivamenteFinal() 
	{

		
		Stack pilaAux= new Stack();
		Nodo puntero;
		puntero =this.lista;
		while(puntero!=null) 
		{
			pilaAux.push(puntero);
			puntero=puntero.getSig();
		}
		Nodo a=(Nodo)pilaAux.pop();
		a.setSig(null);
		Lista listaAux = new Lista();
		listaAux.setLista(a);
		Nodo punteroAux=listaAux.getLista();
		while(!pilaAux.isEmpty()) 
		{
			Nodo c=(Nodo)pilaAux.pop();
			c.setSig(null);
			punteroAux.setSig(c);
			punteroAux=punteroAux.getSig();
		}
		mostrarRecursivamente(listaAux.getLista());
	}
	
	private void mostrarRecursivamente(Nodo p) 
	{
		if(p!=null) {
			System.out.println(p.getInfo());
		mostrarRecursivamente(p.getSig());}
	}
	
	
	public void invertirLista() 
	{
		Stack pilaAux= new Stack();
		Nodo puntero;
		puntero =this.lista;
		while(puntero!=null) 
		{
			pilaAux.push(puntero);
			puntero=puntero.getSig();
		}
		Nodo a=(Nodo)pilaAux.pop();
		this.lista=a;
		while(!pilaAux.isEmpty()) 
		{
			Nodo b=(Nodo)pilaAux.pop();
			b.setSig(null);
			this.lista.setSig(b);
			lista=lista.getSig();
			
		}
		this.setLista(a);
	}
	
	public Lista copiarLista() 
	{
		Lista copiaLista = new Lista();
		Nodo puntero3;
		puntero3 =this.lista;
		copiaLista.setLista(puntero3);
		while(puntero3!=null) 
		{
			puntero3=puntero3.getSig();
			copiaLista.getLista().setSig(puntero3);
			copiaLista.setLista(puntero3);
			
		}
		copiaLista.setLista(this.lista);
		return copiaLista;
		
		
		
	}
	
	
	

}
