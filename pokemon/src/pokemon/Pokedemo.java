package pokemon;
import java.io.*;

public class Pokedemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	String file = "Pokemon150.txt";
	Pokedex.organizeByTypes(file);
	System.out.println("Creating files...");
	System.out.println("Sorting by type...");
	System.out.println("Done!");
	
	}

}
