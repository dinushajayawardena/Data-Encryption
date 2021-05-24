package encrypt.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.Arrays;

public class DecryptFormController {
    public Label lblOutput;
    public TextField txtInput;
    public TextField txtKey;
    public Button btnDecrypt;
    public TextField txtDecryptedText;

/*    public void btnConvert_OnAction(ActionEvent actionEvent) {

        *//*lblOutput.setText("");

        String text = txtInput.getText();
        String key = txtKey.getText();
        String cipertext = "";

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

    //    lblOutput.setText(lblOutput.getText()+ "  " + originalText);*//*

    }*/

    public void btnDecrypt_OnAction(ActionEvent actionEvent) {

        String textToBeConverted = "";
        String key;

        textToBeConverted = txtInput.getText();
        key = txtKey.getText();

        if (textToBeConverted.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please give a text convert.",ButtonType.OK).show();
            return;
        }

        if (key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please give a Key.",ButtonType.OK).show();
            return;
        }

        char[] convertedText = new char[textToBeConverted.length()];
        String even = "";
        String odd = "";
        int firstEnd = 0;

        for (int i = 0; i < (textToBeConverted.length() + 1)/2; i++) {
            even += textToBeConverted.charAt(i);
            firstEnd = i;
        }

        for (int i = firstEnd +1 ; i < textToBeConverted.length() ; i++) {
            odd += textToBeConverted.charAt(i);
        }

        System.out.println(even);
        System.out.println(odd);

        int evenNode = 0;
        int oddNode = 0;
        String output = "";

        for (int i = 0; i < convertedText.length; i++) {
            if (i%2 == 0){
                convertedText[i] = even.charAt(evenNode);
                evenNode++;
            }else {
                convertedText[i] = odd.charAt(oddNode);
                oddNode++;
            }
            output = output + convertedText[i];
        }

        txtDecryptedText.setText(output);


    }
}
