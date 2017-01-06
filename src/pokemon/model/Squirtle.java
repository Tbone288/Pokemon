package pokemon.model;

public class Squirtle extends Pokemon implements Water
{
	public Squirtle()
	{
		super("Squirtle", 7);
	}
	public Squirtle(String name)
	{
		super(name, 7);
	}
	public int waterfall()
	{
		return 80;
	}
	
	public int hydroPump()
	{
		return 110;
	}

}
