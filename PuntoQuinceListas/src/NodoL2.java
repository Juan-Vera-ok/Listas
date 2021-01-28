
public class NodoL2 {
	
	private int info;
	NodoL2 sig,ant;
	
	public NodoL2(int valor)
	{
		this.info=valor;
	}

	protected int getInfo() {
		return info;
	}

	protected void setInfo(int info) {
		this.info = info;
	}

	protected NodoL2 getSig() {
		return sig;
	}

	protected void setSig(NodoL2 sig) {
		this.sig = sig;
	}

	protected NodoL2 getAnt() {
		return ant;
	}

	protected void setAnt(NodoL2 ant) {
		this.ant = ant;
	}
	

}
