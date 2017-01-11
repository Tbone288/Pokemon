package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu()
	{
		super("Pikachu", 255); 
	}
	
	public Pikachu(String name)
	{
		super(name, 255);
	}
	
	public int thunder()
	{
		return 200;
	}
	
	public int thunderBolt()
	{
		return 50;
	}

}
