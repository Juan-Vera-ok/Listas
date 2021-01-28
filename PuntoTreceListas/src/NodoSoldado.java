
public class NodoSoldado 
{
	private String info;
	private NodoSoldado sig;
	
	public NodoSoldado(String nombre)
	{
		this.info=nombre;
	}

	protected String getInfo() {
		return info;
	}

	protected void setInfo(String info) {
		this.info = info;
	}

	protected NodoSoldado getSig() {
		return sig;
	}

	protected void setSig(NodoSoldado sig) {
		this.sig = sig;
	}
	
	
	
}
