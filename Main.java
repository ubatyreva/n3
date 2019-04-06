package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
 
import javafx.geometry.Orientation;
  
public class Main extends Application{
     
    public static void main(String[] args) {
          
        Application.launch(args);
    }
      
    @Override
    public void start(Stage stage) throws Exception {
          
        Label lbl = new Label();
        Label lbl1 = new Label();
        lbl1.setText("Enter your name:");
        TextField textField = new TextField();
        textField.setPrefColumnCount(50);
        Button btn = new Button("Say Hello");
        	btn.setOnAction(event -> {if (textField.getText().equals("")) {
        		lbl.setText("Hello there");}
        	else {
        		lbl.setText("Hello " + textField.getText());}});
   
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10,lbl1, textField, btn, lbl);
        Scene scene = new Scene(root, 250, 200);
          
        stage.setScene(scene);
        stage.show();
}
}
