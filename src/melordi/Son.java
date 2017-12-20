package melordi;

import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;

public class Son extends Parent {
	
	private Slider slider;
	
	public Son(Clavier clavier) {
		
		slider = new Slider(0, 127, 60);
        slider.setOrientation(Orientation.VERTICAL);
        slider.setTranslateY(35);
        
        slider.valueProperty().addListener((obs, oldValue, newValue) -> {
        	clavier.requestFocus();
        });
        
        ProgressIndicator indicateur = new ProgressIndicator(0.0);
        indicateur.progressProperty().bind(slider.valueProperty().divide(127.0));
        
        this.getChildren().add(slider);
        this.getChildren().add(indicateur);
        this.setTranslateY(260);
        this.setTranslateX(60);
	}

	public Slider getSlider() {
		return slider;
	}

	public void setSlider(Slider slider) {
		this.slider = slider;
	}
	
}
