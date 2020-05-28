package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.stage.Stage;
import model.POKEMON;
import model.ProjectButton;

public class GameViewManager {

	
	private AnchorPane gamePane;
	private Scene gameScene;
	private Stage gameStage;
	
	private POKEMON escolhido;
	public QuizView next;
	
	
	private static final int GAME_WIDTH = 800;
	private static final int GAME_HEIGHT = 600;
	private static final int MENU_BUTTON_START_X = 25;
	private static final int MENU_BUTTON_START_Y = 500;
	
	List<ProjectButton>menuButtons;
	
	private Stage menuStage;
	
	
	public GameViewManager() {
		menuButtons = new ArrayList<>();
		initializeStage();
		createdKeyListeners();
		createBackground();
		createButtons();
		
		
	}
	
	private void createdKeyListeners() {

		//gameScene.setOnKeyPressed(arg0);
		
	}

	private void initializeStage() {
		
		gamePane = new AnchorPane();
		gameScene = new Scene(gamePane,GAME_WIDTH,GAME_HEIGHT);
		gameStage = new Stage();
		gameStage.setScene(gameScene);
	}
	
public void createStageChoose(Stage menuStage) {
		this.menuStage = menuStage;
		this.menuStage.hide();
		gameStage.show();
		
	}

private void createBackground() {
	Image backgroundImage = new Image("view/resources/escolherpersonagem.png",800,600,false,true);
	BackgroundImage background = new BackgroundImage(backgroundImage,null,null,BackgroundPosition.DEFAULT,null);
	gamePane.setBackground(new Background(background));
	
	
}


private void addMenuButton(ProjectButton button) {
	
	button.setLayoutX(MENU_BUTTON_START_X + menuButtons.size() * 280);
	button.setLayoutY(MENU_BUTTON_START_Y);
	menuButtons.add(button);
	gamePane.getChildren().add(button);
}

	private void createButtons() {
		createBulbasaurButton();
		createCharmanderButton();
		createSquirtleButton(); 
	}
	

	
	// criar uma classe como choosenPokemon e extender na outra aba do quiz
	
	public void createBulbasaurButton() {
		ProjectButton bulbasaur = new ProjectButton("BULBASAURO");
		addMenuButton(bulbasaur);	
		
	bulbasaur.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
			
				//	next.showQuizView();
				System.out.println("teste");
				
			}
	});
		
		}
		
		
		
	public void createCharmanderButton() {
		ProjectButton charmander = new ProjectButton("CHARMANDER");
		addMenuButton(charmander);			
	}
	
	public void createSquirtleButton() {
		ProjectButton squirtle = new ProjectButton("SQUIRTLE");
		addMenuButton(squirtle);			
	}
}




