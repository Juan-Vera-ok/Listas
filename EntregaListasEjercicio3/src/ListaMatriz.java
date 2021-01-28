
public class ListaMatriz 
{
	private NodoCelda PrimerElemento,ultimoElemento;
	private int FilaDimension,ColumnaDimension;
	private int UltimoFilaCount=1;
	private int UltimoColumnaCount=1;
	
	public ListaMatriz(int filaDim,int columnaDim) 
	{
		this.FilaDimension=filaDim;
		this.ColumnaDimension=columnaDim;
	}
	
	
	public void insertarElemento(int valor)
	{
		if(this.estaLlena()) 
		{
			System.out.println("Está llena");
			return;}
		NodoCelda nuevo=new NodoCelda(valor);
		if(PrimerElemento==null) 
		{
			PrimerElemento=nuevo;
			ultimoElemento=this.PrimerElemento;
			PrimerElemento.setFila(this.UltimoFilaCount);
			PrimerElemento.setColumna(this.UltimoColumnaCount);
			this.UltimoColumnaCount=this.UltimoColumnaCount+1;
		return;
		}
		
		nuevo.setFila(this.UltimoFilaCount);
		nuevo.setColumna(this.UltimoColumnaCount);
		ultimoElemento.setSig(nuevo);
		ultimoElemento=nuevo;
		this.UltimoColumnaCount=this.UltimoColumnaCount+1;
		
		if(this.UltimoColumnaCount>this.ColumnaDimension) 
		{this.UltimoFilaCount=this.UltimoFilaCount+1;
		this.UltimoColumnaCount=1;}
		
		
		}
				
				
		
	
	
	
	
	
	public boolean estaLlena() 
	{
		boolean enc=false;
		if(this.UltimoColumnaCount>this.ColumnaDimension&&this.UltimoFilaCount>this.FilaDimension) 
		{enc=true;}
		
		return enc;
	}
	
	public void mostrarColumnas()
	{
		NodoCelda P;
		int i=1;
		while(i<=this.ColumnaDimension) 
		{
			P=this.PrimerElemento;
			while(P.getSig()!=this.PrimerElemento) 
			{
				
				if(P.getColumna()==i) {
					System.out.println(P.getInfo()+"|"+"Columna "+P.getColumna()+"|");
					}
					P=P.getSig();
					if(P==null)
					{i=i+1;
					break;}
				
			}
		}
		
	}
	
	public void mostrarFilas()
	{
		NodoCelda P=this.PrimerElemento;
		while(P!=null) 
		{
			System.out.print(P.getInfo()+"|"+"Fila "+P.getFila()+"|");
			P=P.getSig();
			System.out.println("");
		}
	}
	
	
	
	

}
