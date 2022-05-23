package no.ntnu.iir.wargames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GUI extends Application {

//    public static void main (String[] args) {
//        launch(args);
//    }

//    @Override
//    public void start(Stage stage) throws IOException {
//            URL url = FXMLLoader.load(getClass().getResource("StartScene.fxml"));
//            Parent root =FXMLLoader.load(url);
//            Scene scene = new Scene(root);
//            stage.setTitle("War games");
//            stage.setScene(scene);
//            stage.show();
//    }

    @Override
    public void start(Stage stage){
        try {
            FXMLLoader startWindowLoder = new FXMLLoader(getClass().getResource("StartScene.fxml"));
            Parent startWindowParent = startWindowLoder.load();
            Scene startWindowScene = new Scene(startWindowParent);
            stage.setScene(startWindowScene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
