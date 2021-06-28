package maxAdventure;
//Author: Jacob Bray
//Program to calculate the best pokemon types to bring in a dynamax adventure in Sword and Shield
//Has three components: Main.java, Type.java which defines each type and its interactions and Pokemon.java which defines a pokemon with two types
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

//Main class
public class Main {
//static String inputType;
	//Suppress warnings for raw type conversion
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	
	//Main method to do pretty much the whole thing
	public static void main(String[] args) {
		
		
		//Create a Swing frame and a combo box to display each type
		JFrame f = new JFrame();
		JComboBox typeChoice = new JComboBox();

		//Create an arraylist to hold each type
		ArrayList<Type> types = new ArrayList<Type>();

		
		
		
		
		
		//Manually create each type and add it to types
		Type Normal = new Type("Normal");
			types.add(Normal);
		Type Fighting = new Type("Fighting");
			types.add(Fighting);
		Type Flying = new Type("Flying");
			types.add(Flying);
		Type Poison = new Type("Poison");
			types.add(Poison);
		Type Ground = new Type("Ground");
			types.add(Ground);
		Type Rock = new Type("Rock");
			types.add(Rock);
		Type Bug = new Type("Bug");
			types.add(Bug);
		Type Ghost = new Type("Ghost");
			types.add(Ghost);
		Type Steel = new Type("Steel");
			types.add(Steel);
		Type Fire = new Type("Fire");
			types.add(Fire);
		Type Water = new Type("Water");
			types.add(Water);
		Type Grass = new Type("Grass");
			types.add(Grass);
		Type Electric = new Type("Electric");
			types.add(Electric);
		Type Psychic = new Type("Psychic");
			types.add(Psychic);
		Type Ice = new Type("Ice");
			types.add(Ice);
		Type Dragon = new Type("Dragon");
		types.add(Dragon);
		Type Dark = new Type("Dark");
			types.add(Dark);
		Type Fairy = new Type("Fairy");
			types.add(Fairy);
		Type NoType = new Type("NoType");
		types.add(NoType);
		
		
		
		//Manually add each type's interactions
		//If I were to put more time into this program I would save resources by reading them in from a file but time is short
		Normal.addWeakness(Fighting);	
		Normal.addImmunity(Ghost);
			
		Fighting.addWeakness(Psychic);
		Fighting.addWeakness(Flying);
		Fighting.addWeakness(Fairy);
		Fighting.addResistance(Rock);
		Fighting.addResistance(Bug);
		Fighting.addResistance(Dark);
			
		Flying.addWeakness(Electric);
		Flying.addWeakness(Rock);
		Flying.addWeakness(Ice);
		Flying.addImmunity(Ground);
		Flying.addResistance(Fighting);
		Flying.addResistance(Bug);
		Flying.addResistance(Grass);
		

		
		Poison.addWeakness(Ground);
		Poison.addWeakness(Psychic);
		Poison.addResistance(Fighting);
		Poison.addResistance(Poison);
		Poison.addResistance(Grass);
		Poison.addResistance(Fairy);
		Poison.addResistance(Bug);
		
		Ground.addWeakness(Ice);
		Ground.addWeakness(Water);
		Ground.addWeakness(Grass);
		Ground.addImmunity(Electric);
		Ground.addResistance(Poison);
		Ground.addResistance(Rock);
		
		
		Rock.addWeakness(Fighting);
		Rock.addWeakness(Ground);
		Rock.addWeakness(Steel);
		Rock.addWeakness(Water);
		Rock.addWeakness(Grass);
		Rock.addResistance(Normal);
		Rock.addResistance(Flying);
		Rock.addResistance(Poison);
		Rock.addResistance(Fire);
		
		
		Bug.addWeakness(Flying);
		Bug.addWeakness(Rock);
		Bug.addWeakness(Fire);
		Bug.addResistance(Bug);
		Bug.addResistance(Ground);
		Bug.addResistance(Grass);
		
		Ghost.addWeakness(Ghost);
		Ghost.addWeakness(Dark);
		Ghost.addImmunity(Normal);
		Ghost.addImmunity(Fighting);
		Ghost.addResistance(Poison);
		Ghost.addResistance(Bug);
		
		Steel.addWeakness(Fighting);
		Steel.addWeakness(Ground);
		Steel.addWeakness(Fire);
		Steel.addImmunity(Poison);
		Steel.addResistance(Normal);
		Steel.addResistance(Flying);
		Steel.addResistance(Rock);
		Steel.addResistance(Bug);
		Steel.addResistance(Steel);
		Steel.addResistance(Grass);
		Steel.addResistance(Psychic);
		Steel.addResistance(Ice);
		Steel.addResistance(Dragon);
		Steel.addResistance(Fairy);
		
		Fire.addWeakness(Ground);
		Fire.addWeakness(Rock);
		Fire.addWeakness(Water);
		Fire.addResistance(Bug);
		Fire.addResistance(Steel);
		Fire.addResistance(Fire);
		Fire.addResistance(Grass);
		Fire.addResistance(Ice);
		Fire.addResistance(Fairy);
		
		Water.addWeakness(Grass);
		Water.addWeakness(Electric);
		Water.addResistance(Steel);
		Water.addResistance(Fire);
		Water.addResistance(Water);
		Water.addResistance(Ice);
		
		Grass.addWeakness(Flying);
		Grass.addWeakness(Poison);
		Grass.addWeakness(Bug);
		Grass.addWeakness(Fire);
		Grass.addWeakness(Ice);
		Grass.addResistance(Ground);
		Grass.addResistance(Water);
		Grass.addResistance(Grass);
		Grass.addResistance(Electric);
		
		Electric.addWeakness(Ground);
		Electric.addResistance(Flying);
		Electric.addResistance(Steel);
		
		Psychic.addWeakness(Dark);
		Psychic.addWeakness(Ghost);
		Psychic.addWeakness(Bug);
		Psychic.addResistance(Fighting);
		Psychic.addResistance(Psychic);
		
		Ice.addWeakness(Fighting);
		Ice.addWeakness(Rock);
		Ice.addWeakness(Steel);
		Ice.addWeakness(Fire);
		Ice.addResistance(Ice);
		
		Dragon.addWeakness(Dragon);
		Dragon.addWeakness(Ice);
		Dragon.addWeakness(Fairy);
		Dragon.addResistance(Fire);
		Dragon.addResistance(Water);
		Dragon.addResistance(Grass);
		Dragon.addResistance(Electric);
		
		Dark.addWeakness(Fighting);
		Dark.addWeakness(Bug);
		Dark.addWeakness(Fairy);
		Dark.addImmunity(Psychic);
		Dark.addResistance(Ghost);
		Dark.addResistance(Dark);
		
		Fairy.addWeakness(Poison);
		Fairy.addWeakness(Steel);
		Fairy.addImmunity(Dragon);
		Fairy.addResistance(Fighting);
		Fairy.addResistance(Bug);
		Fairy.addResistance(Dark);
	
	
		//For every type in the list of types, add it to the selection box
		for(Type t : types)
			typeChoice.addItem(t);

		
		//read in pokeList.txt and populate the list of all pokemon with the data from it. File format is PokemonName/Type1/Type2
		File pokemon = new File("./pokeList.txt");
		ArrayList<Pokemon> pokeList = new ArrayList<Pokemon>();
		
		Pokemon guzzlord = new Pokemon("Guzzlord", Dark, Dragon);
		
		for(Type t : guzzlord.getImmunities()) {
			System.out.println("Guzzlord should be immune to "+t);
		}
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(pokemon));
	
			String line;
			String[] temp;
			while((line=br.readLine())!=null) {
				if(!line.equals("")) {
				temp = line.split("/");
				Type t1 = NoType; 
				Type t2 = NoType;
				
				for(Type t : types) {
					if(temp[1].equals(t.getName()))
						t1 = t;
				}
				
				for(Type t : types) {
					if(temp[2].equals(t.getName()))
						t2 = t;
				}
				
				
				pokeList.add(new Pokemon(temp[0], t1, t2));
			}
			}
		
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		//Set the frame size to 400 pixels wide and 750 pixels tall
		//With more time and a better GUI system I wouldn't manually set the window size
		f.setSize(400, 750);
		
		//Create UI components and set their properties
		JLabel label1 = new JLabel("Select type of final pokemon:");
		JButton submit = new JButton("Check");
		
		label1.setBounds(0,0,400,25);
		typeChoice.setBounds(5,25,75,50);
		submit.setBounds(90, 25, 75, 50);
		submit.setFont(new Font("Arial", 10, 10));
		

		JTextArea ta = new JTextArea("");
		ta.setEditable(false);
		ta.setBounds(5, 100, 300, 550);
		ta.setVisible(false);
		
		
		//Add each component to the overall frame
		f.add(submit);
		f.add(label1);
		f.add(typeChoice);
		f.add(ta);
		
		//Don't use a layout for the frame and make it visible
		f.setLayout(null);
		f.setVisible(true);
		
		//Make the program close when the windows closed
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		

		//Add an action listener to run this code when the button is pressed
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Set inputType to whatever type is selected in the combo box when Submit is pressed
				String inputType = typeChoice.getItemAt(typeChoice.getSelectedIndex()).toString();
				ta.setVisible(true);
				ta.setText("");
				
				//Create a list to hold each pokemon of the selected type
				ArrayList<Pokemon> pokemonOfType = new ArrayList<Pokemon>();
				
				System.out.println(inputType+" type pokemon: ");
				
				//Populate the list from the list of all pokemon and set the textArea to include them
				for(Pokemon p : pokeList) {
					if(p.getType1().getName().toUpperCase().equals(inputType.toUpperCase()) || p.getType2().getName().toUpperCase().equals(inputType.toUpperCase())) {
						
						System.out.println("*"+p.getName());
						ta.append(p.getName()+"\n");
						pokemonOfType.add(p);
					}
				}
				//Add divider to text area
				ta.append("---------------------------\n");
				
				//Use a HashMap to store each type and how many pokemon of the given type are weak to it
				HashMap<Type, Integer> typeFreq = new HashMap<Type, Integer>();
				HashMap<Type, Integer>immunFreq = new HashMap<Type, Integer>();
				
				//Add each type to the map with a frequency of zero
				for(Type t : types) {
					typeFreq.put(t, 0);
					immunFreq.put(t,0);
				}
				
				//For each pokemon of the given type, add one for each type they are weak to
				for(Pokemon p : pokemonOfType) {
					

					for(Type t : types) {
						if(p.getWeaknesses().contains(t)) {
							typeFreq.put(t, typeFreq.get(t)+1);
							//System.out.println(p.getName() + " is weak to "+t);
						}
						else if(p.getImmunities().contains(t)) {
							immunFreq.put(t, immunFreq.get(t)+1);
							
						}
					}
					
				}
				
				//Sort the map using our handy-dandy helper function defined below
				typeFreq = sortMap(typeFreq);
				//immunFreq = sortMap(immunFreq);
			
				//If there are no pokemon of the given type, display a warning, otherwise display each type and its frequency
				if(pokemonOfType.size() == 0) {
					
					ta.setText("No pokemon of this type were found.");
				}else {
					//Use a DecimalFormat to make our numbers look nice and pretty
					DecimalFormat df = new DecimalFormat("#.##");	
					
					for(Type t : typeFreq.keySet()) {
						if(typeFreq.get(t)!=0) {
							ta.append(t.getName() +" - "+ df.format(((double) typeFreq.get(t)/pokemonOfType.size())*100)+"%\n");
						}
					}
					
					ta.append("---------------------------\nImmunities:\n");
					
					for(Type t : immunFreq.keySet()) {
						if(immunFreq.get(t)!=0) {
							System.out.println(t.getName() +" - "+ df.format(((double) immunFreq.get(t)/pokemonOfType.size())*100)+"%");
							ta.append(t.getName() +" - "+ df.format(((double) immunFreq.get(t)/pokemonOfType.size())*100)+"%\n");
						}
					}
					
					
				}
			
			
			}
			
		});
		
		

		
	}


	//Function sorts a HashMap by value in descending order
	public static HashMap<Type, Integer> sortMap(HashMap<Type,Integer> hm){
		
		List<Map.Entry<Type, Integer>> list = new LinkedList<Map.Entry<Type, Integer>>(hm.entrySet());
		
		
        Collections.sort(list, new Comparator<Map.Entry<Type, Integer> >() {
            public int compare(Map.Entry<Type, Integer> type1,
                               Map.Entry<Type, Integer> type2)
            {
                return (type2.getValue()).compareTo(type1.getValue());
            }
        });
		
  
        HashMap<Type, Integer> temp = new LinkedHashMap<Type, Integer>();
        for (Map.Entry<Type, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
	}

	
	
}
