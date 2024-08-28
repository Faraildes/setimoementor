package gui;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Teacher;

public class TeacherListController implements Initializable {
	
	@FXML
	private TableView<Teacher> tableViewTeacher; 
	
	@FXML
	private TableColumn<Teacher, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Teacher, String> tableColumnName;
	
	@FXML
	private TableColumn<Teacher, Date> tableColumnAdmissionDate;
	
	@FXML
	private TableColumn<Teacher, String> tableColumnCpf;
	
	@FXML
	private TableColumn<Teacher, String> tableColumnPhone;
	
	@FXML
	private TableColumn<Teacher, Double> tableColumnSalary;
	
	@FXML
	private Button btNew;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
	}	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();	
	}
	
	public void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		tableColumnAdmissionDate.setCellValueFactory(new PropertyValueFactory<>("AdmissionDate"));
		tableColumnCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tableColumnPhone.setCellValueFactory(new PropertyValueFactory<>("Phone"));
		tableColumnSalary.setCellValueFactory(new PropertyValueFactory<>("salaary"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewTeacher.prefHeightProperty().bind(stage.heightProperty());
	}
}
