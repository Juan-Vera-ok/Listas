
public class IteradorDeLista 
{
	private NodoL1 actual;
	
	IteradorDeLista(NodoL1 cabeza)
	{actual=cabeza;}
	
	boolean tieneProximo()
	{return actual !=null;}
	
	void proximo() 
	{actual=actual.getSig();}
	
	int getActual() 
	{return actual.getInfo();}
	
}