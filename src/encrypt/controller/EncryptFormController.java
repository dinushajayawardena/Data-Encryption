package encrypt.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class EncryptFormController {
    public Label lblOutput;
    public Button btnConvert;
    public TextField txtInput;
    public TextField txtKey;

    public void btnConvert_OnAction(ActionEvent actionEvent) {

        String text = txtInput.getText();
        String key = txtKey.getText();

        if (text.trim().isEmpty() || key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Invalid text/key...");
        }

        text = text + key;

    }
}
