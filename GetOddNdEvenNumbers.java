package OddAndEvenNumbers;// project created in eclipse
import java.util.Scanner;// imported scanner class

public class GetOddNdEvenNumbers { // public class 'GetOddNdEvenNumbers'

	public static void main(String[] args) {// reads, runs and executes code
		
	// an object of the imported class created 'scanner', (System.in) allows keyboard use
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number to see if it's odd or even: "); // displays text
		
		int numberEven = scanner.nextInt(); // reads the input and stores it to variable
		
		
		scanner.close(); // closed the scanner
		
	// if statement set, if the remainder is 0, the number is even otherwise odd
		if(numberEven%2 == 0) { 
			System.out.println("Number is even");// displays text
		}else {
			System.out.println("The Number is odd");// display text
		}
		
	}
}

// result:
// Inputed number 5
// Please enter a number to see if it's odd or even: 5
// The Number is odd
