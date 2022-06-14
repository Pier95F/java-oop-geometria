package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	Rettangolo rettangolo = new Rettangolo();
	
	System.out.println("Inserisci la base del rettangolo:");
	rettangolo.base = scan.nextInt();
	
	System.out.println("Inserisci l'altezza del rettangolo:");
	rettangolo.altezza = scan.nextInt();
	
	rettangolo.restStampa();
	
	scan.close();
	}

}
