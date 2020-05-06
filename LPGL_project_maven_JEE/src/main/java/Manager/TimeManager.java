package Manager;

import Tools.TimeSwap;
import Tools.TimeTools;

public class TimeManager {
	int firstNumber;
	int secondNumber;
	int thirdNumber;
	int fourthNumber;
	int fifthNumber;
	int sixthNumber;
	String result = "";
	
	public TimeManager(String number) {
		if (number.length() == 6)
		{
			firstNumber = Integer.parseInt(number.substring(0, 1));
			secondNumber = Integer.parseInt(number.substring(1, 2));
			thirdNumber = Integer.parseInt(number.substring(2, 3));
			fourthNumber = Integer.parseInt(number.substring(3, 4));
			fifthNumber = Integer.parseInt(number.substring(4, 5));
			sixthNumber = Integer.parseInt(number.substring(5, 6));
		}
		else
			result = "PAS POSSIBLE";
	}
	
	public String getTime() 
	{
		int hour = firstNumber*10 + secondNumber;
		int minute = thirdNumber*10 + fourthNumber;
		int second = fifthNumber*10 + sixthNumber;
		
		if (result != "PAS POSSIBLE")
			if (TimeTools.validSecondOrMinute(second) 
					&& TimeTools.validSecondOrMinute(minute) 
					&& TimeTools.validHour(hour))
				result =  hour + "h" + minute + "m" + second + "s";
			else
			{
				TimeSwap ts = new TimeSwap(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber);
				result = ts.FoundRightTime();
			}
		return result;
	}
}
