package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

public class ProjectButton extends Button{
	private final String FONT_PATH = "src/model/resources/kenvector_future.ttf";
	private final String BUTTON_PRESSED_STYLE = "-fx-backgroud-color: transparent; -fx-background-image: url('/model/resources/yellow_button01.png');";
	private final String BUTTON_FREE_STYLE = "-fx-backgroud-color: transparent; -fx-background-image: url('/model/resources/yellow_button02.png');";

	public ProjectButton(String text) {
		setText(text);
		setButtonFont();
		setPrefWidth(190);
		setPrefHeight(49);
		setStyle(BUTTON_FREE_STYLE); //PADRÃO
		initializedButtonListeners();
	}
	
	
	private void setButtonFont() {
	try {
		setFont(Font.loadFont(new FileInputStream(FONT_PATH), 18));;
	} catch (FileNotFoundException e) {
		setFont(Font.font("Verdana",18));
		}
		
	}
	
	//métodos necessários porque o botão de pressed é 4 px menor que o released
	private void setButtonPressedStyle() {
		setStyle(BUTTON_PRESSED_STYLE);
		setPrefHeight(45);
		setLayoutY(getLayoutY() + 4);	
	}
	
	private void setButtonReleasedStyle() {
		setStyle(BUTTON_FREE_STYLE);
		setPrefHeight(49);
		setLayoutY(getLayoutY() - 4);	
	}
	
	//Setando os botões conforme alguem pressionar
	private void initializedButtonListeners() {
		
		setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if(event.getButton().equals(MouseButton.PRIMARY)) {
					setButtonPressedStyle();
				}
			}		
		});
		
		setOnMouseReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if(event.getButton().equals(MouseButton.PRIMARY)) {
					setButtonReleasedStyle();
				}
			}		
		});
		
		
		setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				setEffect(new DropShadow());
			}		
		});
		
		
		setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				setEffect(null);
			}		
		});
		
	}
	
	
	
}
