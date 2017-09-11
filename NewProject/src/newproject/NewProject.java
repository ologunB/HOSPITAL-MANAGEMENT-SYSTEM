
package newproject;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class NewProject extends Application{

    public static void main(String[] args) {
        launch(args);
    }
       
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hosp.fxml"));
        
        Parent root = loader.load();
       
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("newstyle.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();
    }
}
