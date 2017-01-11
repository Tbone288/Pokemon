package pokemon.model;

public class Mew extends Pokemon implements Psychic
{
	public Mew()
	{
		super("Mew", 252);
	}
	public Mew(String name)
	{
		super(name, 252);
	}
	
	public int Psyshock() 
	{
		return 130;
	}
	
	public int CalmMind() 
	{
		return 75;
	}
}

