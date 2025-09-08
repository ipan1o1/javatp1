// Le programme doit porter le mÃªme nom que le fichier
// Ici, le fichier s'appelle HelloWorld.java
import java.util.Scanner;

public class HelloWorld {
    
    // Fonction principale, appelÃ©e par le programme
    public static void main(String[] args) {
	// DÃ©clarations de variables
	Scanner sc = new Scanner(System.in);
	System.out.print("Entrez votre nom : ");
    String name = sc.next();
	int num = 8;
	String month = "septembre";
	
	// System.out.println affiche sur la sortie standard
	System.out.println("Hello world!");

	// + peut servir a concatÃ©ner des chaines de caractÃ¨res 
	System.out.println("Hello " + name + "!");

	// Une conversion d'un nombre en chaÃ®ne de caractÃ¨res se fait
        // "automatiquement" (Ã  venir dans le cours : via toString() )
	System.out.println("Nous sommes le " + num + " " + month + ".");
	
    }
}