import java.util.Scanner;

public class Calculator {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		CalculatorOperations calculations = new CalculatorOperations();
		
		System.out.println("Enter calculation e.g(prime 7): ");
		String expression = userInput.nextLine();
		
		//split the string to get the operator 
		String [] expressionArray = expression.split(" "); 

		//checks if index 0 is a number or not.
		if(!isNumeric(expressionArray)) {
			
			//checks if it has a single input or 2 for factorial, prime and fibonacci etc.
			if(expressionArray.length > 1) {
				String operator = expressionArray[0].toLowerCase();
				
				switch(operator) {
				
					case "factorial":
						calculations.factorial(expressionArray);
						break;
						
					case "prime":
						int primeNumber = calculations.prime(expressionArray);
						System.out.println("Highest prime number is: " + primeNumber); 
						break;
						
					case "fibonacci":	
						calculations.fibonacci(expressionArray);
						break;
						
					case "addition":
						calculations.addition(expressionArray);	
						break;
						
					case "subtraction":
						calculations.subtraction(expressionArray);
						break;
						
					case "multiplication":
						calculations.multiplication(expressionArray);
						break;
						
					case "division":
						calculations.division(expressionArray);
						break;

					default:
						System.out.println("Invalid entry.");
				}	
			}
		}	
		
		else {
			System.out.println("'"+ expressionArray[0] +"'");
		}		
	}

	private static boolean isNumeric(String[] expressionArray) {
		try {
			Double.parseDouble(expressionArray[0]);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
}
