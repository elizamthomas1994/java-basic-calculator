import java.util.Scanner;

public class BasicCalculator {
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);

		System.out.println("Hello and welcome to the Calculator app!");
		System.out.println("Please select from one of the following options");
		System.out.println("Press '1' for addition");
		System.out.println("Press '2' for subtraction");
		System.out.println("Press '3' for multiplication");
		System.out.println("Press '4' for division");

		int selection = scan.nextInt();
	}
	

	public int add (int numberA, int numberB){
		return numberA + numberB;
	}

	public int subtract (int numberA, int numberB){
		return numberA - numberB;
	}

	public int multiply (int numberA, int numberB){
		return numberA * numberB;
	}

	public int divide (int numberA, int numberB){
		return numberA / numberB;
	}

}