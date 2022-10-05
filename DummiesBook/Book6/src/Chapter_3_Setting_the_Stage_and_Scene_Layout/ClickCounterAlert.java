/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Setting_the_Stage_and_Scene_Layout;

/*
Page: 616

This program is an improved version of the ClickCounter program that was originally discussed
in Chapter 2. The original version of this program displayed a label and a
button, using the label to display a count of how many times the user has clicked
the button. This version of the program dispenses with the label and instead uses
the Alert class to display a message indicating how many times the user has
clicked the button.


Differences between the two programs:

» No label is defined in this program because a message box, not a label, is
  used to display the number of times the button has been clicked.

» In the buttonClick method of the Chapter 2 version, the label’s setText
  method was called to display the number of times the button has been
  clicked. In this version, an Alert box is used instead.
 */


import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounterAlert extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn;
    Label lbl;
    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        // Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());

        // Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);

        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);

        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
    }

    public void buttonClick() {
        iClickCount++;
        if (iClickCount == 1) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once.");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked "
                    + iClickCount + " times.");
            a.showAndWait();
        }
    }
}
