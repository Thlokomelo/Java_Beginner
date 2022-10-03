/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Hello_JavaFX;

/*
Page: 566

This program shows the user interface for a very simple JavaFX program that includes
just a single button. Initially, the text of this button says Click me please! When
you click it, the text of the button changes to You clicked me! If you click the
button again, the text changes back to Click me please! Thereafter, each time
you click the button, the text cycles between Click me please! and You clicked
me! To quit the program, simply click the Close button (the X at the upper-right
corner.)

 */

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;                          
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickMe extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    Button btn;
    
    @Override public void start(Stage primaryStage)
    {
        // Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());

        // Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        
        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);

        // Finalize and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Me App");
        primaryStage.show();
    }
    
    public void buttonClick()
    {
        if (btn.getText() == "Click me please!")
        {
            btn.setText("You clicked me!");
         }
      else
        {
            btn.setText("Click me please!");
        }
    }
}

