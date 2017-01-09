package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander()
	{
		super("Charmander", 4);
	}
	
	public Charmander(String name)
	{
		super(name, 4);
	}
	
	public int fireFang()
	{
		return 65;
	}
	
	public int flamethrower()
	{
		return 90;
	}
	
	public int ember()
	{
		return 40;
	}
	
	public int flameWheel()
	{
		return 60;
	}
}
