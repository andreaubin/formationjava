package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Web extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		WebView browser = new WebView();
		WebEngine webEngine = browser.getEngine();
		webEngine.setJavaScriptEnabled(true);
		webEngine.load("http://www.google.fr"); // http://www.useragentstring.com
		Scene scene = new Scene(new BorderPane(browser));
		primaryStage.setScene(scene);
		primaryStage.show();
		
		System.out.println(webEngine.getUserAgent());
	}

	public static void main(String[] args) {
		launch(args);

	}

}
