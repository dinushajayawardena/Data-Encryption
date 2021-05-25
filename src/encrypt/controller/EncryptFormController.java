package encrypt.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import lk.ijse.crypto.DEP7Crypto;

import java.util.Arrays;
import java.util.Timer;


public class EncryptFormController {
    public Label lblOutput;
    public TextField txtInput;
    public TextField txtKey;
    public Button btnEncrypt;
    public TextField txtEncryptedText;

    public void initialize() throws InterruptedException {

        //Thread.sleep(500);
        txtInput.requestFocus();
    }

    public void btnEncrypt_OnAction(ActionEvent actionEvent) {

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////ENCRYPTION ALGORITHM/////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Divide the entire input text into two parts by getting the index of each character and comparing even or odd
        //get the even indexed part and at the end of that concatenate with the odd indexed part
        //get the relevant ASCII value for each character and add CONST value (10) and generate new characters
        //to make a relationship with the key,
        // convereted the given key into integer codes
        // divide each integer code into two parts. get the last digits( names as "suffix" ) and concatenate them together
        // add the suffix to the end of the cipher text



        String textToBeConverted = "";
        String key;

        textToBeConverted = txtInput.getText();
        key = txtKey.getText();

        if (textToBeConverted.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please give a text to convert.",ButtonType.OK).show();
            return;
        }

        if (key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please give a Key.",ButtonType.OK).show();
            return;
        }

        txtEncryptedText.setText(DEP7Crypto.encrypt(textToBeConverted, key));

    }
}
