package encrypt.controller;

import encrypt.util.DEP7Crypto;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.Arrays;
import java.util.Timer;


public class EncryptFormController {
    public Label lblOutput;
    public Button btnConvert;
    public TextField txtInput;
    public TextField txtKey;
    public Button btnEncrypt;
    public TextField txtEncryptedText;

    public void initialize() throws InterruptedException {

        Thread.sleep(500);
        txtInput.requestFocus();
    }

    public void btnConvert_OnAction(ActionEvent actionEvent) {

/*
        lblOutput.setText("");

        String text = txtInput.getText();
        String key = txtKey.getText();

        if (text.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Invalid text...", ButtonType.CANCEL).show();
            txtInput.requestFocus();
            return;
        }
        if (key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Invalid Key..",ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }

        text = text + key;
        String reversedText="";
        //System.out.println(text);

        for (int i = text.length()-1; i >=0; i--) {
            reversedText += text.charAt(i);
        }

        //System.out.println(reversedText);

        String ciperText = "";
        for (int i = 0; i < reversedText.length(); i++) {
            int code = reversedText.charAt(i);
            code = code + 10;
            char newChar = (char) code;
            ciperText += newChar;
        }

        lblOutput.setText(lblOutput.getText()+ "  " + ciperText);*/
    }

    public void btnEncrypt_OnAction(ActionEvent actionEvent) {

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

/*        String even = "";
        String odd = "";
        for (int i = 0; i < textToBeConverted.length(); i++) {
            if (i%2 == 0){
                even += textToBeConverted.charAt(i);
            }else {
                odd += textToBeConverted.charAt(i);
            }
        }

        String encryptedText = even + odd;
        String ciperText = "";

        for (int i = 0; i < encryptedText.length(); i++) {
            int code = encryptedText.charAt(i);
            code +=10;
            char newChar = (char) code;
            ciperText += newChar;
        }

        String ciperkey = "";
        for (int i = 0; i < key.length(); i++) {
            int code = key.charAt(i);
            code +=10;
            char newChar = (char) code;
            ciperkey += newChar;
        }

        ciperText += ciperkey;*/

        txtEncryptedText.setText(DEP7Crypto.encrypt(textToBeConverted, key));

    }
}
