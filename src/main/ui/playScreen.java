package main.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.model.Computer;
import main.model.Game;
import main.model.Player;
import main.model.RPSEnum;

public class playScreen extends Application {

    Stage primaryStage;
    Label playerScore, computerScore;
    Game game;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        setUpGame();

        this.primaryStage = primaryStage;

        GridPane RPSButtons = new GridPane();
        RPSButtons.setAlignment(Pos.CENTER);
        RPSButtons.setVgap(20);
        RPSButtons.setHgap(25);

        Button rock = new Button("Rock");
        Button paper = new Button("Paper");
        Button scissor = new Button("Scissor");


        rock.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                //  Auto-generated method stub
                System.out.println("rock");
                handlePlay(RPSEnum.ROCK);
            }
        });
        paper.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                //  Auto-generated method stub
                System.out.println("paper");
                handlePlay(RPSEnum.PAPER);
            }
        });
        scissor.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                //  Auto-generated method stub
                System.out.println("scissor");
                handlePlay(RPSEnum.SCISSORS);
            }
        });

        RPSButtons.addRow(0, rock, paper, scissor);

        HBox scores = new HBox(50);
        scores.setAlignment(Pos.CENTER);

        playerScore = new Label("Player: " + game.getPlayer().getScore());
        computerScore = new Label("Computer: " + game.getComputer().getScore());

        scores.getChildren().addAll(playerScore, computerScore);

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(scores, RPSButtons);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void handlePlay(RPSEnum choice) {
        Player winner = game.play(choice);
        if (winner != null) {
            boolean playAgain = GameOverPopUp.display(winner.getName());
            if (playAgain) {
                setUpGame();
                primaryStage.getScene().getWindow().setWidth(primaryStage.getScene().getWidth() + 0.001);
            } else {
                primaryStage.close();
            }
        } else {
            playerScore = new Label("Player: " + game.getPlayer().getScore());
            computerScore = new Label("Computer: " + game.getComputer().getScore());
            System.out.println(game);
            primaryStage.getScene().getWindow().setWidth(primaryStage.getScene().getWidth() + 0.001);
        }
    }

    // MODIFIES: this
    // EFFECTS: Start new game with 2 players with initial score 0
    private void setUpGame() {
        Player player1 = new Player("You");
        Computer computer = new Computer("CPU", new RPSEnum[]{RPSEnum.ROCK, RPSEnum.PAPER, RPSEnum.SCISSORS});
        game = new Game(player1, computer);
    }

}