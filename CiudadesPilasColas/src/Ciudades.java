import java.util.Stack;

public class Ciudades 
{
	Stack <String> Carretera = new Stack <String> ();
	Stack <Number> Hora = new Stack <Number> ();
	
	public Stack CarreteraA(Stack <String> Carretera) 
	{
		Carretera.push("Santa Marta");
		Carretera.push("La Paz");
		Carretera.push("Montería");
		Carretera.push("Sincelejo");
		Carretera.push("Cartagena");
		Carretera.push("Barranquilla");
		return Carretera;
	}
	
	public Stack HorasA(Stack <Number> Hora) 
	{
		Hora.push(4);
		Hora.push(6);
		Hora.push(2.5);
		Hora.push(3);
		Hora.push(1.5);
		Hora.push(1);
		return Hora;
	}
	
	public Stack CarreteraB(Stack <String> Carretera) 
	{
		Carretera.push("Cartagena");
		Carretera.push("Riohacha");
		Carretera.push("Valledupar");
		Carretera.push("La Paz");
		Carretera.push("San Benito");
		return Carretera;
	}
	
	public Stack HorasB(Stack <Number> Horas) 
	{
		Horas.push(4.5);
		Horas.push(2.5);
		Horas.push(1.5);
		Horas.push(4);
		Horas.push(3.5);
		return Horas;
	}
	
	public Stack CarreteraC(Stack <String> Carretera) 
	{
		Carretera.push("Valledupar");
		Carretera.push("Plato");
		Carretera.push("San Benito");
		Carretera.push("Montería");
		Carretera.push("Santa Marta");
		return Carretera;
	}
	
	public Stack HorasC(Stack <Number> Horas) 
	{
		Horas.push(1.5);
		Horas.push(3);
		Horas.push(2);
		Horas.push(4);
		Horas.push(3);
		return Horas;
	}
	
	private int buscarCiudad(String ciudad) 
	{
		 int index = 0;
		 
		 for (int i = 0; i < Carretera.size(); i++) 
		 {
			if(ciudad.equalsIgnoreCase(Carretera.get(i))) 
			{
				index = i;
				break;
			}
			else
			{
				index = -1;
			}
		 }
		 return index;
	 } 
}
