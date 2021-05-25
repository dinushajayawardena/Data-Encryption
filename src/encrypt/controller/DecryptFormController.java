package encrypt.controller;


import javafx.event.ActionEvent;
import javafx.scene.control.*;
import lk.ijse.crypto.DEP7Crypto;

import java.util.Arrays;

public class DecryptFormController {
    public TextField txtInput;
    public TextField txtKey;
    public Button btnDecrypt;
    public TextField txtDecryptedText;


    public void btnDecrypt_OnAction(ActionEvent actionEvent) {

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////DECRYPTION ALGORITHM/////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //get the Text, to be decrypted and get the suffix part of it
        //compare the suffix part and decrypt key
        // if the key is matching with the suffix then,
        //Divide the entire input text into two parts by getting the index of each character and comparing even or odd
        //get the even indexed part and at the end of that concatenate with the odd indexed part
        //if not matching,
        // generate random string ..

        /////////////////////////////////////////////////////////////////////

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


        txtDecryptedText.setText(DEP7Crypto.decrypt(textToBeConverted, key));


    }
}
