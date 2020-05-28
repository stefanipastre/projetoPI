package view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GameQuiz {
	
	
    private Stage quizStage;
    private BorderPane quizPane;

 
    public void showGameQuiz() throws IOException {
            // Carrega o root layout do arquivo fxml.
    	
  
    		this.quizStage.setTitle("Pookemon QUIZ");
        
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GameQuiz.class.getResource("view/resources/GameQuiz.fxml"));
            BorderPane quizPane = loader.load();
            quizPane.setCenter(quizPane);
            
            // Mostra a scene (cena) contendo o root layout.
            Scene scene = new Scene(quizPane);
            quizStage.setScene(scene);
            quizStage.show();
       
    }
    
    
    

}
