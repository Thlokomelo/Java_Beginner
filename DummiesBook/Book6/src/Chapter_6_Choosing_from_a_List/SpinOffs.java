/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_6_Choosing_from_a_List;

/*
Page: 704

This program uses a TreeView and lets the user select a show from the tree and displays
the title of the selected show in a label below the tree.

 */

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class SpinOffs extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //variables declared
    TreeView<String> tree;
    Label lblShowName;

    @Override
    public void start(Stage primaryStage) {
        TreeItem<String> root, andy, archie, //TreeItem variables are defined for the root node 
                happy, george, maude;              //and each show that has spinoff shows

        root = new TreeItem<String>("Spin Offs");  //The root node is created with the text Spin-Offs
        root.setExpanded(true);

        //creates lines create the nodes for The Andy Griffith Show and its spinoffs
        andy = makeShow(
                "The Andy Griffith Show", root);
        makeShow("Gomer Pyle, U.S.M.C.", andy);
        makeShow("Mayberry R.F.D", andy);

        //create the nodes for All in the Family and its spinoffs
        archie = makeShow("All in the Family", root);
        george = makeShow("The Jeffersons", archie);
        makeShow("Checking In", george);
        maude = makeShow("Maude", archie);
        makeShow("Good Times", maude);
        makeShow("Gloria", archie);
        makeShow("Archie Bunker's Place", archie);

        //create the nodes for Happy Days and its spinoffs
        happy = makeShow("Happy Days", root);
        makeShow("Mork and Mindy", happy);
        makeShow("Laverne and Shirley", happy);
        makeShow("Joanie Loves Chachi", happy);

        tree = new TreeView<String>(root);    //creates the TreeView control, specifying root as the root node for the tree.

        //hides the root node.
        tree.setShowRoot(false);

        tree.getSelectionModel().selectedItemProperty() //creates the event listener for the selected item property
                .addListener((v, oldValue, newValue)
                        -> tree_SelectionChanged(newValue));

        lblShowName = new Label();

        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(tree, lblShowName);    //creates the event listener for the selected item property

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("My Favorite Spin Offs");
        primaryStage.show();

    }

    public TreeItem<String> makeShow(String title,     //method creates a node from a string and adds the node to the node passed as the parent parameter

            TreeItem<String> parent) {
        TreeItem<String> show = new TreeItem<String>(title);
        show.setExpanded(true);
        parent.getChildren().add(show);
        return show;
    }

    public void tree_SelectionChanged(TreeItem<String> item) {  //method is called whenever the selected node changes.
        if (item != null) {
            lblShowName.setText(item.getValue());
        }
    }

}
