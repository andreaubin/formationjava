package melordi;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Melordi extends Application {

	public static void main(String[] args) {
		Application.launch(Melordi.class, args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Melordi");
		final Group root = new Group();
		final Scene scene = new Scene(root, 500, 500, Color.WHITE);

		primaryStage.setScene(scene);
		primaryStage.show();
		
		final Instrument instrument = new Instrument();
		
		final Clavier clavier = new Clavier(instrument);
        root.getChildren().add(clavier);
        
        final ChangeInstrument changeInstrument = new ChangeInstrument(instrument);
        root.getChildren().add(changeInstrument);
        
        final Son reglageSon = new Son(clavier);
        instrument.getVolume().bind(reglageSon.getSlider().valueProperty());
        root.getChildren().add(reglageSon);
        
        clavier.requestFocus();
	}

}
