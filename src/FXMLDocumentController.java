/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author java
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Button buttonPares;
    @FXML
    private Button buttonImpares;
    @FXML
    private TextArea textAreaPares;
    @FXML
    private TextArea textAreaImpares;
    
    MinhaThreadPares minhaThreadPares;
    MinhaThreadImpares minhaThreadImpares;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    public void handleButtonPares() {
        minhaThreadPares = new MinhaThreadPares(textAreaPares);
        Thread t1 = new Thread(minhaThreadPares);
        t1.start();
    }

    @FXML
    public void handleButtonImpares() {
        minhaThreadImpares = new MinhaThreadImpares(textAreaImpares);
        Thread t2 = new Thread(minhaThreadImpares);
        t2.start();
    }

}
