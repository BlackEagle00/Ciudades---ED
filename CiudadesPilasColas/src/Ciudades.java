import java.util.Stack;

public class Ciudades 
{
	Stack <String> CarreteraA = new Stack <String> ();
	Stack <String> CarreteraB = new Stack <String> ();
	Stack <String> CarreteraC = new Stack <String> ();
	
	public Stack CarreteraA(Stack <String> CarreteraA) 
	{
		CarreteraA.push("Santa Marta");
		CarreteraA.push("La Paz");
		CarreteraA.push("Montería");
		CarreteraA.push("Sincelejo");
		CarreteraA.push("Cartagena");
		CarreteraA.push("Barranquilla");
		return CarreteraA;
	}
	
	public Stack CarreteraB(Stack <String> CarreteraB) 
	{
		CarreteraB.push("Cartagena");
		CarreteraB.push("Riohacha");
		CarreteraB.push("Valledupar");
		CarreteraB.push("La Paz");
		CarreteraB.push("San Benito");
		return CarreteraB;
	}
	
	public Stack CarreteraC(Stack <String> CarreteraC) 
	{
		CarreteraC.push("Valledupar");
		CarreteraC.push("Plato");
		CarreteraC.push("San Benito");
		CarreteraC.push("Montería");
		CarreteraC.push("Santa Marta");
		return CarreteraC;
	}
}
