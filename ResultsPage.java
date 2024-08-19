

package universitymanagementapp1;

import java.awt.event.*;

import java.awt.*;
import javax.swing.*;

 class ResultsPage implements ActionListener{
    
    JFrame f1;
JLabel name,email,pass;
JTextField tf1,tf2,tf3;
JButton jb;
JTextArea jta;
JLabel jlb,jlb2,jlb3,jlb4,jlb5,title,Add;
JButton join,Home;

ResultsPage()
{
    
Home = new JButton("Home");
Home.addActionListener(this);

jlb = new JLabel("                                                                ");
    
  
jlb2 = new JLabel("                                                           ");
   
jlb3 = new JLabel("                                                ");
   
jlb4 = new JLabel("                                                ");                                             
jlb5 = new JLabel("                                                ");
f1 = new JFrame("Results:");
name = new JLabel("Name: ");
jta = new JTextArea(3,100);
//ont f = new Font(,Font.);
email = new JLabel("Email: ");
pass = new JLabel("Password: ");
tf1 = new JTextField(20);
tf2 = new JTextField(20);
tf3 = new JTextField(15);

jb = new JButton("Show Results");

jb.addActionListener(this);
f1.add(name);

f1.add(tf1);
f1.add(jlb2);
f1.add(email);
f1.add(tf2);

f1.add(jlb3);

f1.add(pass);
f1.add(tf3);

f1.add(jlb4);

f1.add(jb);
f1.add(jta);
f1.add(Home);
   Color lightGray = new Color(0xF2D09D);
f1.getContentPane().setBackground(lightGray);

f1.setSize(500,500);
f1.setLayout(new FlowLayout(FlowLayout.LEFT));
f1.setVisible(true);


f1.setLocationRelativeTo(null);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   

}


    @Override
    public void actionPerformed(ActionEvent e) {
          
 if (e.getSource()==Home)
    {
  f1.dispose();

   
    }   
    
    
        if (e.getSource() == jb) {
            // Display student data in tabular form
            JFrame resultsFrame = new JFrame("Student Results");
            resultsFrame.setSize(500, 500);
            resultsFrame.setLayout(new BorderLayout());
            

    
  //Sample data for the table
           String[] columnNames = {"Subject", "Marks", "Result"};
         Object[][] data = {
             {"Math", "85", "Pass"},
              {"Science", "92", "Pass"},
             {"History", "78", "Pass"},
               {"Literature", "67", "Pass"},
               {"Physical Education", "50", "Pass"},
               {"Art", "58", "Fail"}
            };

            JTable resultsTable = new JTable(data, columnNames);
           JScrollPane scrollPane = new JScrollPane(resultsTable);
            resultsTable.setFillsViewportHeight(true);

            //resultsFrame.add(scrollPane, BorderLayout.CENTER
            resultsFrame.setLocationRelativeTo(null);
            resultsFrame.setVisible(true);
        }
 
    

 }
 }