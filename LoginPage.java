
package universitymanagementapp1;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class LoginPage implements ActionListener
{
JFrame f1;
JLabel name,email,pass,l1;
JTextField tf1,tf2,tf3;
JButton jb;
Statement smt;
Connection con;
ResultSet rs;
LoginPage()
{
f1 = new JFrame("Login Page");
name = new JLabel("Name: ");
email = new JLabel("Email: ");
pass = new JLabel("Password: ");
tf1 = new JTextField(20);
tf2 = new JTextField(20);
tf3 = new JTextField(15);
l1 = new JLabel("                                   ");
jb = new JButton("Login");
jb.addActionListener(this);
f1.add(name);

f1.add(tf1);
f1.add(email);
f1.add(tf2);

f1.add(pass);
f1.add(tf3);
f1.add(jb);
f1.add(l1);

   Color lightGray = new Color(0xFFF5BA);
f1.getContentPane().setBackground(lightGray);

f1.setSize(300,300);
f1.setResizable(false);
f1.setLayout(new FlowLayout(FlowLayout.CENTER));
f1.setVisible(true);
f1.setLocationRelativeTo(null);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
}

@Override
public void actionPerformed(ActionEvent ae) 
{

 
    try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Prateek","root","Root");

smt = con.createStatement();

if(ae.getSource()==jb)
{
String s2 = "select*from Login where name ='"+tf1.getText()+"'and password="+Integer.parseInt(tf3.getText());
rs = smt.executeQuery(s2);

if (rs.next())
{
l1.setText("Login Successfully");
}

else
{
l1.setText("Something went wrong.");
}
}
}




catch(Exception e)
{
System.out.println(e);

}
}
public static void main(String args[])
{
 new LoginPage();    
}
}

