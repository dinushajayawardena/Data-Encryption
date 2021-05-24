package encrypt.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DecryptFormController {
    public Label lblOutput;
    public Button btnConvert;
    public TextField txtInput;
    public TextField txtKey;

    public void btnConvert_OnAction(ActionEvent actionEvent) {

        lblOutput.setText("");

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

    //    lblOutput.setText(lblOutput.getText()+ "  " + originalText);

    }
}
