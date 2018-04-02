import java.util.Scanner;
import java.io.*;

public class J03FahrenheitCelsius
{
    public static void main(String[]args)
    {
		Scanner console = new Scanner(System.in);

		double cal = 0, fah = 0, cal1 = 0, fah1 = 0;
		int choice;

		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println("3. Exit");

		System.out.print("Choice: ");
		choice = console.nextInt();

		while(choice != 3)
		{

			if(choice == 1)
			{
				System.out.print("Enter Fahrenheit ");
				fah = console.nextInt();
				cal = (fah - 32) * 5/9; //Fahrenheit Calculation
				System.out.printf("%2.2f Fahrenheit is %2.2f Celsius.\n", fah, cal);
			}
			else if(choice == 2)
			{
				System.out.print("Enter Celsius ");
				cal1 = console.nextInt();
				fah1 = (cal * 9/5) + 32; //Celsius Calculation
				System.out.printf("%2.2f Celsiusis is %2.2f Fahrenheit.\n", cal1, fah1);
			}
			else
			{

			}

			System.out.println();

			System.out.println("1. Fahrenheit to Celsius");
			System.out.println("2. Celsius to Fahrenheit");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			choice = console.nextInt();
		}//while
    }//main
}