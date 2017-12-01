package demo;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Chemin extends Application { 
	  
    @Override 
    public void start(final Stage primaryStage) { 
        final Rectangle rectangle = new Rectangle(0, 0, 50, 25); 
        rectangle.setFill(Color.RED); 
        
        ImageView licorne = new ImageView(new Image(Chemin.class.getResourceAsStream("licorne.png")));
        licorne.setFitHeight(50);
        licorne.setPreserveRatio(true);
        
        final Path path = new Path( 
                new MoveTo(50, 50), 
                new LineTo(100, 50), 
                new LineTo(150, 150), 
                new QuadCurveTo(150, 100, 250, 200), 
                new CubicCurveTo(0, 250, 400, 0, 300, 250)); 
        final Pane root = new Pane(path, licorne); 
        final Scene scene = new Scene(root, 350, 300); 
        primaryStage.setTitle("Test d'animation le long d'un chemin"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
        final PathTransition pathAnimation = new PathTransition(Duration.seconds(10), path, licorne); 
        pathAnimation.setCycleCount(PathTransition.INDEFINITE); 
        pathAnimation.setInterpolator(Interpolator.LINEAR); 
        pathAnimation.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathAnimation.setRate(2);
        pathAnimation.setAutoReverse(true);
        pathAnimation.play();
        
        pathAnimation.cycleCountProperty().addListener((ChangeListener<Number>) (observable, oldValue, newValue) -> {
			if(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT.equals(pathAnimation.getOrientation())){
				pathAnimation.setOrientation(PathTransition.OrientationType.NONE);
				
			} else{
				pathAnimation.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			}
		});
        
    } 
  
    public static void main(String[] args) { 
        launch(args); 
    } 
}