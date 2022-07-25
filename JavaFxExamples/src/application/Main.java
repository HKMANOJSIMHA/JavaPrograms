package application;
	
import javafx.application.Application;
import javafx.event.*;
import javafx.stage.Stage;
import javafx.scene.Scene;  
import javafx.scene.control.*;
import javafx.scene.layout.*;
 
  
public class Main extends Application {  
	public void start(Stage s) throws Exception {
		
		s.setTitle("Menu Example");
		
		GridPane gp=new GridPane();
		Scene sc=new Scene(gp,500,500);
		
		Label l1=new Label("Name");
		TextField name=new TextField();
		Label l2=new Label("Password");
		PasswordField pass=new PasswordField();
		Label l3=new Label("Gender");
		
		RadioButton rb1=new RadioButton("Male");
		RadioButton rb2=new RadioButton("Female");
		ToggleGroup tg1=new ToggleGroup();
		rb1.setToggleGroup(tg1);
		rb2.setToggleGroup(tg1);
		
		Label l4=new Label("Languages known");
		CheckBox c1=new CheckBox("Hindi");
		CheckBox c2=new CheckBox("English");
		CheckBox c3=new CheckBox("Kannada");
		
		Button b1=new Button("Register");
		Button b2=new Button("Exit");
		
		Label l5=new Label();
		
		ChoiceBox cb1=new ChoiceBox();
		Label l6=new Label("Select State");
		cb1.getItems().addAll("Karnataka","Mumbai","Chennai","Goa");
		
		Menu m1=new Menu("Sem");
		MenuItem i1=new MenuItem("4th");
		MenuItem i2=new MenuItem("5th");
		Menu sub=new Menu("Sub");
		MenuItem s1=new MenuItem("S1");
		MenuItem s2=new MenuItem("S2");
		sub.getItems().addAll(s1,s2);
		m1.getItems().addAll(i1,i2,sub);
		MenuBar mb1=new MenuBar(m1);
		
		gp.add(l1, 0, 0);
		gp.add(name, 1, 0);
		gp.add(l2, 0, 1);
		gp.add(pass, 1, 1);
		gp.add(l3,0,2);
		gp.add(rb1, 1, 2);
		gp.add(rb2, 2, 2);
		gp.add(l4, 0, 3);
		gp.add(c1, 1, 3);
		gp.add(c2, 2, 3);
		gp.add(c3, 3, 3);
		gp.add(l6, 0, 4);
		gp.add(cb1, 1, 4);
		gp.add(b1, 1, 5);
		gp.add(b2, 2, 5);
		gp.add(l5, 3, 5);
		gp.add(mb1, 2, 6);
		
		s.setScene(sc);
		s.show();
		EventHandler<ActionEvent>MH=new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String val=((MenuItem) ae.getTarget()).getText();
				l5.setText(val);
			}
		};
		b1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
					
				}	
		});
		
		b2.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				System.exit(0);
			}
		});
		i1.setOnAction(MH);
		i2.setOnAction(MH);
		s1.setOnAction(MH);
		s2.setOnAction(MH);
		
	}
    
	public static void main(String[] args) {  
        launch(args);  
    }  
}  
