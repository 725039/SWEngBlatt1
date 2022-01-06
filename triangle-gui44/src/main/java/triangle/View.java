package triangle;
//Imports
import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.*;
import triangle.Controller;



public class View {
	//erstellen der einzelnen Elemente
	private Controller controller;
	private  TextField aTF;
	private  TextField bTF;
	private  TextField cTF;
	private  Label result; 
	private Parent view;
	
	
	public View() {
		// TODO Auto-generated constructor stub
		view = createView();
	}
	private VBox createView() {
		
		//Vbox also das Fenster erstellen
		VBox vBox = new VBox(15);
        vBox.setPrefWidth(300);
        vBox.setPrefHeight(250);
        vBox.setPadding(new Insets(15));
        
        //Grid pane erstellen wo an die einzelnen Elemente einordnet
        GridPane root = new GridPane();

        root.setVgap(20);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);
        
        //Textfelder erzeugen
        aTF = new TextField("1");
        bTF = new TextField("2");
        cTF = new TextField("3");
        
        //Label erzeugen
        result = new Label("");
        
        root.add(new Text("a"), 0, 0);
        root.add(aTF, 1, 0);
        root.add(new Text("b"), 0, 1);
        root.add(bTF, 1, 1);
        root.add(new Text("c"), 0, 2);
        root.add(cTF, 1, 2);
        root.add(result, 0, 3, 2, 1);
        vBox.getChildren().add(root);
        
        return vBox;
	}
	public TextField getATF() {
		return aTF;
	}
	public TextField getBTF() {
		return bTF;
	}
	public TextField getCTF() {
		return cTF;
	}
	public Parent getView() {
		return view;
	}
	public Label getResult() {
		return result;
	}
	public void setError() {
		result.setText("ungültig");
		System.out.println("ungültig");
	}
	public void setATF(int a) {
		aTF.setText(Integer.toString(a));
		
	}
	public void setBTF(int b) {
		aTF.setText(Integer.toString(b));
	}
	public void setCTF(int c) {
		aTF.setText(Integer.toString(c));
	}

}
