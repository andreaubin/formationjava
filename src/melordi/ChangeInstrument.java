package melordi;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class ChangeInstrument extends Parent {

	public ChangeInstrument(Instrument instrument) {
		
		final GridPane gridpane = new GridPane();

		// création des labels des 3 instruments
		final Label piano = new Label("Piano");
		final Label guitare = new Label("Guitare");
		final Label orgue = new Label("Orgue");

		// création des boutons radio
		final ToggleGroup groupe = new ToggleGroup();
		final RadioButton rbPiano = new RadioButton();
		final RadioButton rbGuitare = new RadioButton();
		final RadioButton rbOrgue = new RadioButton();
		rbPiano.setToggleGroup(groupe);
		rbGuitare.setToggleGroup(groupe);
		rbOrgue.setToggleGroup(groupe);
		rbPiano.setFocusTraversable(false);
		rbGuitare.setFocusTraversable(false);
		rbOrgue.setFocusTraversable(false);
		rbPiano.setSelected(true);
		
		groupe.selectedToggleProperty().addListener((obs, oldValue, newValue) -> {
			if(newValue.equals(rbPiano)) {
				//numéro MIDI du piano = 0
                instrument.setInstrument(0);
			} else if(newValue.equals(rbGuitare)) {
            	//numéro MIDI de la guitare = 26
            	instrument.setInstrument(26);
            } else {
            	//numéro MIDI de l'orgue = 16
            	instrument.setInstrument(16);
            }
		});
		
		//on ajoute les boutons radio au layout
        gridpane.add(rbPiano, 0, 0);
        gridpane.add(rbGuitare, 0, 1);
        gridpane.add(rbOrgue, 0, 2);
        gridpane.setHgap(20);

		// on ajoute nos labels à notre layout
		gridpane.add(piano, 1, 0);
		gridpane.add(guitare, 1, 1);
		gridpane.add(orgue, 1, 2);
		gridpane.setVgap(15);

		this.getChildren().add(gridpane);
	}

}
