public class IteradorDeLista3
{
	private NodoL1 actual;
	private NodoL1 cabezaAux;
	
	IteradorDeLista3(NodoL1 cabeza)
	{	cabezaAux=cabeza;
		actual=cabeza;}
	
	boolean tieneProximo()
	{return actual.getSig()!=this.cabezaAux;}
	
	void proximo() 
	{actual=actual.getSig();}
	
	int getActual() 
	{return actual.getInfo();}
	
}