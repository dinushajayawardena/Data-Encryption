package encrypt.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;


public class EncryptFormController {
    public Label lblOutput;
    public Button btnConvert;
    public TextField txtInput;
    public TextField txtKey;

    public void initialize(){
        txtInput.requestFocus();
    }

    public void btnConvert_OnAction(ActionEvent actionEvent) {

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

        text = text.trim() + key.trim();
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

        lblOutput.setText(lblOutput.getText()+ "  " + ciperText);

    }
}
