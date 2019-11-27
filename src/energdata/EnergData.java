/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata;

import energdata.controller.RootLayoutViewController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author ALUCK
 */
public class EnergData extends Application {
    
    private Stage primaryStage;
    private BorderPane rootLayout;
    
    @Override
    public void start(Stage primaryStage) {
       this.primaryStage = primaryStage;
    
       this.primaryStage.setTitle("Contractors Database");
       
       initRootLayout();
       
       showContractorsView();
    }
    
     
    
    public void initRootLayout() {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(EnergData.class.getResource("views/RootLayoutView.fxml"));
            rootLayout = (BorderPane) loader.load();
            
         
                        
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            
            primaryStage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
        }
    
    public void showContractorsView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(EnergData.class.getResource("views/ContractorsDataView.fxml"));
            AnchorPane contractorOperationView = (AnchorPane) loader.load();
            
            rootLayout.setCenter(contractorOperationView);
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
