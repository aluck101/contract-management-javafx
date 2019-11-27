/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import energdata.EnergData;

/**
 * FXML Controller class
 *
 * @author ALUCK
 */
public class RootLayoutViewController {

    /**
     * Initializes the controller class.
     */
   public void handleExit(ActionEvent actionEvent) {
       System.exit(0);
      
   }
    
   public void handleHelp(ActionEvent actionEvent) {
       Alert alert = new Alert (Alert.AlertType.INFORMATION);
       alert.setTitle("Program information");
       alert.setHeaderText("Database");
       alert.setContentText("You can search, delete, update, insert a new contractor with this program.");
       alert.show();
   }
}
