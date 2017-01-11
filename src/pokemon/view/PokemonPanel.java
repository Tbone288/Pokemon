package pokemon.view;

import java.awt.Color;
import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.Dimension;
import java.awt.event.*;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox<String> pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField nickNameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	private JLabel nickNameLabel;
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource(""));
		this.updateButton = new JButton("Update the stats!");
		this.nameField = new JTextField(25);
		nameField.setBackground(Color.WHITE);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10, 25);
		this.pokedexSelector = new JComboBox(baseController.buildPokedexText());
		this.advancedLabel = new JLabel("Advanced information");
		this.combatLabel = new JLabel("Combat Points:");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		this.nameLabel = new JLabel("My name is:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.speedLabel = new JLabel("Speed Rate:");
		this.healthLabel = new JLabel("Health Points:");
		
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea("Advanced Information: ");
		this.combatLabel = new JLabel("Combat Points: ");
		this.healthLabel = new JLabel("Health Points: ");
		this.speedLabel = new JLabel("Speed Rating: ");
		this.numberLabel = new JLabel("Pokemon Number: ");
		
		this.nameLabel = new JLabel("My name is: ");
		this.nickNameLabel = new JLabel("Nick Name: ");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		
		
		setupComponents();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public void setupComponents()
	{
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalAlignment(JLabel.CENTER);
		
		numberField.setEditable(false);
		nameField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.WHITE);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		
		this.add(pokedexSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
		this.add(advancedArea);
		this.add(pokemonLabel);
		this.add(updateButton);
	}
	
	private void setupLayout()
	
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, healthField, -422, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -371, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -194, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 1, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, -738, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 15, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, combatField);
	
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, combatField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 6, SpringLayout.SOUTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 11, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, 0, SpringLayout.EAST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 36, SpringLayout.SOUTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 169, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 24, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 10, SpringLayout.NORTH, this);
	}
	
	private void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation()
						+ "\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				if(isValidInteger(nameField.getText()) && isValidInteger(combatField.getText()) && isValidInteger(healthField.getText()));
				{
					int selected = pokedexSelector.getSelectedIndex();
					baseController.getPokedex().get(selected).setName(nameField.getText());
				}
			}
		});
		
	}
	
	
	/*this.addMouseListener(new MouseListener()
	{
		public void mouseEntered(MouseEvent entered)
		{
			
		}
		public void mouseReleased(MouseEvent released)
		{
		
		}
		public void mouseExited(MouseEvent exited)
		{
			
		}
		public void mouseClicked(MouseEvent clicked)
		{
		
		}
		public void mousePressed(MouseEvent pressed)
		{
		
		}	
	});
	
	this.addMouseMotionListener(new MouseMotionListener()
	{
		public void mouseDragged(MouseEvent dragged)
		{
			setRandomColor();
		}
		public void mouseMoved(MouseEvent moved)
		{
			if((Math.abs(moved.getX() - updateButton.getX()) < 5 ) || (Math.abs(moved.getY() - updateButton.getY()) < 5))
			{
				updateButton.setLocation(moved.getX() + 10, moved.getY() - 10 );
			}
		}
	});
	}		
*/
	private void setRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void changeColorBasedOnData(String data)
	{
		if (data.contains("Electric"))
		{
			this.setBackground(Color.YELLOW);
		}
		else if (data.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
		else if (data.contains("Grass"))
		{
			this.setBackground(Color.GREEN);
		}
		else if (data.contains("Water"))
		{
			this.setBackground(Color.CYAN);
		}
		else if (data.contains("Psychic"))
		{
			this.setBackground(Color.MAGENTA);
		}
		else if (data.contains("Normal"))
		{
			this.setBackground(Color.LIGHT_GRAY);
		}
		else
		{
			this.setBackground(Color.WHITE);
		}
		
		repaint();
	}

	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "Pokeball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(this.getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(this.getClass().getResource(path + defaultName + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		pokemonLabel.setText("My name is: " + name);
		repaint();
	}
	
	private boolean isValidDouble(String input)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(input);
			isValid = true;
		}
		catch (NumberFormatException userTypedSomething)
		{
			JOptionPane.showMessageDialog(this, "Type in a valid double for speed");
			speedField.setText("");
		}
		
		return isValid;
	}
	
	private boolean isValidInteger(String input)
	{
		boolean isValid = false;
		
		try
		{
			double successful = Integer.parseInt(input);
			isValid = true;
		}
		catch (NumberFormatException userTypedSomething)
		{
			JOptionPane.showMessageDialog(this, "Type in a valid integer for combat/health");
			combatField.setText("");
		}
		
		return isValid;
		
	}
}
	/*private boolean isValidName(String name)
	{
		boolean isValid = false;
		
		try
		{
			
		}
	}
}
*/
