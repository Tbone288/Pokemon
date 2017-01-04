package pokemon.model;

public class Treeko extends Pokemon implements Grass
{
	public Treeko()
	{
		super("Treeko", 252);
	}
	public Treeko(String name)
	{
		super(name, 252);
	}
	
	public int leafStorm() 
	{
		return 130;
	}
	
	public int gigaDrain() 
	{
		return 75;
	}
	
	
}

