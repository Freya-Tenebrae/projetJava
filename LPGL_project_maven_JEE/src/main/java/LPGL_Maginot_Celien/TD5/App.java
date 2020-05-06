package LPGL_Maginot_Celien.TD5;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import Manager.TimeManager;

public class App  implements KeyListener
{
	static Boolean infLoop = true;
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	String value = "";
    	
    	System.out.println("Ceci est un programme qui va renvoyer la 1er heure possible "
    			+ "à partir d'une suite de 6 nombres écrite dans cette console. \n"
    			+ "Ce programme va dans un premier temps voir si la suite de nombres donne "
    			+ "directement une heure valide, ou dans le cas contraire va donner l'heure la plus"
    			+ "petite que l'on peu établir avec les nombres donnés. \n"
    			+ "pressez 'ech' ou sur la barre espace pour quitter ce programme. (cette fonctionalités est sujette à un bug et sera corriger ulterieurement");	
    	do {
    		value = sc.next();
    		TimeManager t = new TimeManager(value);
    		System.out.println(t.getTime());
    	} while (infLoop == true);
    	
    	System.out.println("Fin du programme.");
    }

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE || e.getKeyCode() == KeyEvent.VK_SPACE)
			infLoop = false;
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}
}
