import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	
	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	HBox feedback_box , buttons_box;
	Button hello , howdy , chinese , clear , exit;
	Label Feedback;
	TextField textfield;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager scope;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		hello = new Button("Hello");
		howdy = new Button("Howdy");
		chinese = new Button("Chinese");
		clear = new Button("Clear");
		exit = new Button("Exit");
		
		Feedback = new Label("Feedback");
		textfield = new TextField();
		
		feedback_box = new HBox();
		buttons_box = new HBox();
		
		Insets inset = new Insets(10);
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		scope = new DataManager();
		ButtonHandler handler = new ButtonHandler();
		hello.setOnAction(handler);
		howdy.setOnAction(handler);
		chinese.setOnAction(handler);
		clear.setOnAction(handler);
		exit.setOnAction(handler);
		
		HBox.setMargin(hello , inset);
		HBox.setMargin(howdy , inset);
		HBox.setMargin(chinese , inset);
		HBox.setMargin(clear , inset);
		HBox.setMargin(exit , inset);
		
		buttons_box.setAlignment(Pos.CENTER);
		feedback_box.setAlignment(Pos.CENTER);
		 
		
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		feedback_box.getChildren().addAll(Feedback , textfield);
		buttons_box.getChildren().addAll(hello , howdy , chinese , clear , exit);
		this.getChildren().addAll(feedback_box , buttons_box);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if(event.getTarget() == hello){
				textfield.setText(scope.getHello());
			}
			else if(event.getTarget() == howdy) {
				textfield.setText(scope.getHowdy());
			}
			else if(event.getTarget() == chinese) {
				textfield.setText(scope.getChinese());
			}
			else if(event.getTarget() == clear) {
				textfield.setText("");
			}
			else if(event.getTarget() == exit) {
				System.exit(0);
			}
			
			
		}
		
	}
}