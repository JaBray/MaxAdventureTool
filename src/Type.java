package maxAdventure;
//Helper class for Main.java
//Defines a pokemon type
//Each type has a list of other types that it is either weak or immune to or resists
//Has the usually accessors and mutators with an overridden ToString method to save some headache
import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Type implements Serializable{

	private ArrayList<Type> Weaknesses;
	private ArrayList<Type> Immunities;
	private ArrayList<Type> Resistances;
	
	private String typeName;
	
	
	public Type(String n) {
		typeName = n;
		Weaknesses = new ArrayList<Type>();
		Immunities = new ArrayList<Type>();
		Resistances = new ArrayList<Type>();
		
		
	}
	
	public String getName() {
		return typeName;
	}
	
	public void addWeakness(Type t) {
		if(!Weaknesses.contains(t))
			Weaknesses.add(t);
		else
			System.out.println("Duplicate!");
	}
	
	public void addImmunity(Type t) {
		if(!Immunities.contains(t))
			Immunities.add(t);
		else
			System.out.println("Duplicate!");
	}
	
	public void addResistance(Type t) {
		if(!Resistances.contains(t))
			Resistances.add(t);
		else
			System.out.println("Duplicate!");
	}
	
	public ArrayList<Type> getWeaknesses(){
		return Weaknesses;
	}
	
	public ArrayList<Type> getImmunities(){
		return Immunities;
	}
	
	public ArrayList<Type> getResistances(){
		return Resistances;
	}
	
	public String toString() {
		return typeName;
	}
	
	
	
	
	
	
}
