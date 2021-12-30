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

public class
playScreen extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        GridPane RPSButtons = new GridPane();
        RPSButtons.setAlignment(Pos.CENTER);
        RPSButtons.setVgap(20);
        RPSButtons.setHgap(25);

        Button rock=new Button ("Rock");
        Button paper = new Button("Paper");
        Button scissor = new Button("Scissor");


        rock.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                //  Auto-generated method stub
                System.out.println("rock");
            }
        });
        paper.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                //  Auto-generated method stub
                System.out.println("paper");
            }
        });
        scissor.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                //  Auto-generated method stub
                System.out.println("scissor");
            }
        });

        RPSButtons.addRow(0, rock, paper, scissor);

        HBox scores = new HBox(50);
        scores.setAlignment(Pos.CENTER);

        Label PlayerScore = new Label("Player: ");
        Label ComputerScore = new Label("Computer: ");

        scores.getChildren().addAll(PlayerScore, ComputerScore);

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(scores, RPSButtons);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

}