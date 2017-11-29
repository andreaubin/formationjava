package piano;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Synth extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);

		TilePane tilePane = new TilePane(5, 5);
		root.getChildren().add(tilePane);

		Map<KeyCode, SynthKey> synthKeyMap = new HashMap<>();
		
		String mp3File = "D:\\temp\\test.mp3";
		String mp3File2 = "D:\\temp\\test2.mp3";

		synthKeyMap.put(KeyCode.A, new SynthKey(scene, KeyCode.A, mp3File));
		tilePane.getChildren().add(synthKeyMap.get(KeyCode.A));

		synthKeyMap.put(KeyCode.Z, new SynthKey(scene, KeyCode.Z, mp3File2));
		tilePane.getChildren().add(synthKeyMap.get(KeyCode.Z));

		synthKeyMap.put(KeyCode.E, new SynthKey(scene, KeyCode.E, mp3File));
		tilePane.getChildren().add(synthKeyMap.get(KeyCode.E));

		synthKeyMap.put(KeyCode.R, new SynthKey(scene, KeyCode.R, mp3File));
		tilePane.getChildren().add(synthKeyMap.get(KeyCode.R));

		synthKeyMap.put(KeyCode.T, new SynthKey(scene, KeyCode.T, mp3File));
		tilePane.getChildren().add(synthKeyMap.get(KeyCode.T));

		synthKeyMap.put(KeyCode.Y, new SynthKey(scene, KeyCode.Y, mp3File));
		tilePane.getChildren().add(synthKeyMap.get(KeyCode.Y));


		scene.setOnKeyPressed(e -> {
			SynthKey synthKey = synthKeyMap.get(e.getCode());
			if(synthKey != null) {
				synthKey.fire(e);
			}
		});

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
