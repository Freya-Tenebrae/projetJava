package Tools;

public class TimeTools {
	
	public static boolean validSecondOrMinute(int value) {
		if (value > 59 || value < 0)
			return false; // une seconde ou minute ne peut être supérieure à 59 ou infèrieure à 0
		else
			return true;
	}

	public static boolean validHour(int value) {
		if (value > 23 || value < 0)
			return false; // une heure ne peut être supérieure à 23 ou infèrieure à 0
		else
			return true;
	}
}
