package Tools;

import java.util.Arrays;

public class TimeSwap {
	int number[] = new int[6];
	boolean allSwapDone = false;
	
	public TimeSwap(int number1, int number2, int number3, int number4, int number5, int number6) 
	{
		number[0] = number1;
		number[1] = number2;
		number[2] = number3;
		number[3] = number4;
		number[4] = number5;
		number[5] = number6;
	}

	public String FoundRightTime()
	{
		int numberTaken[] = new int[6];
		int numberValidfirstNumberWithoutException[] = validForFirstNumberNoException();
		int numberValidfirstNumberWithException[] = validForFirstNumberException();
		int numberValidSecondNumberWithfirstNumberWithException[] = validForSecondNumberExceptionFirstNumber();
		int numberValidThirdAndFifthNumber[] = validSecondNumberWithfirstNumberWithException();
		
		if ((numberValidfirstNumberWithoutException[0] == 10 && numberValidfirstNumberWithException[0] == 10)
			|| (numberValidfirstNumberWithoutException[0] == 10 && numberValidfirstNumberWithException[0] != 10 && (numberValidSecondNumberWithfirstNumberWithException[1] == 10 || numberValidThirdAndFifthNumber[3] == 10 ))
			|| (numberValidfirstNumberWithoutException[0] != 10 && numberValidThirdAndFifthNumber[2] == 10 ))
			return "PAS POSSIBLE";
		else
		{
			if (numberValidfirstNumberWithoutException[0] != 10)
			{
				numberTaken[0] = numberValidfirstNumberWithoutException[0];
				reordered(numberValidThirdAndFifthNumber);
				if (numberValidThirdAndFifthNumber[2] != 10)
				{
					numberTaken[1] = numberValidThirdAndFifthNumber[0];
					reordered(numberValidThirdAndFifthNumber);
				}
				else 
				{
					numberTaken[1] = smallestNumberNotTakenOverSix(numberTaken, number);
				}
			}
			else
			{
				numberTaken[0] = numberValidfirstNumberWithException[0];
				reordered(numberValidSecondNumberWithfirstNumberWithException);
				reordered(numberValidThirdAndFifthNumber);
				numberTaken[1] = numberValidSecondNumberWithfirstNumberWithException[0];
				reordered(numberValidThirdAndFifthNumber);
			}			
			
			numberTaken[2] = numberValidThirdAndFifthNumber[0];
			
			numberTaken[4] = highternumber(numberValidThirdAndFifthNumber);
			
			numberTaken[3] = smallestNumberNotTaken(numberTaken, number);
			numberTaken[5] = highternumber(number);
		}	
		return (numberTaken[0]*10 + numberTaken[1]) + "h" + (numberTaken[2]*10 + numberTaken[3]) + "m" + (numberTaken[4]*10 + numberTaken[5]) + "s"; 
	}

	private int[] validForFirstNumberNoException() {
		int x[]= new int[6];
		for (int i = 0; i < 6; i++)
			if (number[i] < 2)
			{
				x[i] = number[i];
			}
			else
				x[i] = 10;
		Arrays.sort(x);
		return x;
	}
	
	private int[] validForFirstNumberException() {
		int x[]= new int[6];
		for (int i = 0; i < 6; i++)
			if (number[i] < 3)
			{
				x[i] = number[i];
			}
			else
				x[i] = 10;
		Arrays.sort(x);
		return x;
	}
	
	private int[] validForSecondNumberExceptionFirstNumber() {
		int x[]= new int[6];
		for (int i = 0; i < 6; i++)
			if (number[i] < 4)
			{
				x[i] = number[i];
			}
			else
				x[i] = 10;
		Arrays.sort(x);
		return x;
	}
	
	private int[] validSecondNumberWithfirstNumberWithException() {
		int x[]= new int[6];
		for (int i = 0; i < 6; i++)
			if (number[i] < 6)
			{
				x[i] = number[i];
			}
			else
				x[i] = 10;
		Arrays.sort(x);
		return x;
	}
	
	private static int[] reordered(int[] tab)
	{
		int x[]= tab;
		x[0] = 10;
		Arrays.sort(x);
		return x;
	}
	
	private static int smallestNumberNotTaken(int[] ref, int[] target)
	{
		int x[] = target;
		Arrays.sort(x);
		for (int i = 0 ; i < ref.length ; i++)
			for (int j = 0 ; j < x.length ; j++)
				if (ref[i] == x[j])
				{
					x[j] = 10;
					break;
				}
		Arrays.sort(x);
		for (int j = 0 ; j < x.length ; j++)
			System.out.println(x[j]);
		return x[0];

	}
	
	private static int smallestNumberNotTakenOverSix(int[] ref, int[] target)
	{
		int x[] = target;
		for (int i = 0 ; i < ref.length ; i++)
			for (int j = 0 ; j < x.length ; j++)
				if (ref[i] == x[j])
				{
					x[j] = 10;
					break;
				}
		
		Arrays.sort(x);
		
		for (int j = 0 ; j < x.length ; j++)
			if (x[j] >= 6)
				return x[j];
		
		return 42;
	}
	
	private static int highternumber(int[] tab)
	{
		for (int i = 5 ; i >= 0 ; i--)
				if (tab[i] != 10)
					return tab[i];
		return 1000000;

	}
}