package triangle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import triangle.Controller;
import triangle.View;

public class Main extends Application {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		View view = new View();

        Controller controller = new Controller(view);

        primaryStage.setTitle("TriangleCalculator");
        primaryStage.setScene(new Scene(view.getView()));
        primaryStage.show();
	}

}
