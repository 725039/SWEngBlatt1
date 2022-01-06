package triangle;

//importieren der Imports
import triangle.View;
import triangle.Model;
import javafx.beans.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import java.util.Scanner;


public class Controller {
	private View view;
	private Model model;
	//ChangeListener<String> listener;
	Scanner scan = new Scanner(System.in);

	public Controller(View view) {
		this.view = view;
		
		this.model= new Model(this);
		assignChangeListener();
		changeListenerInitialize();
	}
	/*public void startInput() {
		view.setATF(model.getFirstConsoleInput());
		System.out.println(view.getATF().getText());
		
	}*/

private void changeListenerInitialize() {
		// TODO Auto-generated method stub
		view.getResult().setText(model.testInt());
	}


private void assignChangeListener() {
		// TODO Auto-generated method stub
		view.getATF().textProperty().addListener(listener);
		view.getBTF().textProperty().addListener(listener);
		view.getCTF().textProperty().addListener(listener);
	}

ChangeListener<String> listener = (ObservableValue, oldValue, newValue)->{
	try {
		/*
		if(scan.hasNext()==true) {
			model.setA(model.getFirstConsoleInput());
			model.setB(model.getSecondConsoleInput());
			model.setC(model.getThirdConsoleInput());
			view.getResult().setText(model.testInt());
		}
		*/
		
		//view.setATF(model.getFirstConsoleInput());
		
		
        //Längen setzen
        model.setA(Integer.parseInt(view.getATF().getText()));
        model.setB(Integer.parseInt(view.getBTF().getText()));
        model.setC(Integer.parseInt(view.getCTF().getText()));
        
        //Gibt den Input des Users aus
        System.out.println(view.getATF().getText());
        System.out.println(view.getBTF().getText());
        System.out.println(view.getCTF().getText());
        

        //Das Ergebnis anzeigen
        view.getResult().setText(model.testInt());
       
        //Gibt das Ergebiss aus
        System.out.println(model.testInt());

    } catch (NumberFormatException e) {
        view.setError();
    }
};


}
