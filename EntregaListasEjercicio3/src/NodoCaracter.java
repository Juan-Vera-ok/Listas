
public class NodoCaracter
{
	public char info;
	public NodoCaracter sig;
	
	public NodoCaracter(char valor) 
	{
		this.info=valor;
		this.sig=null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(char info) {
		this.info = info;
	}

	public NodoCaracter getSig() {
		return sig;
	}

	public void setSig(NodoCaracter sig) {
		this.sig = sig;
	}
	
	
	
	
	
}