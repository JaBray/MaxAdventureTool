package maxAdventure;
//Object class for Main.java
//Defines a pokemon which has two types
//A refined version of this program would allow a pokemon to only have one type rather than use NoType for pokemon that only have one type normally
import java.util.ArrayList;

public class Pokemon {
	private String name;
	private Type type1 = null;
	private Type type2 = null;
	private ArrayList<Type> Weaknesses;

	
	public Pokemon(String n, Type t1, Type t2){
		name = n;
		type1 = t1;
		type2 = t2;
		Weaknesses = new ArrayList<Type>();
		
	}
	
	public Pokemon(String n, Type t1){
		name = n;
		type1 = t1;
		
	}
	
	
public Type getType1() {
	return type1;
}

public Type getType2() {
	
	return type2;
}
	
public String getName() {
	return name;
}


public ArrayList<Type> getWeaknesses(){
	
	ArrayList<Type> type1Weaks = type1.getWeaknesses();
	ArrayList<Type> type2Weaks = type2.getWeaknesses();
	
	
	for(Type t : type1Weaks) {
		if(!type2.getResistances().contains(t) && !type2.getImmunities().contains(t))
			Weaknesses.add(t);
	}
	
	for(Type t : type2Weaks) {
		if(!type1.getResistances().contains(t) && !type1.getImmunities().contains(t)) {
			Weaknesses.add(t);
		}
	}
	
	
	
	
	
	return Weaknesses;
}

public ArrayList<Type> getImmunities(){
	ArrayList<Type> type1Immu = type1.getImmunities();
	ArrayList<Type> type2Immu = type2.getImmunities();
	
	for(Type t : type2Immu) {
		if(!type1Immu.contains(t))
			type1Immu.add(t);
	}
	
	return type1Immu;
}

	
	
}
