package squareDisplay;

import javax.swing.JOptionPane;

/**
 *
 * @author Niaz Morshed
 */
public class SquareDisplay {

    public static void main(String args[]) {
        String userInput; // To hold the userInput values 
        String output = ""; // To hold the string for output to the user
        int number = 0;
        int counterOne; // To hold the value for outside loop 
        int counterTwo; // To hold the value for inside loop 

        // Check to make sure input fits the guide lines; must be 1-15 
        while (number < 1 || number > 15) {
            // Get input from the user 
            userInput = JOptionPane.showInputDialog("Please enter a value 1-15: ");

            // Convert user input in to an integer 
            number = Integer.parseInt(userInput);

        } // End while loop for guide line checker 

        // Run a two For loops to create the square 
        // Outside loop adds another row 
        for (counterOne = 0; counterOne < number; counterOne++) {

            // Inner loop places an appropriate number of X's in a row 
            for (counterTwo = 0; counterTwo < number; counterTwo++) {
                output = output + 'X';
            }
            // Go to next line 
            output = output + '\n';
        }

        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
    }
}
