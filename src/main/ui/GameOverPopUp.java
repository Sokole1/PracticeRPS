package main.ui;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GameOverPopUp {

    static boolean answer;

    public static boolean display(String winner) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("GG!");

        Label label = new Label();
        label.setText(winner + " Wins!");
        label.setAlignment(Pos.CENTER);

        Label label2 = new Label("Would you like to play again?");
        label2.setAlignment(Pos.CENTER);

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(yesButton, noButton);
        hBox.setAlignment(Pos.CENTER);

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5, 5, 5, 5));

        GridPane.setHalignment(label, HPos.CENTER);
        GridPane.setHalignment(yesButton, HPos.CENTER);

        grid.addRow(0, label);
        grid.addRow(1, label2);
        grid.addRow(2, hBox);

        grid.setAlignment(Pos.CENTER);

        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
