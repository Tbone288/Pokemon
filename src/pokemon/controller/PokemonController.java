package pokemon.controller;

import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PokemonController 
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
public PokemonController()
{
	pokedex = new ArrayList<Pokemon>();
	this.buildPokedex();
	baseFrame = new PokemonFrame(this);
}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to Pokemon Inheritance!");
		new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png"));
	}
	private void buildPokedex()
	{
		pokedex.add(new Charizard("Supa Hot Fire"));
		pokedex.add(new Bulbasaur("Onion Dinosaur"));
		pokedex.add(new Pikachu("Electric Rat"));
		pokedex.add(new Squirtle("Koopa Troopa"));
		pokedex.add(new Mew("God Cat"));
		pokedex.add(new Eevee("Doggo"));
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
		Pokemon pokemon = pokedex.get(index);
		pokemon.setName(name);
		pokemon.setAttackPoints(combat);
		pokemon.setSpeed(speed);
		pokemon.setHealthPoints(health);
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

