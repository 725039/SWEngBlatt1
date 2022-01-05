package triangle;
import triangle.Controller;
import triangle.View;
import java.util.ArrayList;
import java.util.List;

public class MVC {

	public MVC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View theView = new View(args);
		Model theModel = new Model();
		Controller theController = new Controller(theView, theModel);
		//theView.launchView(args);

	}

}
