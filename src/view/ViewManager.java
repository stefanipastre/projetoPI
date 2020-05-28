package view;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.stage.Stage;
import model.ProjectButton;

public class ViewManager extends GameViewManager{

	private static final int HEIGHT = 600;
	private static final int WIDTH = 800;
	private AnchorPane mainPane;
	public Scene mainScene;
	public Stage mainStage;
	
	public	ViewManager() {
		mainPane = new AnchorPane();
		mainScene = new Scene(mainPane, WIDTH, HEIGHT);
		mainStage = new Stage();
		mainStage.setScene(mainScene);
		createButton(300,400,"START");
		createBackground();
	}
	
	public Stage getMainStage() {
		return mainStage;
	}
	
	public	void createButton(int x, int y, String z){
		ProjectButton button = new ProjectButton(z);
		mainPane.getChildren().add(button);
		button.setLayoutX(x);
		button.setLayoutY(y);
		startButton(button);
	}
	
	
	public	void startButton(ProjectButton button){
		
		button.setOnAction((e -> {
		new GameViewManager();
		createStageChoose(mainStage);
		}
					));
	}
	
	private void createBackground() {
		Image backgroundImage = new Image("view/resources/menuprincipal.jpg",800,600,false,true);
		BackgroundImage background = new BackgroundImage(backgroundImage,null,null,BackgroundPosition.DEFAULT,null);
		mainPane.setBackground(new Background(background));
		
		
	}
	
	
}


