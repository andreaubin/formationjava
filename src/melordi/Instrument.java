package melordi;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.beans.property.SimpleIntegerProperty;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Instrument {

	private SimpleIntegerProperty volume = new SimpleIntegerProperty(100);

	private Synthesizer synthetiseur;
	private MidiChannel canal;

	public Instrument() {

		try {
			// On récupère le synthétiseur, on l'ouvre et on obtient un canal
			synthetiseur = MidiSystem.getSynthesizer();
			synthetiseur.open();
		} catch (MidiUnavailableException ex) {
			Logger.getLogger(Instrument.class.getName()).log(Level.SEVERE, null, ex);
		}
		canal = synthetiseur.getChannels()[0];

		// On initialise l'instrument 0 (le piano) pour le canal
		canal.programChange(0);
	}

	// Joue la note dont le numéro est en paramètre
	public void noteOn(int note) {
		canal.noteOn(note, volume.get());
	}

	// Arrête de jouer la note dont le numéro est en paramètre
	public void noteOff(int note) {
		canal.noteOff(note);
	}

	// Set le type d'instrument dont le numéro MIDI est précisé en paramètre
	public void setInstrument(int instrument) {
		canal.programChange(instrument);
	}

	public SimpleIntegerProperty getVolume() {
		return volume;
	}

	public void setVolume(SimpleIntegerProperty volume) {
		this.volume = volume;
	}
	
	
}
