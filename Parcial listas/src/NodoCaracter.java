
public class NodoCaracter
{
	public String info;
	public NodoCaracter sig;
	
	public NodoCaracter(String valor) 
	{
		this.info=valor;
		this.sig=null;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public NodoCaracter getSig() {
		return sig;
	}

	public void setSig(NodoCaracter sig) {
		this.sig = sig;
	}
}