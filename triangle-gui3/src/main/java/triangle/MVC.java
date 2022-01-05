package triangle;
import triangle.Controller;
import triangle.View;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MVC{

	public MVC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View theView = new View();
		theView.launchView(args);
		Model theModel = new Model();
		Controller theController = new Controller(theView, theModel);
		//theView.launchView(args);
		

	}

}
