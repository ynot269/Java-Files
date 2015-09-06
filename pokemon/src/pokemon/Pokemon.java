package pokemon;

//parent class for the purpose of this project
public class Pokemon {
	private static String name; 
	private static String type;
	private int index;
    
    private static int pokeIndex= 0;
    
	public Pokemon (String aName, String aType) {
			name = aName;
			type = aType;
			index = pokeIndex;
			
			pokeIndex++;}
	public String getName() {
		return name; 
		
		
	}
	public String getType() {
		return type;
	}
	
	public int getID() {
		return index;
	}
	public Pokemon getPokemon (String aName) {
		name = aName;
		return new Pokemon(name, type);
	}
	public String toString() {
		return name;
	}
		
		
	}
	 
