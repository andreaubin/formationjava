package melordi;

import javafx.scene.Parent;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Touche extends Parent {

	public KeyCode lettre;
	private int positionX = 0;
	private int positionY = 0;
	private int note = 0;
	private Instrument instru;

	private Rectangle fondTouche;
	private Text lettreTouche;

	public Touche(KeyCode lettre, int posX, int posY, int note, Instrument instru) {
		this.lettre = lettre;
		this.positionX = posX;
		this.positionY = posY;
		this.note = note;
		this.instru = instru;

		createFondTouche();
		
		// ajout du rectangle de fond de la touche
		this.getChildren().add(fondTouche);

		createLettreTouche();
		// ajout de la lettre de la touche
		this.getChildren().add(lettreTouche);
		
		// évènements
		this.setOnMouseEntered(me -> {
			fondTouche.setFill(Color.GREY);
		});
		
		this.setOnMouseExited(me -> {
			fondTouche.setFill(Color.WHITE);
		});
		
		this.setOnMousePressed(mp -> {
			appuyer();
		});
		
		this.setOnMouseReleased(mr -> {
			relacher();
		});

		// positionnement de la touche sur le clavier
		this.setTranslateX(positionX);
		this.setTranslateY(positionY);
	}
	
	public void appuyer(){
        fondTouche.setFill(Color.DARKGREY);
        instru.noteOn(note);
        this.setTranslateY(positionY+2);
    }
    
    public void relacher(){
        fondTouche.setFill(Color.WHITE);
        instru.noteOff(note);
        this.setTranslateY(positionY);
    }
	
    private void createFondTouche() {
    	fondTouche = new Rectangle(75, 75, Color.WHITE);
		fondTouche.setArcHeight(10);
		fondTouche.setArcWidth(10);
    }
    
    private void createLettreTouche() {
    	lettreTouche = new Text(lettre.getName());
		lettreTouche.setFont(new Font(25));
		lettreTouche.setFill(Color.GREY);
		lettreTouche.setX(25);
		lettreTouche.setY(45);
    }
	
}
