package exercise1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//controller for the main window
public class Controller implements Initializable{
	// attributes from the form
	@FXML
	TextField nameInput;
	@FXML
	TextField addressInput;
	@FXML
	TextField provinceInput;
	@FXML
	TextField cityInput;
	@FXML
	TextField postalInput;
	@FXML
	TextField phoneInput;
	@FXML
	TextField emailInput;
	@FXML
	CheckBox sportCheckbox;
	@FXML
	CheckBox hackCheckbox;
	@FXML
	CheckBox volunteerCheckbox;
	@FXML
	RadioButton csRadioBtn, businessRadioBtn;
	@FXML
	ListView<String> listView;
	
	// choice
	@FXML
	ChoiceBox<String> myBox;

	
	String[] businessPrograms = {"Art Commerce", "Ebay Merchant", "Twitter Owner", "Crypto Investor"};
	String[] sciencePrograms = {"Cat Psychologist", "Quantum programmer", "Rocket Science", "Data Scientist"};
	String[] allPrograms = {};
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void enableBox(ActionEvent event) {
		myBox.getItems().clear();
		listView.getItems().clear();
		if (csRadioBtn.isSelected()) {
			allPrograms = sciencePrograms;
			myBox.getItems().addAll(allPrograms);
		} else if (businessRadioBtn.isSelected()) {
			allPrograms = businessPrograms;
			myBox.getItems().addAll(allPrograms);
		}
		/* debug
		System.out.println(allPrograms.length);
		*/
		myBox.setDisable(false);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		myBox.getItems().addAll(allPrograms);
		myBox.setOnAction(this::enableBox);
		myBox.setOnAction(this::getProgram);
		
		
	}
	
	public void getProgram(ActionEvent e) {
		//listview
		String boxValue;
		boxValue= myBox.getValue();
				
		if (boxValue != null) {
			for (String temp : listView.getItems()) {
				if (boxValue.equals(temp)) {
					System.out.println("item exists already");
				return;
				}
			}
			
			listView.getItems().add(boxValue);
			// debug
			//System.out.println(boxValue);	
		}
		
		
	}
	
	// set RB
	String mayorText = "";
	int mayor;
	


	// Main scene with the form
	// Scene for the window that displays results
		public void submitForm(ActionEvent event) {

			
			try {
				// get data from inputs
				String name = nameInput.getText();
				String address = addressInput.getText();
				String province = provinceInput.getText();
				String city = cityInput.getText();
				String postal = postalInput.getText();
				String phone = phoneInput.getText();
				String email= emailInput.getText();
				
				// checkbox text
				String sportText;
				String hackText;
				String volunteerText;
				String optionalActivities;
				
				String selectedPrograms = "";
								

				// set the mayor
//				if (mayor == 0) {
//					mayorText = "Science";
//				
//					
//				} else if (mayor == 1) {
//					mayorText = "Business";
//				}
				
				if (csRadioBtn.isSelected()) {
					mayorText = "Science";
				
					
				} else if (businessRadioBtn.isSelected()) {
					mayorText = "Business";
				}
				
				// selected programs
				
				for (String temp : listView.getItems()) {
					selectedPrograms += temp;
					selectedPrograms += "\n";
				}
				
				

				// set the extras				
				
				if (sportCheckbox.isSelected()) {
					sportText = "\n-Requested registration for Sport Club.";
				} else {
					sportText = "";
				}
				if (hackCheckbox.isSelected()) {
					hackText = "\n-Requested registration for Hack Club.";
				} else {
					hackText = "";
				}
				if (volunteerCheckbox.isSelected()) {
					volunteerText = "\n-Requested registration for Volunteer activities.";
				} else {
					volunteerText = "";
				}
				
				if (sportText.trim().isEmpty() && hackText.trim().isEmpty() && volunteerText.trim().isEmpty()) {
					optionalActivities = "No Additional Activities requested.";
				} else {
					optionalActivities = "Additional Activities Registered:" + sportText + " " + hackText + " " + volunteerText; 
				}
				
				// debug
				//System.out.println(name);

				
				// validates if the required fields are empty
				if (name.trim().isEmpty() || address.trim().isEmpty() || province.trim().isEmpty() ||
						city.trim().isEmpty() || phone.trim().isEmpty() || email.trim().isEmpty() ||
						mayorText.trim().isEmpty() || selectedPrograms.trim().isEmpty() ) {
					// alert if the user did not submit the required fields
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("Incomplete submission");
					alert.setHeaderText("Some fields are missing");
					alert.setContentText("Please fill all the required fields before proceeding");
					alert.show();
					System.out.println("Missing required fields");
					return;
				}
					// loads the next scene
					FXMLLoader loader = new FXMLLoader(getClass().getResource("Output.fxml"));
					root = loader.load();
					OutputController sceneOutputController = loader.getController();
					sceneOutputController.displayData(name, address, province, city, postal, phone, email, optionalActivities, 
							mayorText, selectedPrograms );
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			String css = this.getClass().getResource("app.css").toExternalForm();
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();
			
		}


}
