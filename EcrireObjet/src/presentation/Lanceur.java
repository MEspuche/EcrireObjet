package presentation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Compte c = new Compte(654515, "Marine", 20000000);
		Compte c2 = new Compte(1212121,"Toto",10);
		
		
		//serialisable
		File f = new File("banque.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.writeObject(c2);
		
		//
		
		
		oos.close();
		fos.close();
		
		
		
		


		
	
	}
		
		
	

}
