package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemStudent;
	
	@FXML
	private MenuItem menuItemTeacher;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemStudent() {
		System.out.println("onMenuItemStudentAction");
	}
	
	@FXML
	public void onMenuItemTeacher() {
		System.out.println("onMenuItemTeacherAction");
	}
	
	@FXML
	public void onMenuItemAbout() {
		System.out.println("onMenuItemAboutAction");
	}
		
	@Override
	public void initialize(URL url, ResourceBundle rb) {
				
	}
}
