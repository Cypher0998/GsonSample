package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSample {
	public static void main(String[] args) {	
	Persona p = new Persona();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Inserta tu nombre: ");
		p.setNombre(scanner.nextLine());
	System.out.println("Inserta tu apellido: ");
		p.setApellido(scanner.nextLine());
	System.out.println("Inserta tu edad: ");
		p.setEdad(scanner.nextInt());
	
	scanner.close();
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	String json = gson.toJson(p);
	System.out.println(json);
	}

}
