import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class myThread extends Thread{
int basicSal;
double Gsal;
public myThread(int basicSal) {
this.basicSal=basicSal;
}
public void run() {
GrossSalary();
}
synchronized void GrossSalary() {
double DA=0,HRA=0;
if(basicSal>= 40000)
DA=percent(85);
else
if(basicSal>= 30000)
DA=percent(80);
else
if(basicSal>= 25000)
DA=percent(70);
HRA=percent(5);
Gsal = basicSal+DA+HRA;
}
double percent(int n) {
return (basicSal/100)*n;
}
@Override
public String toString() {
return "Gross Salary : "+Gsal;
}
}
class myException extends Exception{
String msg;
myException(String msg){
this.msg=msg;
}
public String toString() {
return msg;
}
}
public class Employee implements ActionListener {
private JFrame frame;
private JLabel name,dep,sal,gdr,addr,prj,res;
private JTextField tname,tsal;
private JTextArea taddr;
private JScrollPane addrp;
private JRadioButton male,female,other;
private ButtonGroup Gender;
private JComboBox Cdep;
private JCheckBox p1,p2,p3,p4;
private JButton submit,reset;
Employee(){
//frame
frame= new JFrame("Employee Gross Salary Caculater.");
frame.setBounds(350,0,600,750);
frame.setResizable(false);
frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//Name
name=new JLabel("Name");
name.setBounds(100, 20, 100,30);
name.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(name);
tname= new JTextField();
tname.setBounds(230, 20, 200, 35);
tname.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(tname);
//DepartMent
dep=new JLabel("Department");
dep.setBounds(100, 70, 100,30);
dep.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(dep);
String dpt[]= {" ","CSE","E&C","CIVIL","MECH"};
Cdep=new JComboBox(dpt);
Cdep.setBounds(230, 70, 200, 30);
Cdep.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(Cdep);
//employee salary
sal=new JLabel("Basic Salary");
sal.setBounds(100, 120, 100,30);
sal.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(sal);
tsal= new JTextField();
tsal.setBounds(230, 120, 200, 35);
tsal.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(tsal);
//gender
gdr=new JLabel("Gender");
gdr.setBounds(100, 170, 100,30);
gdr.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(gdr);
male=new JRadioButton("Male");
male.setBounds(230,170,65,30);
male.setFont(new Font("Times New Roman",Font.BOLD,18));
male.setSelected(true);
female=new JRadioButton("Female");
female.setBounds(300,170,80,30);
female.setFont(new Font("Times New Roman",Font.BOLD,18));
other=new JRadioButton("Other");
other.setBounds(385,170,70,30);
other.setFont(new Font("Times New Roman",Font.BOLD,18));
Gender=new ButtonGroup();
Gender.add(male);
Gender.add(female);
Gender.add(other);
frame.add(male);
frame.add(female);
frame.add(other);
//Address
addr=new JLabel("Address");
addr.setBounds(100, 220, 100,30);
addr.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(addr);
taddr=new JTextArea();
taddr.setFont(new Font("Times New Roman",Font.BOLD,16));
addrp= new JScrollPane(taddr);
addrp.setPreferredSize(new Dimension(50,50));
addrp.setBounds(230,230,200,100);
addrp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
frame.add(addrp);
//Projects
prj=new JLabel("Select Your interest projects.");
prj.setBounds(100, 350, 300, 30);
prj.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(prj);
p1=new JCheckBox("AI");
p1.setBounds(100, 400, 200, 30);
p1.setFont(new Font("Times New Roman",Font.BOLD,18));
p2=new JCheckBox("ML");
p2.setBounds(320, 400, 200, 30);
p2.setFont(new Font("Times New Roman",Font.BOLD,18));
p3=new JCheckBox("Data Science");
p3.setBounds(100, 450, 200, 30);
p3.setFont(new Font("Times New Roman",Font.BOLD,18));
p4=new JCheckBox("Data Mining");
p4.setBounds(320, 450, 200, 30);
p4.setFont(new Font("Times New Roman",Font.BOLD,18));
frame.add(p1);
frame.add(p2);
frame.add(p3);
frame.add(p4);
//Button
submit=new JButton("submit");
submit.setFont(new Font("Times New Roman",Font.BOLD,18));
submit.setBounds(100, 550, 100, 30);
submit.addActionListener(this);
frame.add(submit);
reset=new JButton("Reset");
reset.setFont(new Font("Times New Roman",Font.BOLD,18));
reset.setBounds(350, 550, 100, 30);
reset.addActionListener(this);
frame.add(reset);
//result
res=new JLabel();
res.setFont(new Font("Times New Roman",Font.BOLD,18));
res.setBounds(100,600, 400, 50);
frame.add(res);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
//submit
if(ae.getSource()==submit) {
String check;
try {
check=tsal.getText();
if(!check.isEmpty()) {
if(Integer.parseInt(check) <= 0) {
throw new myException("SalaryNotValid");
}
}
check=tname.getText();
if(check.isEmpty()) {
throw new myException("NameCannotBeBlank");
}
myThread sal=new myThread(Integer.parseInt(tsal.getText()));
sal.start();
sal.join();
res.setText(String.valueOf(sal));
}
catch(myException me) {
res.setText(String.valueOf(me));
} catch (InterruptedException e) {
}
}
//Reset
else {
tname.setText("");
tsal.setText("");
taddr.setText("");
Cdep.setSelectedIndex(0);
male.setSelected(true);
p1.setSelected(false);
p2.setSelected(false);
p3.setSelected(false);
p4.setSelected(false);
res.setText("");
}
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
public void run() {
new Employee();
}
});
}
}