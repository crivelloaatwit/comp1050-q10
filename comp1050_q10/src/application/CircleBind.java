package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleBind extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		Pane pane = new Pane();
		
		final Circle c = new Circle();
		c.setCenterX(100);
		c.setCenterY(100);
		c.setRadius(50);
		c.setStroke(Color.BLACK);
		c.setFill(Color.WHITE);
		
		c.centerXProperty().bind(pane.widthProperty().divide(2));
		c.centerYProperty().bind(pane.heightProperty().divide(2));
		
		pane.getChildren().add(c);
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Circle!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		
	public static void main(String[] args) 
	{
		launch(args);
	}
}

