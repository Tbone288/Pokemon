package pokemon.model;

public class Eevee extends Pokemon implements Normal
{
	public Eevee()
	{
		super("Eevee", 133);
	}
	
	public Eevee(String name)
	{
		super(name, 133);
	}
	
	public int Tackle()
	{
		return 40;
	}
	
	public int DoubleEdge()
	{
		return 120;
	}
}
