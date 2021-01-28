
public class NodoL1 {
	
	private int info;
	private NodoL1 sig;
	
	public NodoL1(int valor) 
	{
		this.info = valor;
		this.sig = null;
	}

	public void setInfo(int info) {
		this.info = info;
	}
	
	public void setSig(NodoL1 sig) {
		this.sig = sig;
	}
	
	
	public int getInfo() {
		return info;
	}
	
	public NodoL1 getSig() {
		return sig;
	}
	
	


}
