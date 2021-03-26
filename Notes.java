package moyenneEleves;

import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {
		float somme=0, moyenne;
		float [] notes= new float[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer les notes");
		
		for (int i = 0; i < notes.length; i++) {
			notes[i]= scan.nextFloat();
		
			somme+=notes[i];
			
			
		}
		moyenne=somme/notes.length;
		System.out.println(somme);
		System.out.println("l'eleve1 a une moyenne de :" +moyenne);
		//notes[]= nextFloat(notes);
		

	}


}
