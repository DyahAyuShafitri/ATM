/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatmjavafx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Dyah Ayu Shafitri
 */
public class FXMLDocumentController implements Initializable {

    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
     @FXML
    private JFXButton btn1;

    @FXML
    private JFXButton btn2;

    @FXML
    private JFXButton btn3;

    @FXML
    private JFXButton btn4;

    @FXML
    private JFXButton btn5;

    @FXML
    private JFXButton btn6;

    @FXML
    private JFXButton btn7;

    @FXML
    private JFXButton btn8;

    @FXML
    private JFXButton btn9;

    @FXML
    private JFXButton btnc;

    @FXML
    private JFXButton btn0;

    @FXML
    private JFXButton btnok;

    @FXML
    private JFXPasswordField editpin;

    @FXML
    void editpin(ActionEvent event) {

    }

    @FXML
    void tkn0(ActionEvent event) {

    }

    @FXML
    void tkn1(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    @FXML
    void tkn2(ActionEvent event) {
        pin += "2";
        editpin.setText(pin);
    }

    @FXML
    void tkn3(ActionEvent event) {
        pin += "3";
        editpin.setText(pin);
    }

    @FXML
    void tkn4(ActionEvent event) {
        pin += "4";
        editpin.setText(pin);
    }

    @FXML
    void tkn5(ActionEvent event) {
        pin += "5";
        editpin.setText(pin);
    }

    @FXML
    void tkn6(ActionEvent event) {
        pin += "6";
        editpin.setText(pin);
    }

    @FXML
    void tkn7(ActionEvent event) {
        pin += "7";
        editpin.setText(pin);
    }

    @FXML
    void tkn8(ActionEvent event) {
        pin += "8";
        editpin.setText(pin);
    }

    @FXML
    void tkn9(ActionEvent event) {
        pin += "9";
        editpin.setText(pin);
    }

    @FXML
    void tknc(ActionEvent event) {
        pin += "";
        editpin.setText(pin);
    }

    @FXML
    void tknok(ActionEvent event) {
        if(pin.equals(PIN)){
            try{
            ((Node) (event.getSource())).getScene().getWindow().hide();
            
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),830,450);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("MenuAwal");
            stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new window." + e);
            }
           }else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa "+kesempatan
            + " kesempatan lagi!");
            editpin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    /**
     * Initializes the controller class.
     */
   
    