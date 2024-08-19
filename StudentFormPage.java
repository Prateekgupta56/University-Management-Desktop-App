

package universitymanagementapp1;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;


 class StudentFormPage implements ActionListener
{
JFrame f1;
JLabel jlb,jlb2,jlb3,jlb4,jlb5,name,title,Add,email,pass,course;
JTextField tf1,tf2,tf3,tf4,tf5,tf6;
JButton jb;
JTextArea jta;

Connection con;
Statement smt;
ResultSet rs;
JLabel l1;
StudentFormPage()
{
title = new JLabel("Enter Details for Admission    ");
f1 = new JFrame("New Student Form Page:");
name = new JLabel("Name:              ");
email = new JLabel("Email:               ");
pass = new JLabel("Password:      ");

jlb = new JLabel("                                                   ");
    
  jta = new JTextArea(3,100);
jlb2 = new JLabel("                                              ");
   
jlb3 = new JLabel("                                                ");
   
jlb4 = new JLabel("                                                ");                                             
jlb5 = new JLabel("                                                ");
l1 = new JLabel("                                           ");
Add = new JLabel("  Address:        ");
tf1 = new JTextField(20);
tf2 = new JTextField(20);
tf3 = new JTextField(20);
course = new JLabel("Course:            ");
jb = new JButton("Submit");
jb.addActionListener(this);
tf4 = new JTextField(20);

tf5 = new JTextField(20);

tf6 = new JTextField(20);
Font f = new Font("Century Gothic",Font.BOLD,34);
title.setFont(f);

f1.add(title);

f1.add(name);

f1.add(tf1);
f1.add(jlb);
f1.add(email);

f1.add(tf3);

f1.add(jlb2);

f1.add(pass);
f1.add(tf6);

f1.add(jlb3);
f1.add(course);
f1.add(tf4);

f1.add(jlb4);
f1.add(Add);
f1.add(tf5);

f1.add(jlb5);
f1.add(jb);
f1.add(l1);

   Color lightGray = new Color(0xFFF5BA);
f1.getContentPane().setBackground(lightGray);
f1.setSize(500,500);
f1.setLayout(new FlowLayout(FlowLayout.LEFT));
f1.setVisible(true);
f1.setResizable(false);
f1.setLocationRelativeTo(null);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   

}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb) {

	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prateek","root","Root");	
	smt=con.createStatement();
		if(e.getSource()==jb)
		{
		String s1="insert into NewStudent values('"+tf1.getText()+"','"+tf3.getText()+"',"+Integer.parseInt(tf6.getText())+",'"+tf4.getText()+"','"+tf5.getText()+"')";		
		if(smt.executeUpdate(s1)>0)
			{
			
                        
      JOptionPane.showMessageDialog(f1, "Data Regiostered Succefully!,Thank you!", "Submission Successful", JOptionPane.INFORMATION_MESSAGE);

			}
		}	
    
}
catch(Exception g)
{
    System.out.println(g);
    }
            // Show thank you message
          
            
          //  jta.setText("Student Name: "+name+"\nEmail: "+email+" Password: "+pass+" Address:"+Address+" Course: "+Course);
        }
    }


}