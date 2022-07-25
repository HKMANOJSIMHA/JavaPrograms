
import java.awt.*;
import java.awt.event.*;

class HotelManagment implements ActionListener{
	int sum=0,tot=0;
	Frame f1=new Frame("SDM CANTEEN BILLING SYSTEM");
	Label l0=new Label("WELCOME TO SDM CANTEEN");
	Label l1=new Label("ITEM");
	Label l2=new Label("QUANTITY");
	Label l3=new Label("PRICE");
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextArea t4=new TextArea();
	Button b1=new Button("ADD");
	Button b2=new Button("PRINT BILL");
	Button b3=new Button("RESET");
	
	HotelManagment(){
		f1.setBounds(170,170,470,470);
		f1.setVisible(true);
		f1.setLayout(null);
		
		l0.setBounds(120, 20, 250, 50);
		l0.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(l0);
		
		l1.setBounds(50, 50, 50, 70);
		l1.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(l1);
		
		t1.setBounds(170, 75, 100, 20);
		t1.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(t1);
		
		l2.setBounds(50, 100, 90, 70);
		l2.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(l2);
		
		t2.setBounds(170, 123, 100, 20);
		t2.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(t2);
		
		l3.setBounds(50, 150, 90, 70);
		l3.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(l3);
		
		t3.setBounds(170, 175, 100, 20);
		t3.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(t3);
		
		b1.setBounds(180, 250, 80, 30);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(b1);
		
		t4.setBounds(300, 70, 130, 170);
		t4.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(t4);
		
		b2.setBounds(170, 310, 100, 30);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(b2);
		
		b3.setBounds(170, 370, 100, 30);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setFont(new Font("Arial", Font.PLAIN, 15));
		f1.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b1) {
			int q=Integer.parseInt(t2.getText());
			int p=Integer.parseInt(t3.getText());
			tot=q*p;
			sum=sum+tot;
			String s1=t1.getText()+"-"+q+"-"+tot;
			t4.append(s1+"\n");
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
		}
		if(e.getSource()==b2) {
			t4.append("Total price:"+sum+"\n");
		}
		if(e.getSource()==b3) {
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
		}
		
	}
	
	
}
