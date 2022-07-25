package TermWork8;

import java.awt.*;
import java.awt.event.*;

class RegForm implements ActionListener{
	String newline=System.getProperty("line.separator");
	Frame f=new Frame("Registration Form");
	Label l1=new Label("Registration Form");
	Label l2=new Label("Name");
	Label l3=new Label("Mobile");
	Label l4=new Label("Gender");
	Label l5=new Label("DOB");
	Label l6=new Label("Address");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextArea t3=new TextArea();
	TextField t4=new TextField();
	
	CheckboxGroup cg=new CheckboxGroup();
	
	Checkbox c1=new Checkbox("Accept Terms And Conditions",false);
	Checkbox c2=new Checkbox("Male",cg,true);
	Checkbox c3=new Checkbox("Female",cg,false);
	
	Choice ch1=new Choice();
	Choice ch2=new Choice();
	Choice ch3=new Choice();
	
	Button b1=new Button("Submit");
	Button b2=new Button("Reset");
	
	RegForm(){
		f.setBounds(100, 100, 700, 700);
		f.setLayout(null);
		
		l1.setBackground(null);
		l1.setBounds(270,30,200,40);
		l1.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(l1);
		
		l2.setBackground(null);
		l2.setBounds(80, 78, 80, 50);
		l2.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(l2);
		
		l3.setBackground(null);
		l3.setBounds(80, 148, 80, 50);
		l3.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(l3);
		
		t1.setBounds(170, 95, 150, 20);
		f.add(t1);
		
		t2.setBounds(170, 160, 150, 20);
		t3.setEditable(true);
		f.add(t2);
		
		t3.setBounds(400, 80, 250, 500);
		t3.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(t3);
		
		l4.setBackground(null);
		l4.setBounds(80, 200, 80, 50);
		l4.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(l4);
		
		c2.setBounds(160, 200, 70, 50);
		c2.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(c2);
		
		c3.setBounds(230, 200, 70, 50);
		c3.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(c3);
		
		l5.setBackground(null);
		l5.setBounds(80, 245, 80, 50);
		l5.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(l5);
		
		for(int i=1;i<=31;i++) {
			String d=String.valueOf(i);
			ch1.add(d);
		}
		
		ch1.setBounds(160, 260, 60, 50);
		ch1.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(ch1);
		
		ch2.add("Jan");
		ch2.add("Feb");
		ch2.add("Mar");
		ch2.add("Apr");
		ch2.add("May");
		ch2.add("Jun");
		ch2.add("Jul");
		ch2.add("Aug");
		ch2.add("Sept");
		ch2.add("Oct");
		ch2.add("Nov");
		ch2.add("Dec");
		
		ch2.setBounds(205, 260, 90, 50);
		ch2.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(ch2);
		
		for(int i=1998;i<=2021;i++) {
			String d=String.valueOf(i);
			ch3.add(d);
		}
		
		ch3.setBounds(270, 260, 90, 50);
		ch3.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(ch3);
		
		l6.setBackground(null);
		l6.setBounds(80, 300, 80, 50);
		l6.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(l6);
		
		t4.setBounds(170, 320, 150, 100);
		f.add(t4);
		
		c1.setBounds(130, 420, 210, 80);
		c1.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(c1);
		
		b1.setBounds(100, 500, 90, 30);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(b1);
		
		b2.setBounds(230, 500, 90, 30);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setFont(new Font("Arial", Font.PLAIN, 15));
		f.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void WindowClosed() {
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			if(c1.getState()) {
				if(t1.getText().isEmpty()||t2.getText().isEmpty()||t4.getText().isEmpty()) {
					t3.setText("Please fill all the fields");
				}
				else {
					if(c2.getState()) {
						String result="Name:"+t1.getText()+newline+"Mobile no:"+
								  t2.getText()+newline+"Gender:Male"+newline+"DOB:"
								  +ch1.getItem(ch1.getSelectedIndex())+"-"
								  +ch2.getItem(ch2.getSelectedIndex())+"-"
								  +ch3.getItem(ch3.getSelectedIndex())+newline
								  +"Address:"+t4.getText();
						t3.setText(result);
						
						
					}
					if(c3.getState()) {
						String result="Name:"+t1.getText()+newline+"Mobile no:"+
								  t2.getText()+newline+"Gender:Female"+newline+"DOB:"
								  +ch1.getItem(ch1.getSelectedIndex())+"-"
								  +ch2.getItem(ch2.getSelectedIndex())+"-"
								  +ch3.getItem(ch3.getSelectedIndex())+newline
								  +"Address:"+t4.getText();
						t3.setText(result);
					}
					
				}
					
			}
			else {
				t3.setText("Accept the terms and condition");
			}
		}
		if(e.getSource()==b2) {
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			c1.setState(false);
			c3.setState(false);
			ch1.select(0);
			ch2.select(0);
			ch3.select(0);
			
		}
	}
}

public class termWork8 {

	public static void main(String[] args) {
		RegForm r=new RegForm();

	}

}


