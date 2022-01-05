package triangle;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import triangle.View;
public class Controller {

private View theView;
private Model theModel;
	public Controller(View theView, Model theModel) {
		this.theView= theView;
		this.theModel = theModel;
		
		this.theView.addViewListender(new ViewListender());
		
	}
	class ViewListender implements ChangeListener<String>{

		@Override
		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			int a,b,c =3;
			
			try {
				if (theView.scan.hasNext() ==true) {
					a = theView.getConsoleFirst();
					b = theView.getConsoleSecond();
					c = theView.getConsoleThird();
					theView.setInt(a, b, c);
					theModel.testInt(a,b,c);
					theView.setResult(theModel.getResult());
					System.out.println(theModel.getResult());
					
				}
				else {
					
				a = theView.getFirstInt();
				b = theView.getSecondInt();
				c = theView.getThirdInt();
				System.out.println(a+b+c);
				
				theModel.testInt(a,b,c); 
				theView.setResult(theModel.getResult());
				System.out.println(theModel.getResult());
				}
			}
			catch(NumberFormatException e) {
				theView.displayErrorMessage("ungültig");
				System.out.print("ungültig");
			}
		}
			/* try {
		            int a = Integer.parseInt(aTextField.getText());
		            int b = Integer.parseInt(bTextField.getText());
		            int c = Integer.parseInt(cTextField.getText());
		            if (a == b && b == c) {
		                result.setText("gleichseitig");
		            } else if (a == b || a == c || b == c) {
		                result.setText("gleichschenklig");
		            } else {
		                result.setText("ungleichseitig");
		            }
		        } catch (NumberFormatException e) {
		            result.setText("ungültig");
		        }
			
		*/
	}
	
	
}
