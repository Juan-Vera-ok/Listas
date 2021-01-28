
public class Main {

	public static void main(String[] args) 
	{
		ListaElementos le1=new ListaElementos();
		int op=0;
		
		do
		{
			System.out.println("Opcion 1:Insertar elemento");			
			System.out.println("Opcion 2:Eliminar elemento/instancia elemento");
			System.out.println("Opcion 3: Mostrar lista");
			
			op=Console.readInt("Ingrese opción");
			
			switch(op) 
				{
					case 1:
					{
						int a=Console.readInt("Ingrese entero para insertar");
						le1.InsertarElemento(a);
						 break;
					}
					case 2:
					{
						int b=Console.readInt("Ingrese entero a eliminar");
						
						if(le1.suprimir(b))
							System.out.println("Se ha eliminado "+b);
						else
							System.out.println("No se encuentra "+b);
						break;
					}
					case 3:
					{
						le1.mostrar();
						break;
					}
					
				}
		
		}while(op!=0);
	}

}
