package Modul_2_core_java;

public class A40_Arithmetic_O_P {

	public static void main(String[] args) {
		        if (args.length != 2) {
		            System.out.println("Please provide two numbers as command line arguments.");
		            return;
		        }

		        // Parse the command line arguments as double numbers
		        try {
		            double num1 = Double.parseDouble(args[0]);
		            double num2 = Double.parseDouble(args[1]);

		            // Perform division operation
		            double result = divideNumbers(num1, num2);

		            // Print the result
		            System.out.println("Result of division: " + result);
		        } catch (NumberFormatException e) {
		            System.out.println("Invalid input. Please provide valid numbers.");
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero is not allowed.");
		        }
		    }

		    // Method to perform division and handle division by zero
		    private static double divideNumbers(double dividend, double divisor) {
		        if (divisor == 0) {
		            throw new ArithmeticException("Division by zero");
		        }
		        return dividend / divisor;
		    }
		}
