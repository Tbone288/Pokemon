package pokemon.model;

public class Charizard extends Pokemon implements Fire, Flying
{
	public Charizard()
	{
		super("Charizard", 4);
	}
	
	public Charizard(String name)
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
	
	public int fly()
	{
		return 90;
	}
	
	public int wingAttack()
	{
		return 80;
	}
}
