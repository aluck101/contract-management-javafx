package energdata.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import energdata.model.Contractor;
import energdata.model.ContractorDAO;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author ALUCK
 */
public class ContractorsDataViewController {

    @FXML
    private TextField companyId;
    @FXML
    private TextField companyName;
    @FXML
    private TextField products_services;
    @FXML
    private TextField contactName;
    @FXML
    private TextField contactNumber;
    @FXML
    private TextField email;
    @FXML
    private TextField companyAddress;
    @FXML
    private TextField dpr_cert;
    @FXML
    private TextField companyRegNo;
    @FXML
    private TextField tax_id;
    @FXML
    private TextArea resultArea;
    @FXML
    private TableView contractorTable;
    @FXML
    private TableColumn<Contractor, Integer> companyIdColumn;
    @FXML
    private TableColumn<Contractor, String> companyNameColumn;
    @FXML
    private TableColumn<Contractor, String> product_servicesColumn;
    @FXML
    private TableColumn<Contractor, String> contactNameColumn;
    @FXML
    private TableColumn<Contractor, String> contactNumberColumn;
    @FXML
    private TableColumn<Contractor, String> emailColumn;
    @FXML
    private TableColumn<Contractor, String> companyAddressColumn;
    @FXML
    private TableColumn<Contractor, String> dpr_certColumn;
    @FXML
    private TableColumn<Contractor, String> companyRegNoColumn;
    @FXML
    private TableColumn<Contractor, String> tax_idColumn;

    /**
     * Initializes the controller class.
     */
    private void initialize() {

        companyIdColumn.setCellValueFactory(cellData -> cellData.getValue().companyIdProperty().asObject());
        companyNameColumn.setCellValueFactory(cellData -> cellData.getValue().companyNameProperty());
        product_servicesColumn.setCellValueFactory(cellData -> cellData.getValue().product_servicesProperty());
        contactNameColumn.setCellValueFactory(cellData -> cellData.getValue().contactNameProperty());
        contactNumberColumn.setCellValueFactory(cellData -> cellData.getValue().contactNumberProperty());
        emailColumn.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
        companyAddressColumn.setCellValueFactory(cellData -> cellData.getValue().companyAddressProperty());
        dpr_certColumn.setCellValueFactory(cellData -> cellData.getValue().dpr_certProperty());
        companyRegNoColumn.setCellValueFactory(cellData -> cellData.getValue().companyRegNoProperty());
        tax_idColumn.setCellValueFactory(cellData -> cellData.getValue().tax_idProperty());

    }

    @FXML
    private void searchContractor(ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
        try {
            Contractor cont = ContractorDAO.searchContractor(companyId.getText());
            populateAndShowContractor(cont);
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Error occured while getting contractor information from DB");
            throw e;
        }
    }

    @FXML
    private void searchContractors(ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
        try {
            ObservableList<Contractor> contData = ContractorDAO.searchContractors();
            populateContractors(contData);
        } catch (SQLException e) {
            System.out.println("Error occurred while getting Coontractors information from DB");
            throw e;
        }
    }

    @FXML
    private void populateContractors(ObservableList<Contractor> contData) throws ClassNotFoundException {
        contractorTable.setItems(contData);
    }

    @FXML
    private void insertContractor(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            ContractorDAO.insertCont(companyName.getText(), products_services.getText(), contactName.getText(), contactNumber.getText(), email.getText(),companyAddress.getText(), dpr_cert.getText(), companyRegNo.getText(), tax_id.getText());
            resultArea.setText("Contractor Inserted! \n");
        } catch (SQLException e) {
            resultArea.setText("Problem occured while inserting contractor " + e);
            throw e;
        }
    }

    @FXML
    private void populateContractor(Contractor cont) throws ClassNotFoundException {
        ObservableList<Contractor> contData = FXCollections.observableArrayList();
        contData.add(cont);
        contractorTable.setItems(contData);

    }

    @FXML
    private void setContInfoTextArea(Contractor cont) {
        resultArea.setText("Company Name: " + cont.getCompanyName());
    }

    @FXML
    private void populateAndShowContractor(Contractor cont) throws ClassNotFoundException {
        if (cont != null) {
            populateContractor(cont);
            setContInfoTextArea(cont);
        } else {
            resultArea.setText("This Contractor does not exist! \n");
        }
    }

}
