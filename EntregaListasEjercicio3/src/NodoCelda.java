
public class NodoCelda 
{
	private NodoCelda sig;
	private int info;
	private int fila;
	private int columna;
	
	public NodoCelda(int Info)
	{
		this.info=Info;
	}
	
	protected NodoCelda getSig() {
		return sig;
	}
	protected void setSig(NodoCelda sig) {
		this.sig = sig;
	}
	protected int getInfo() {
		return info;
	}
	protected void setInfo(int info) {
		this.info = info;
	}
	protected int getFila() {
		return fila;
	}
	protected void setFila(int fila) {
		this.fila = fila;
	}
	protected int getColumna() {
		return columna;
	}
	protected void setColumna(int columna) {
		this.columna = columna;
	}
	
	

}
