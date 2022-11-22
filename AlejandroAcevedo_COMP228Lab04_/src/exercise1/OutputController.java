package exercise1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class OutputController {

	private Stage stage;
	private Scene scene; 
	private Parent root;
	
	@FXML
	TextArea resultsTextArea;
	
	public void displayData(String name, String address, String province, 
			String city, String postal, String phone, String email,
			String optionalActivities, String mayor, String program) {
		resultsTextArea.setText("Name: " + name +
				"\nAddress: " + address + "\n" + city + 
				", " + province + " " + postal + "\n" +
				"- - - - - - - - - - - - - - -" +  "\nContact Information:\n" +
				"Phone Number: " + phone + "\nEmail address: " +
				email + "\n" + "- - - - - - - - - - - - - - -" + 
				"\nMayor: " + mayor + "\n" + "Programs:\n" + program + "\n" +
				optionalActivities);
	}
	
	// Main scene with the form
		public void switchToScene0(ActionEvent event) {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
				root = loader.load();
				stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				String css = this.getClass().getResource("app.css").toExternalForm();
				scene.getStylesheets().add(css);
				stage.setScene(scene);
				stage.show();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
