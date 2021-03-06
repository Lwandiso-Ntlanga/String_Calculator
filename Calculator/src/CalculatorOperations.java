
public class CalculatorOperations {
	/**
	 * The method calculates the factorial of the number from the array parameter.
	 * Then outputs the result.
	 * @param expressionArray
	 */
	public void factorial(String []expressionArray){
		
		int number = Integer.parseInt(expressionArray[1]);
		int factorial = 1;
		int i;
		
		for(i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("'"+ factorial +"'");
		
	}
	
	/**
	 * The method determines the highest prime number less then the given number 
	 * by checking the prime numbers less than it, if it has a reminder equal to 0 or not.
	 * @param expressionArray
	 */
	public int prime(String []expressionArray) {
		int number = Integer.parseInt(expressionArray[1]);		 
		int primeNumber = 0;

		for(int checkNum = 2; checkNum <= number; checkNum++){ 
			boolean prime = true;
			
			for(int factor = 2; factor <= checkNum/2; factor++) {
				if((checkNum % factor) == 0){
					prime =false;
					break;
				}				
			}
			
			//if the number is a prime and is less than the given number 
			//then set it as the highest prime number less than the given number.
			if(prime && (checkNum < number)) {
				primeNumber = checkNum;
			}
		} 
		return primeNumber;
	}
	
	/**
	 * This method calculates the highest fibonacci number less than the given number through the array.
	 * @param expressionArray
	 */
	public void fibonacci(String []expressionArray) {
		int number = Integer.parseInt(expressionArray[1]);
		int temp = 0;
		int last = 0;
		int fib = 1;
		
		if(number == 0) {
			System.out.println("Highest fibonacci number is: " + number);
		}
		else {			
			for(int i = 2; i < number; i++) {
				temp = last + fib;
				last = fib;
				fib = temp;
				
				//if the next temp value is less than the given number 
				//than store the current temp value as the highest fibonacci number.
				//if it's more than the given number end calculation.
				if((last + fib) < number) {
					fib = temp;
				}
				else {
					break;
				}
			}			
			System.out.println("Highest fibonacci number is: " + fib);
		}
	}
	
	/**
	 * This method calculates the added sum of the values in the array.
	 * @param expressionArray
	 */
	public void addition(String []expressionArray) {
		double number;
		double sum = 0.0;
		
		//adds the numbers from each index in the array
		for(int i = 1; i < expressionArray.length; i++) {
			number = Double.parseDouble(expressionArray[i]);			
			sum += number;
		}
		
		//checks if sum has a fractal part/decimal value. 
		//if the decimal value is 0 then it removes it from the answer.
		double check = sum - (int)sum;
		
		if(check != 0.0) {
			System.out.println("'"+ sum +"'");
		}
		else {
			System.out.println("'"+ (int)sum +"'");
		}
	}
	
	/**
	 * This method calculates the subtracted sum of the values in the array.
	 * @param expressionArray
	 */
	public void subtraction(String []expressionArray) {
		double number;
		double sum = 0.0;
		
		//subtracts the numbers from each index in the array
		for(int i = 1; i < expressionArray.length; i++) {
			number = Double.parseDouble(expressionArray[i]);			
			sum -= number;
		}
		
		//checks if sum has a fractal part/decimal value. 
		//if the decimal value is 0 then it removes it from the answer.
		double check = sum - (int)sum;
		
		if(check != 0.0) {
			System.out.println("'"+ sum +"'");
		}
		else {
			System.out.println("'"+ (int)sum +"'");
		}
	}
	
	/**
	 * This method calculates the multiple of the values in the array.
	 * @param expressionArray
	 */
	public void multiplication(String []expressionArray) {
		double number;
		double multiple = Double.parseDouble(expressionArray[1]);
		
		//multiplies the numbers from each index in the array
		for(int i = 2; i < expressionArray.length; i++) {
			number = Double.parseDouble(expressionArray[i]);			
			multiple *= number;
		}
		
		//checks if sum has a fractal part/decimal value. 
		//if the decimal value is 0 then it removes it from the answer.
		double check = multiple - (int)multiple;
		
		if(check != 0.0) {
			System.out.println("'"+ multiple +"'");
		}
		else {
			System.out.println("'"+ (int)multiple +"'");
		}
	}
	
	/**
	 * This method calculates the division of the values in the array.
	 * @param expressionArray
	 */
	public void division(String []expressionArray) {
		double number;
		boolean divisible = true;
		double div = Double.parseDouble(expressionArray[1]);
		
		//divides the numbers from each index in the array
		for(int i = 2; i < expressionArray.length; i++) {
			number = Double.parseDouble(expressionArray[i]);	
			
			if(number == 0) {
				System.out.println("Error can not divide by 0.");
				divisible = false;
			}
			else {
				div /= number;
			}			
		}
		
		//checks if it's divisible because if it's not that means user tried to divide using 0.
		if (divisible) {
			
			//checks if sum has a fractal part/decimal value. 
			//if the decimal value is 0 then it removes it from the answer.
			double check = div - (int) div;
			
			if (check != 0.0) {
				System.out.println("'"+ div +"'");
			} 
			else {
				System.out.println("'"+ (int) div +"'");
			} 
		}
	}
}
