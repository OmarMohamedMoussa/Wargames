package no.ntnu.iir.wargames;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class StartController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button playButton;

    public void changeScene(ActionEvent e) {
        playButton.setOnAction(actionEvent -> {

            try {
                URL url = new File("no/ntnu/iir/wargames/FieldSelectScene.fxml").toURI().toURL();
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            }
            FXMLLoader fxmlLoader =  new FXMLLoader();
            Parent root = null;
            try {
                root = fxmlLoader.load();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Scene scene = new Scene(root);
            Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
            window.setScene(scene);

        });

    }
    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("FieldSelectScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
