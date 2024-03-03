import javax.swing.*;

public class numberguess {
    public static void main(String[] args) {
        int resNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        int count = 1;
        try {
            while (userAnswer != resNumber) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                userAnswer = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(userAnswer, resNumber, count));
                count++;
            }
        } catch (Exception e) {
        }
   }
public static String determineGuess(int userAnswer , int resNumber , int count)
    {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Your guess is invalid";
        } else if (userAnswer == resNumber) {
            return "Correct! \n Total Guesses : " + count;
        } else if (userAnswer > resNumber) {
            return "Your guess is too high, try again, \n Try Number : " + count;
        } else if (userAnswer < resNumber) {
            return "Your guess is too low, try again, \n Try Number :  " + count;
        } else {
            return "Your guess is incorrect \n Try Number : " + count;
        }
    }
}
