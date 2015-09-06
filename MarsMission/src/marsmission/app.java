package marsmission;

import com.sun.glass.ui.Application;
import javafx.application.*;
import javafx.stage.Stage;

public class app {

	public abstract class App extends Application {
		
		public abstract void main(String[]args);
		
		
	}
	
	public void start(Stage primaryStage) throws Exception {
	
		controller controller = new controller();
		view view = new view(primaryStage, controller);
	}

}
