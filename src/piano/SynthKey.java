package piano;

import java.io.File;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;

public class SynthKey extends Button {

	private KeyCode keyCode;
	private Scene scene;

	private File file;
	private Media media;
	private MediaPlayer player;


	public SynthKey(Scene scene , KeyCode keyCode, String mp3File) {
		super(keyCode.toString());
		this.keyCode = keyCode;
		this.scene = scene;
		file = new File(mp3File);
		media = new Media(file.toURI().toString());
		player = new MediaPlayer(media);
		init();
	}

	private void init() {
		setOnAction(e -> {
			if(Status.PLAYING.equals(player.getStatus())) {
				player.stop();
			}
			player.play();
			e.consume();
		});

//		player.cycleCountProperty().addListener((ChangeListener<Number>) (observable, oldValue, newValue) -> {
//			if(newValue.intValue() > 1) {
//				setStyle("-fx-background-color:red;");
//			} else {
//				setStyle("");
//			}
//		});
//
//		setOnContextMenuRequested(e -> {
//			FileChooser fileChooser = new FileChooser();
//			file = fileChooser.showOpenDialog(scene.getWindow());
//			if(file != null) {
//				media = new Media(file.toURI().toString());
//				player = new MediaPlayer(media);
//				player.cycleCountProperty().addListener((ChangeListener<Number>) (observable, oldValue, newValue) -> {
//					if(newValue.intValue() > 1) {
//						setStyle("-fx-background-color:red;");
//					} else {
//						setStyle("");
//					}
//				});
//			}
//			setStyle("");
//
//		});
	}

	public void fire(KeyEvent e) {
//		if(e.isShiftDown()) {
//			player.setCycleCount(Integer.MAX_VALUE);
//		} else {
			player.setCycleCount(1);
//		}
		fire();
	}


}
