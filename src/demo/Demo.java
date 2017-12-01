package demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Demo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.show();
		Group root = new Group();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		
		root.getChildren().add(new Button("mon bouton"));
	}

	public static void main(String[] args) {
		launch(args);
	}

}
