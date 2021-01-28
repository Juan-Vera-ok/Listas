
public class IteradorDeListaCaracteres 
{
	private NodoCaracter actual;
	
	IteradorDeListaCaracteres(NodoCaracter cabeza)
	{actual=cabeza;}
	
	boolean tieneProximo()
	{return actual !=null;}
	
	void proximo() 
	{actual=actual.getSig();}
	
	String getActual() 
	{return actual.getInfo();}
	
}