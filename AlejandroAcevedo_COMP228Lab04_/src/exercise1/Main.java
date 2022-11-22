package exercise1;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;


/**
* The application receives enrollment information
* and just displays the entered data in a new window.
*
* @author  		I. Alejandro Acevedo
* @version		1.0
* @studentID   	301222234
* @course		COMP 228
* @professor	Salima Amlani
*/

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			// adding CSS when there is only one scene
			//scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
			// In case of having more than one scene, we can apply the css to many scene objects:
			String css = this.getClass().getResource("app.css").toExternalForm();
			scene.getStylesheets().add(css);
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println("running application lab 4");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
