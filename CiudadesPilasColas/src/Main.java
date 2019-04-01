import java.util.Scanner;
public class Main 
{
	static Scanner sc = new Scanner (System.in);
	
	public Main() 
	{

	}
	
	public static void main(String[] args) 
	{
		int hora;
		boolean continuar = true;
		
		String ciu_inicio;
		String ciu_destino;
		String hora_inicio;
		
		do
		{
			System.out.println("Bienvenido usuario, ingrese la ciudad de inicio");
		
			ciu_inicio = sc.next();
			
			if(ciu_inicio.equalsIgnoreCase("Santa Marta") || 
			   ciu_inicio.equalsIgnoreCase("La Paz") ||
			   ciu_inicio.equalsIgnoreCase("Montería") ||
			   ciu_inicio.equalsIgnoreCase("Sincelejo") ||
			   ciu_inicio.equalsIgnoreCase("Cartagena") ||
			   ciu_inicio.equalsIgnoreCase("Barranquilla") ||
			   ciu_inicio.equalsIgnoreCase("Riohacha") ||
			   ciu_inicio.equalsIgnoreCase("Valledupar") ||
			   ciu_inicio.equalsIgnoreCase("San Benito") ||
			   ciu_inicio.equalsIgnoreCase("Plato")) 
			{
				break;
			}
			else 
			{
				System.out.println("Error, la ciudad ingresada no existe");
			}
		} while (continuar = true);
		
		
		do
		{
			System.out.println("Ingrese la ciudad de destino");
		
			ciu_destino = sc.next();
			
			if(ciu_destino.equalsIgnoreCase("Santa Marta") || 
			   ciu_destino.equalsIgnoreCase("La Paz") ||
			   ciu_destino.equalsIgnoreCase("Montería") ||
			   ciu_destino.equalsIgnoreCase("Sincelejo") ||
			   ciu_destino.equalsIgnoreCase("Cartagena") ||
			   ciu_destino.equalsIgnoreCase("Barranquilla") ||
			   ciu_destino.equalsIgnoreCase("Riohacha") ||
			   ciu_destino.equalsIgnoreCase("Valledupar") ||
			   ciu_destino.equalsIgnoreCase("San Benito") ||
			   ciu_destino.equalsIgnoreCase("Plato")) 
			{
				break;
			}
			else 
			{
				System.out.println("Error, la ciudad ingresada no existe");
			}
		} while (continuar == true);
		
		System.out.println("Bienvenido usuario, ingrese la hora");
		hora = sc.nextInt();
		if(hora > 0 && hora < 25)
		{
			System.out.println("Hora añadida correctamente");
		}
		else
		{
			System.out.println("La hora ingresada no es válida");
		}
	}
}
