package M4S2A1996K;
import javafx.stage.Stage;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class mainclass extends Application{
	Pane pane = new Pane();
	BorderPane bpane = new BorderPane();
	GridPane gp = new GridPane();
	
	Button b1 = new Button("Calculate");
	Button bexit = new Button("  E X I T   ");
	
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	TextField t4 = new TextField();
	TextField t5 = new TextField();
	Label l1 = new Label("Completed Credit till last Semister:   ");
	Label l2 = new Label("CGPA till last Semister:     ");
	Label l3 = new Label("Completed Credit in this Semister:   ");
	Label l4 = new Label("CGPA in this Semister:");
	Label l5 = new Label("Your Current CGPA is: ");
	Label l6 = new Label("Developed By Saif Khan");
	Image image = new Image("/Image/1.jpg");
	ImageView image1 = new ImageView(image);
	
	 public void start(Stage ps) {
		 t1.setText("0.0");
		 t2.setText("0.0");
		 t3.setText("0.0");
		 t4.setText("0.0");
		 t5.setText("0.0");
		image1.setFitHeight(250);
		image1.setFitWidth(420);
		
		gp.add(l1, 0, 0);
		gp.add(l2, 0, 1);
		gp.add(l3, 0, 2);
		gp.add(l4, 0, 3);
		gp.add(l5, 0, 5);
		
		gp.add(t1, 1, 0);
		gp.add(t2, 1, 1);
		gp.add(t3, 1, 2);
		gp.add(t4, 1, 3);
		gp.add(t5, 1, 5);
		
		gp.add(b1, 1, 4);
		gp.add(bexit, 1, 6);
		gp.add(l6, 0, 7);
		
		bpane.setCenter(gp);
		bpane.setPadding(new Insets(20,20,20,40));
		
		pane.getChildren().addAll(image1,bpane);
		Scene scene1 = new Scene(pane,420,230);
		ps.setTitle("CGPA CALCULATOR");
		ps.setScene(scene1);
		ps.show();
		
		b1.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent t) {
	        	double lcg = Double.parseDouble(t2.getText());
	        	double lcr = Double.parseDouble(t1.getText());
	        	double tcg = Double.parseDouble(t4.getText());
	        	double tcr = Double.parseDouble(t3.getText());
	        	double crcg =  (((lcg*lcr)+(tcg*tcr))/(lcr+tcr));
	        	
	        	t5.setText(Double.toString(crcg));
	        }
	      
	    });
		bexit.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent t) {
	        	System.exit(0);
	        }
		 });
	}
	 public static void main(String[] args) {
	        launch(args);
	    }
	 
}
