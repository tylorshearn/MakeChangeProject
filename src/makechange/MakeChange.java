package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		System.out.println("                ()$$ $$()");
		System.out.println("                ()$$ $$()");
		System.out.println("             ()$$$$$$$$$$$$$$()");
		System.out.println("            ()$$$$$$$$$$$$$$$$()");
		System.out.println("           ()$$$$ $$ $$ $$$$$$()");
		System.out.println("          ()$$$$$ $$ $$ $$$$$$()");
		System.out.println("          ()$$$$$ $$ $$ $$$$$()");
		System.out.println("           ()$$$$ $$ $$ $$$()");
		System.out.println("            ()$$$ $$ $$()");
		System.out.println("             ()$$$$$ $$()");
		System.out.println("              ()$$$$$$$()");
		System.out.println("                ()$$$$$$$()");
		System.out.println("                ()$$ $$$$$()");
		System.out.println("                ()$$ $$$$$$$()");
		System.out.println("            ()$$$ $$ $$ $$$$$()");
		System.out.println("          ()$$$$$ $$ $$ $$$$$()");
		System.out.println("         ()$$$$$$ $$ $$ $$$$$()");
		System.out.println("         ()$$$$$$ $$ $$ $$$$()");
		System.out.println("         ()$$$$$$$$$$$$$$$$()");
		System.out.println("          ()$$$$$$$$$$$$$$()");
		System.out.println("                ()$$ $$()");
		System.out.println("                ()$$ $$()");

		System.out.println("         _____________________ ");
		System.out.println("        |       WELCOME       |");
		System.out.println("        |          TO         |");
		System.out.println("        |    CASH REGISTER    |");
		System.out.println("        |         $$$$        |");
		System.out.println("        |   PLEASE ENTER THE  |");
		System.out.println("        |    PRICE OF YOUR    |");
		System.out.println("        |         ITEM: ...   |");
		System.out.println("        |_____________________|");
		

		Scanner kb = new Scanner(System.in);

		double itemPrice = kb.nextDouble();

		System.out.println("         _____________________");
		System.out.println("        |    PLEASE ENTER     |");
		System.out.println("        |       AMOUNT        |");
		System.out.println("        |      TENDERED: ...  |");
		System.out.println("        |_____________________|");

		double tender = kb.nextDouble();
		
        if (tender == itemPrice) {
        System.out.println("         _____________________");
        System.out.println("        |   TENDERED AMOUNT   |");
        System.out.println("        |        EXACT        |");
        System.out.println("        |      NO CHANGE      |");
        System.out.println("        |      PROVIDED       |");
        System.out.println("        |_____________________| ");
        	
        }
		
		if (tender < itemPrice) {
		System.out.println("         _____________________");
		System.out.println("        |   TENDERED AMOUNT   |");
		System.out.println("        |IS NOT SUFFICIENT FOR|");
		System.out.println("        |      ITEM PRICE     |");
		System.out.println("        |  PLEASE TRY AGAIN...|");
		System.out.println("        |_____________________| ");
		tender = kb.nextDouble();	
		if (tender == itemPrice) {
		System.out.println("         _____________________");
		System.out.println("        |   TENDERED AMOUNT   |");
		System.out.println("        |        EXACT        |");
		System.out.println("        |      NO CHANGE      |");
		System.out.println("        |      PROVIDED       |");
		System.out.println("        |_____________________| ");
			
		}
		}
		
		makeChange(itemPrice, tender);
	kb.close();
	}

	public static int makeChange(double itemPrice, double tender) {

		double result = tender - itemPrice;

		if (tender > itemPrice) {

		int change = (int) (Math.ceil(result * 100));
		int singles = (int) change / 100;
		change = change % 100;
		int quarters = Math.round((int) change / 25);
		change = change % 25;
		int dimes = Math.round((int) change / 10);
		change = change % 10;
		int nickels = Math.round((int) change / 5);
		change = change % 5;
		int pennies = Math.round((int) change / 1);
		int fives = (int) singles / 5;
		singles = singles % 5;
		int tens = (int) fives / 2;
		fives = fives % 2;
		int twenties = (int) tens / 2;
		tens = tens % 2;

		System.out.println("Your change is...");
		System.out.println("Twenties: " + twenties);
		System.out.println("Tens: " + tens);
		System.out.println("Fives: " + fives);
		System.out.println("Singles: " + singles);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
		}
		
		return (int) result;
	}
}

