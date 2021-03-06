package LPGL_Maginot_Celien.Project_06_05_2020;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.regex.Pattern;

import Metier.Banque;

public class App  implements KeyListener
{
	static Boolean infLoop = true;
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	String value = "";
    	Banque b = new Banque();
    	
    	System.out.println("Ceci est un petit programme qui va permettre de consulter les fonctionnalités d'une banque");	
    	System.out.println("L'identifiant s'effectuer par le nom du client : veuillez rentrer le nom d'un client pour continuer (Célia/Freya/Mael)");
    	System.out.println("Puis sélectionner le compte à consulter en tapant son identifiant (une liste sera afficher)");
    	System.out.println("Pour effectuer un dépot rentrer le symbole +");
    	System.out.println("Pour effectuer un retrait rentrer le symbole -");
    	System.out.println("après cela il sera nécessaire de taper l'identifiant du compte sur lequel on souhaite faire l'opération");
    	System.out.println("suivi d'un point '.' et de la la somme souhaités");
    	System.out.println("Pour changer d'utilisateur il est nécessaire de redémarer l'application en pressant echap");
    	do {
    		value = sc.next();
    	} while (value != "Célia" || value != "Freya" || value != "Mael");
    	b.ouverture_compte(value);
    	
    	while (infLoop == true); {
    		value = sc.next();
    		if (value == "C01" || value == "C02" || value == "C03" || value == "C04" || value == "C05" || value == "C06" || value == "C07")
    		{
    			b.consultation(value);
    		}
    		else if (value == "-")   	
    		{
    			value = sc.next();
    			String[]v = value.split(Pattern.quote("."));
    			b.retrait(v[0], Double.parseDouble(v[1]));
    		}
    		else if (value == "+")   	
    		{
    			value = sc.next();
    			String[]v = value.split(Pattern.quote("."));
    			b.depot(v[0], Double.parseDouble(v[1]));
    		}
    	}
    	
    	System.out.println("Fin du programme.");
    }

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
			infLoop = false;
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}
}
