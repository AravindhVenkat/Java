import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int generatedNumber = (int) (Math.random()*100 + 1);
        int userGuessedNumber = 0;
        System.out.println("The correct guess would be " + generatedNumber);
        int count = 1;

        while (userGuessedNumber != generatedNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userGuessedNumber = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userGuessedNumber, generatedNumber, count));
            count++;
        }
    }

    public static String determineGuess(int userGuessedNumber, int generatedNumber, int count){
        if (userGuessedNumber <=0 || userGuessedNumber >100) {
            return "Your guess is invalid";
        }
        else if (userGuessedNumber == generatedNumber){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userGuessedNumber > generatedNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userGuessedNumber < generatedNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
