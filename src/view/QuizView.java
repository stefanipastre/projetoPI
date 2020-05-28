package view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class QuizView {
	
	private Stage quizStage;
	private BorderPane quizLayout;
	
	public void start(Stage quizStage) throws IOException {
		
		this.quizStage = quizStage;
		this.quizStage.setTitle("Pookemon Quiz");
		showQuizView();
		showGameQuiz();
	}
	

	public void showQuizView() throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/resources/QuizView.fxml"));
		quizLayout = loader.load();
		Scene scene = new Scene(quizLayout);
		quizStage.setScene(scene);
		quizStage.show();
	}
	
	
	private void showGameQuiz() throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/resources/GameQuiz.fxml"));
		BorderPane quizItens = loader.load();
		Scene scene = new Scene(quizItens);
		quizLayout.setCenter(quizItens);
	}
	
}
