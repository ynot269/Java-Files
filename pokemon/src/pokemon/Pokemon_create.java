package pokemon;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Pokemon_create {
	

	//public static void main(String[] args)  throws IOException {
		public static void organizeByTypes(String fileName) {
			File file = new File(fileName);
			Scanner line = new Scanner(file);
		
		/*ArrayList<String> fire = new ArrayList<String>();
		ArrayList<String> grass = new ArrayList<String>();
		ArrayList<String> water = new ArrayList<String>();
		ArrayList<String> bug = new ArrayList<String>();
		ArrayList<String> poison = new ArrayList<String>();
		ArrayList<String> rock = new ArrayList<String>();
		ArrayList<String> ground = new ArrayList<String>();
		ArrayList<String> dragon = new ArrayList<String>();
		ArrayList<String> psychic = new ArrayList<String>();
		ArrayList<String> fighting = new ArrayList<String>();
		ArrayList<String> electric = new ArrayList<String>();
		ArrayList<String> normal = new ArrayList<String>();*/
			//creates a file for each type
			PrintWriter fireTypes = new PrintWriter("fireTypes.txt", "UTF-8");
			PrintWriter waterTypes = new PrintWriter("waterTypes.txt", "UTF-8");
			PrintWriter grassTypes = new PrintWriter("grassTypes.txt", "UTF-8");
			PrintWriter bugTypes = new PrintWriter("bugTypes.txt", "UTF-8");
			PrintWriter poisonTypes = new PrintWriter("poisonTypes.txt", "UTF-8");
			PrintWriter electricTypes = new PrintWriter("electricTypes.txt", "UTF-8");
			PrintWriter groundTypes = new PrintWriter("groundTypes.txt", "UTF-8");
			PrintWriter rockTypes = new PrintWriter("rockTypes.txt", "UTF-8");
			PrintWriter psychicTypes = new PrintWriter("psychicTypes.txt", "UTF-8");
			PrintWriter fightingTypes = new PrintWriter("fightingTypes.txt", "UTF-8");
			PrintWriter normalTypes = new PrintWriter("normalTypes.txt", "UTF-8");
			PrintWriter dragonTypes = new PrintWriter("dragonTypes.txt", "UTF-8");

			
			while(line.hasNext()) {
				//continues till the end of the file, PokeName is a line in the file
				String PokeName = line.nextLine();
				//pokeDic[] creates an array of strings out of a split between the name and type of the pokemon
				String pokeDic[] = PokeName.split("\\W+");
				
				//add the line to a file?
				//create a new object using pokeDic[0] and pokeDic[1] as arguments, which are name and type
				Pokemon p = new Pokemon(pokeDic[0], pokeDic[1]);
				String type = p.getType();
				String name = p.getName();
				//System.out.println(name + " " + type);
				int pokeIndex = p.getID();
				if(type.equals("Fire")) {
					//fire.add(name + "\n");
					fireTypes.println(name +" "+ pokeIndex + "\n" );
				}
				else if (type.equals("Water")) {
					//water.add(name + "\n");
					waterTypes.println(name +" "+ pokeIndex + "\n" );
				}
				else if (type.equals("Grass")) {
					//grass.add(name + "\n");
					grassTypes.println(name +" "+ pokeIndex + "\n"  );
				}
				else if (type.equals("Fighting")) {
					//fighting.add(name + "\n");
					fightingTypes.println(name +" "+ pokeIndex + "\n" );
				}
				else if (type.equals("Bug")) {
					//bug.add(name + "\n");
					bugTypes.println(name +" "+ pokeIndex + "\n" );
				}
				else if (type.equals("Poison")) {
					//poison.add(name + "\n");
					poisonTypes.println(name +" "+ pokeIndex + "\n"  );
				}
				else if (type.equals("Rock")) {
					//rock.add(name + "\n");
					rockTypes.println(name +" "+ pokeIndex + "\n"  );
				}
				else if (type.equals("Ground")) {
					//ground.add(name + "\n");
					groundTypes.println(name +" "+ pokeIndex + "\n"  );
				}
				else if (type.equals("Psychic")) {
					//psychic.add(name + "\n");
					psychicTypes.println(name +" "+ pokeIndex + "\n"  );
				}
				else if (type.equals("Dragon")) {
					//dragon.add(name + "\n");
					dragonTypes.println(name +" "+ pokeIndex + "\n"  );
				}
				else if (type.equals("Electric")) {
					//electric.add(name + "\n");
					electricTypes.println(name +" "+ pokeIndex + "\n"  );
				}
				else if (type.equals("Normal")) {
					//normal.add(name + "\n");
					normalTypes.println(name +" "+ pokeIndex + "\n" );
				}
					
				
				
				//add P to a new file to create a pokedex? 
				//organize by type in the future?
				//you got htis tony.
				
				
			}
			
			System.out.println("fire types:" + fire);
			System.out.println("water types:" + water);
			System.out.println("grass types:" + grass);
			System.out.println("bug types:" + bug);
			System.out.println("dragon types:" + dragon);
			System.out.println("electric types:" + electric);
			System.out.println("fighting types:" + fighting);
			System.out.println("psychic types:" + psychic);
			System.out.println("rock types:" + rock);
			System.out.println("ground types:" + ground);
			System.out.println("normal types:" + normal);
			System.out.println("poison types:" + poison);
	
			fireTypes.close();
			waterTypes.close();
			grassTypes.close();
			bugTypes.close();
			fightingTypes.close();
			rockTypes.close();
			groundTypes.close();
			psychicTypes.close();
			dragonTypes.close();
			normalTypes.close();
			poisonTypes.close();
			electricTypes.close();
			line.close();
		}


