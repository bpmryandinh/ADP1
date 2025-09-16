package edu.okcu.guessfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;



public class GuessFXController {
    Random rand = new Random();
    int number;
    public int UserGuess;
    int guesses;
    int numGuesses = 0;

    @FXML
    private Button btnGuess;

    @FXML
    private Label txtNumGuesses;

    @FXML
    private TextField txtUserGuess;

    @FXML
    private Label welcomeText;


    //method initializes random number
    public void initialize() {
        createRandomNumber();
    }

    //Method to create a random number
    private void createRandomNumber() {
        number = rand.nextInt(100) + 1;
    }

    //Converts integer to string
    public void onGuess(ActionEvent actionEvent) {
        UserGuess = Integer.parseInt(txtUserGuess.getText());

        //program to hint the user how high, low, or correct their guess is
        if (UserGuess > number){
            welcomeText.setText("Too High");
        } else if (UserGuess < number){
            welcomeText.setText("Too Low");
        } else {
            welcomeText.setText("Good job!");
        }

        //set counter
        numGuesses++;
        if (UserGuess != number){
            txtNumGuesses.setText(String.valueOf("Number of Guesses: " + numGuesses));
        } else {
            txtNumGuesses.setText("Number of Guesses: 0");
        }

    }
}