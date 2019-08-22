package br.com.hospitalif.model;

public class ModelPerson {
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.ChoiceBox;
	import javafx.scene.control.DatePicker;
	import javafx.scene.control.TextField;

	public class HospitalControl {

	    @FXML
	    private TextField txtName;

	    @FXML
	    private TextField txtCPF;

	    @FXML
	    private DatePicker pckBirthDate;

	    @FXML
	    private ChoiceBox<?> cboBlood;

	    @FXML
	    private ChoiceBox<?> cboSex;

	    @FXML
	    private ChoiceBox<?> cboStatus;

	    @FXML
	    private Button btnBack;

	    @FXML
	    private Button btnOK;

	    @FXML
	    void setCpf(ActionEvent event) {

	    }

	    @FXML
	    void setName(ActionEvent event) {

	    }

	}


}
