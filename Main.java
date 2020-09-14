import java.util.Scanner;

/**
 *This program will convert the temperature in degrees Celsius into degrees Farenheit 
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //asks user for the tempC
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");
    // declare and initialize the temperature in Celsius
    int tempC = input.nextInt();

    // converts tempC to tempF
    int tempF = (tempC * 9) / 5 + 32;
    System.out.println(tempC + "C is the same as " + tempF + "F" );
  }
}
