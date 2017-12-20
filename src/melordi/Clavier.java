package melordi;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.Parent;
import javafx.scene.effect.Reflection;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;

public class Clavier extends Parent {
	
	Map<KeyCode, Touche> touches;
	Instrument instrument;

	public Clavier(Instrument instrument) {
		this.instrument = instrument;
		Rectangle fondClavier = createRectangle();
		
		Integer tolo = 50;

		createReflection(fondClavier);
		
		this.touches = createTouches();

		this.setTranslateX(50);
		this.setTranslateY(250);
		this.getChildren().add(fondClavier);
		
		// ajout des touches au panel du clavier
		touches.values().forEach(t -> {
			this.getChildren().add(t);
		});
		
		// évènements
		this.setOnKeyPressed(kp -> {
			touches.get(kp.getCode()).appuyer();
			
		});
		this.setOnKeyReleased(kr -> {
			touches.get(kr.getCode()).relacher();
		});
	}

	private Rectangle createRectangle() {
		Rectangle fondClavier = new Rectangle();
		fondClavier.setWidth(400);
		fondClavier.setHeight(200);
		fondClavier.setArcWidth(30);
		fondClavier.setArcHeight(30);
		fondClavier.setFill( // on remplie notre rectangle avec un dégradé
				new LinearGradient(0f, 0f, 0f, 1f, true, CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.web("#333333")),
						new Stop(1, Color.web("#000000")) }));
		return fondClavier;
	}

	private void createReflection(Rectangle fondClavier) {
		// on applique un effet de réflection
		Reflection reflection = new Reflection();
		reflection.setFraction(0.25);
		reflection.setBottomOpacity(0);
		reflection.setTopOpacity(0.5);
		fondClavier.setEffect(reflection);
	}
	
	private Map<KeyCode, Touche> createTouches() {
		Map<KeyCode, Touche> map = new HashMap<KeyCode, Touche>();
		map.put(KeyCode.U, new Touche(KeyCode.U,50,20,60, instrument));
		map.put(KeyCode.I, new Touche(KeyCode.I,128,20,62, instrument));
		map.put(KeyCode.O, new Touche(KeyCode.O,206,20,64, instrument));
		map.put(KeyCode.P, new Touche(KeyCode.P,284,20,65, instrument));
		map.put(KeyCode.J, new Touche(KeyCode.J,75,98,67, instrument));
		map.put(KeyCode.K, new Touche(KeyCode.K,153,98,69, instrument));
		map.put(KeyCode.L, new Touche(KeyCode.L,231,98,71, instrument));
		map.put(KeyCode.M, new Touche(KeyCode.M,309,98,72, instrument));
		
		return map;
	}

}
