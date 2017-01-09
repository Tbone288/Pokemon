package pokemon.model;

public class Bulbasaur extends Pokemon implements Grass
{
	public Bulbasaur()
	{
		super("Bulbasaur", 1);
	}
	
	public Bulbasaur(String name)
	{
		super (name, 1);
	}
	
	public int leechSeed()
	{
		return 100;
	}
	
	public int leafStorm()
	{
		return 60;
	}
	public int grassKnot()
	{
		return 120;
	}
	public  int gigaDrain()
	{
		return 50;
	}
	
}
