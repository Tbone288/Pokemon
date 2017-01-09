package pokemon.model;

public class Torchic extends Pokemon implements Fire
{
	public Torchic()
	{
		super("Torchic", 255); 
	}
	
	public Torchic(String name)
	{
		super(name, 255);
	}
	
	public int ember()
	{
		return 10;
	}
	
	public int flameWheel()
	{
		return 50;
	}
	
	public int flamethrower()
	{
		return 90;
	}
	public int fireFang()
	{
		return 40;
	}

}
