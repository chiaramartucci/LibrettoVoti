package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Libretto model;
	
	@FXML
    private DatePicker pickerEsame; 
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEsame;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea result;

    @FXML
    void handleInserisci(ActionEvent event) {
    	// leggi e controlla i dati 
    	String nomeEsame = txtEsame.getText();
    	String votoEsame = txtVoto.getText();
    	int votoInt=0;
    	
    	try {
    		votoInt = Integer.parseInt(votoEsame);
    	} catch (NumberFormatException nfe){
    		result.setText("ERRORE: il voto deve essere numerico");
    		return ;
    	}
    	
    	if(votoInt<18 || votoInt>30) {
    		result.setText("ERRORE: il voto deve essere compreso tra 18 e 30");
    		return ;
    	}
    
    	
//    	String dataEsame = txtData.getText();
//    	LocalDate data;
//    	try{
//    		data = LocalDate.parse(dataEsame);
//    	} catch (DateTimeParseException dtpe){
//    		result.setText("ERRORE: la data non e' nel formato corretto");
//    		return ;
//    	}
    	
    	LocalDate data = pickerEsame.getValue();
    	
    	if(data==null) {
    		result.setText("ERRORE: la data è errata o mancante");
    		return ;  
    	}
    	
    	// esegui l'azione
    	Voto voto = new Voto (nomeEsame, votoInt, data);
    	model.add(voto);
    	
    	// aggiorna i risultati (nella View)
    	result.setText(model.toString());
    	txtEsame.clear();
//    	txtData.clear();
    	pickerEsame.setValue(null);
    	txtVoto.clear();
    }
    
    public void setModel(Libretto model) {
    	this.model=model;
    }

    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'Scene.fxml'.";
        assert pickerEsame != null : "fx:id=\"pickerEsame\" was not injected: check your FXML file 'Scene.fxml'.";
    }
}

