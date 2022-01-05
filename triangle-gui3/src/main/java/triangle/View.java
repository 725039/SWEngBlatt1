package triangle;



import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class View extends Application {
	TextField aText; 
	TextField bText;
	TextField cText;
	int a,b,c =0;
	
	/*
	TextField aTextField = new TextField("1");
    TextField bTextField = new TextField("2");
    TextField cTextField = new TextField("3");
    */
    Text result = new Text();
    Scanner scan = new Scanner(System.in);
	private Controller controller;

    public View() {
    	
    }
    
	@Override
    public void start(Stage primaryStage) {
        // Titel der Anwendung setzen, der als Überschrift des Hauptfensters angezeigt wird
        primaryStage.setTitle("Dreieck");

      aText = new TextField("1");
        
      bText = new TextField("2");
      cText = new TextField("3");
         
        // Drei Textfelder erzeugen
        /*TextField aTextField = new TextField("1");
        TextField bTextField = new TextField("2");
        TextField cTextField = new TextField("3");
       
*/
        // Wir verwenden eine GridPane für das Layout und ordnen die Label und Textfelder in diesem Raster an
        GridPane root = new GridPane();

        root.setVgap(20);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);

        root.add(new Text("a"), 0, 0);
        root.add(aText, 1,0);
        root.add(new Text("b"), 0, 1);
        root.add(bText, 1,1);
        root.add(new Text("c"), 0, 2);
        root.add(cText, 1,2);

        Text result = new Text();

        root.add(result, 0,3, 2, 1);
        
        
          a = Integer.parseInt(aText.getText());
              b = Integer.parseInt(bText.getText());
                c = Integer.parseInt(cText.getText());
               

        // Wir rufen den ChangeListener einmal initial auf, damit die Ausgabe am Anfang bereits stimmt
        //listener.changed(aTextField.textProperty(), aTextField.getText(), aTextField.getText());

        // Größe des Fensters setzen und Fenster anzeigen
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
	public int getFirstInt(){
		return a;
		//return Integer.parseInt(aText.getText());
	}
	public int getSecondInt() {
		return b;
		//return  Integer.parseInt(bText.getText());
	
	}
	public int getThirdInt() {
		return c;
		//return Integer.parseInt(cText.getText());
		
	}
	public void setResult(String r) {
		result.setText(r);
	}
	void addViewListender(ChangeListener<String> listener) {
		aText.textProperty().addListener(listener);
        bText.textProperty().addListener(listener);
        cText.textProperty().addListener(listener);
	}
	void displayErrorMessage(String errorMessage) {
		result.setText("ungültig");
	}
	public int getConsoleFirst() {
		return Integer.parseInt(scan.next());
		
	}
	public int getConsoleSecond() {
		return Integer.parseInt(scan.next());
	}
	public int getConsoleThird() {
		return Integer.parseInt(scan.next());
	}
	public void setInt(int a, int b, int c) {
		aText.setText(Integer.toString(a));
		bText.setText(Integer.toString(b));
		cText.setText(Integer.toString(c));
	}
	public void launchView(String [] args) {
		launch(args);
	}
	public void modelChanged(Controller controller){
        this.controller = controller;
    }
	
	


        
	
}
