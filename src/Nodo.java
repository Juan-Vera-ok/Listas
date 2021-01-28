
public class Nodo 
{
	public int info;
	public int Cont;
	public Nodo sig;
	
	public Nodo(int valor) 
	{
		this.info=valor;
		this.Cont=1;
		this.sig=null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public int getCont() {
		return Cont;
	}

	public void setCont(int cont) {
		Cont = cont;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
	
	
	
	
}
