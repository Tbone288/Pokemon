package pokemon.controller;

import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PokemonController 
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
public PokemonController()
{
	pokedex = new ArrayList<Pokemon>();
	buildPokedex();
	baseFrame = new PokemonFrame(this);
}
	
	public void start()
	{
	//	JOptionPane.showMessageDialog(baseFrame, "Welcome to Pokemon Inheritance!");
	}
	private void buildPokedex()
	{
	//	pokedex.add(new Charmander("Supa Hot Fire"));
	//	pokedex.add(new Bulbasaur("Onion Dinosaur"));
	//	pokedex.add(new Flareon("Hot Dog"));
	//	pokedex.add(new Squirtle("Koopa Troopa"));
	//	pokedex.add(new Treeko("Gieco Lizard"));
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
	//	Pokemon current = pokemon.get(index);
	//	current.setName(name);
	//	current.setAttackPoints(combat);
	//	current.setSpeed(speed);
	//	current.setHealthPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}
}

