
public class Nodo 
{
	private int info;
	private Nodo sig;
	
	public Nodo(int valor) 
	{
		this.info = valor;
		this.sig = null;
	}

	public void setInfo(int info) {
		this.info = info;
	}
	
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
	
	public int getInfo() {
		return info;
	}
	
	public Nodo getSig() {
		return sig;
	}
	
	
}
