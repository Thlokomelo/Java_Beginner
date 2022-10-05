/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Setting_the_Stage_and_Scene_Layout;

/*
Page: 610

In this program: 

» When the SceneSwitcher program is first run, it displays the ClickCounter
  scene as shown on the left side of the figure.

» When the user clicks the Switch Scene button, the scene switches to the
  AddSubtract scene, as shown in the right side of the figure.

 */

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class SceneSwitcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // class fields for Click-Counter scene	
    int iClickCount = 0;                      //used to count the number of times the user has clicked the Click Me! Button
    Label lblClicks;                          //used to display the count of how many times the Click Me! button has been clicked
    Button btnClickMe;                        //Button
    Button btnSwitchToScene2;                 //used to switch to the Add-Subtract scene
    Scene scene1;                             //used to reference the Click Counter scene.

    // class fields for Add-Subtract scene	
    int iCounter = 0;                         //used to count the number of times the user has clicked the Click Me! Button
    Label lblCounter;                         //displays the counter                  
    Button btnAdd;                            //button
    Button btnSubtract;                       //button
    Button btnSwitchToScene1;                 //used to switch to the Click-Counter scene
    Scene scene2;                             //used to reference the the Add-Subtract scene.

    // class field for stage
    Stage stage;                             //holds the reference to the primary stage

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;                //sets stage class field to reference the primary stage

        // Build the Click-Counter scene	
        lblClicks = new Label();
        lblClicks.setText("You have not clicked the button.");

        btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(
                e -> btnClickMe_Click());

        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(
                e -> btnSwitchToScene2_Click());

        //creates a VBox layout pane which lays out its controls in a vertical stack 
        //adds the label and buttons to the pane. 
        VBox pane1 = new VBox(10);
        pane1.getChildren().addAll(lblClicks, btnClickMe,
                btnSwitchToScene2);

        scene1 = new Scene(pane1, 250, 150);   //creates the scene using the VBox pane as its root.

        // Build the Add-Subtract scene	
        lblCounter = new Label();
        lblCounter.setText(Integer.toString(iCounter));

        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(
                e -> btnAdd_Click());

        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(
                e -> btnSubtract_Click());

        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(
                e -> btnSwitchToScene1_Click());

        HBox pane2 = new HBox(10);
        pane2.getChildren().addAll(lblCounter, btnAdd,
                btnSubtract, btnSwitchToScene2);

        scene2 = new Scene(pane2, 300, 75);                   //creates the scene using the HBox pane as its root

        // Set the stage with scene 1 and show the stage	
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }

    // Event handlers for scene 1	
    public void btnClickMe_Click() {
        iClickCount++;                        
        if (iClickCount == 1) {
            lblClicks.setText("You have clicked once.");
        } else {
            lblClicks.setText("You have clicked "
                    + iClickCount + " times.");
        }
    }

    private void btnSwitchToScene2_Click() {
        stage.setScene(scene2);
    }

    // Event handlers for scene 2	
    private void btnAdd_Click() {
        iCounter++;
        lblCounter.setText(Integer.toString(iCounter));
    }

    private void btnSubtract_Click() {
        iCounter--;
        lblCounter.setText(Integer.toString(iCounter));
    }

    private void btnSwitchToScene1_Click() {
        stage.setScene(scene1);
    }

}
