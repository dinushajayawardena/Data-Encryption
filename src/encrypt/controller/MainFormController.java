package encrypt.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public Button btnEncrypt;
    public Button btnDecrypt;

    public void btnEncrypt_OnAction(ActionEvent actionEvent) throws IOException {

        Stage encryptStage = new Stage();
        Parent root = FXMLLoader.load(this.getClass().getResource("../view/EncryptForm.fxml"));
        Scene tableScene = new Scene(root);
        encryptStage.setScene(tableScene);
        encryptStage.setTitle("Encryption");
        encryptStage.setResizable(false);
        encryptStage.initModality(Modality.APPLICATION_MODAL);
        encryptStage.centerOnScreen();
        encryptStage.show();
    }

    public void btnDecrypt_OnAction(ActionEvent actionEvent) throws IOException {
        Stage decryptStage = new Stage();
        Parent root = FXMLLoader.load(this.getClass().getResource("../view/DecryptForm.fxml"));
        Scene tableScene = new Scene(root);
        decryptStage.setScene(tableScene);
        decryptStage.setTitle("Decryption");
        decryptStage.setResizable(false);
        decryptStage.initModality(Modality.APPLICATION_MODAL);
        decryptStage.centerOnScreen();
        decryptStage.show();
    }
}
