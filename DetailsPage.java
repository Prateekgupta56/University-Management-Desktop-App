
package universitymanagementapp1;
import java.awt.event.*;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

 class DetailsPage implements ActionListener
{
    JFrame f1;
JLabel name,email,pass;
JTextField tf1,tf2,tf3;
JButton jb;
JTextArea jta;
JLabel jlb,jlb2,jlb3,jlb4,jlb5,title,Add,n1,e1,p1,c1,a1;
JButton join,Home;

Connection con;
Statement smt;
ResultSet rs;
JLabel l1;
DetailsPage()
{
f1 = new JFrame("Enter Student Details:");
name = new JLabel("Name: ");
email = new JLabel("Email: ");
pass = new JLabel("Password: ");


n1 = new JLabel("Name: ");
e1 = new JLabel("Email: ");
p1 = new JLabel("Password: ");
/*
1 = new JLabel("Password: ");
*/
a1 = new JLabel("Password: ");

tf1 = new JTextField(20);
tf2 = new JTextField(20);
tf3 = new JTextField(15);
jb = new JButton("Get Data");
jb.addActionListener(this);
Home = new JButton("Home");
Home.addActionListener(this);

l1 = new JLabel("                                                   ");
   
jlb = new JLabel("                                                                ");
    
  jta = new JTextArea(3,50);
    
jlb2 = new JLabel("                                                   ");
   
jlb3 = new JLabel("                                                ");
   
jlb4 = new JLabel("                                                                ");                                             
jlb5 = new JLabel("                                                ");


f1.add(name);

f1.add(tf1);
f1.add(jlb4);
f1.add(email);
f1.add(tf2);

f1.add(jlb2);
f1.add(pass);
f1.add(tf3);

f1.add(jlb);
f1.add(jlb3);
f1.add(l1);
f1.add(jb);
f1.add(Home);
    f1.add(jta);

   Color lightGray = new Color(0xFFF5BA);
f1.getContentPane().setBackground(lightGray);
f1.setSize(500,500);
f1.setLayout(new FlowLayout(FlowLayout.LEFT));
f1.setVisible(true);

f1.setLocationRelativeTo(null);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
}
public void actionPerformed(ActionEvent ae)
{
    
    
            String name = tf1.getText();
            String email = tf2.getText();
            String pass = tf3.getText();
      //      String course = tf4.getText();
         //   String address = tf5.getText();
         
         
 if (ae.getSource()==Home)
    {
  f1.dispose();

   
    }   
    
    if(ae.getSource()==jb)
		{
                    
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prateek","root","Root");	
	smt=con.createStatement();
		String s2="select * from ResultStudent where name='"+tf1.getText()+"' and password="+Integer.parseInt(tf3.getText());
		rs=smt.executeQuery(s2);
			if(rs.next())
			{
			l1.setText("Getting Data !!!!");
			    while(rs.next())
			    {
			     			    jta.setText(rs.getString(1)+ " "+ rs.getString(2)+" "+rs.getInt(3)+" "+ rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			        
			    }
			}
			else
			{
			l1.setText("UserName or Password is incorrect !!!!");
			}
	}
        
	catch(Exception e1)
	{
System.out.println(e1);
	}
}
}
    

}
