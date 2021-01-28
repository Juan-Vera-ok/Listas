
public class IteradorDeLista2
{
	private NodoL2 actual;
	
	IteradorDeLista2(NodoL2 cabeza)
	{actual=cabeza;}
	
	boolean tieneProximo()
	{return actual !=null;}
	
	void proximo() 
	{actual=actual.getSig();}
	
	int getActual() 
	{return actual.getInfo();}
	
}