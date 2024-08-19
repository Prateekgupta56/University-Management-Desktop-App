package universitymanagementapp1;


import  java.awt.*;
import  java.awt.event.*;

import javax.swing.*;


public class OnlineDegreePrograms extends JFrame implements ActionListener
{

JTextArea jta;
JLabel jlb,jlb2,jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;

JButton join,Home;
OnlineDegreePrograms()
{
JPanel panel = new JPanel();
        
Container c = this.getLayeredPane();

Home = new JButton("Home");
Home.addActionListener(this);
 /*   Online Degree programs:

In Online degree programs offer unparalleled flexibility and convenience, enabling students to access diverse courses and specializations such as B.Tech, BCA, and MBA from anywhere in the world. These programs allow students to balance their education with personal and professional commitments, often at a lower cost compared to traditional on-campus education. With access to top institutions and enhanced learning experiences through advanced technology, online degrees provide a valuable pathway for career advancement and lifelong learning, making quality education more accessible and adaptable to individual needs.

*/   
   

jl2 = new JLabel("Online Degree programs:In Online degree programs offer unparalleled ");


jl3 = new JLabel("flexibility and convenience, enabling students to access");

jl4 = new JLabel("diverse courses and specializations such as B.Tech, ");
    
jl5 = new JLabel("BCA, and MBA from anywhere in the world.");
jl6 = new JLabel("These programs allow students to balance their ");
    
    
    
jl7 = new JLabel("Cybersecurity Awareness Week:                  ");


jlb = new JLabel("                                                                                                                ");
    
    jl8 = new JLabel("Enhance your knowledge of cybersecurity");


jl9 = new JLabel("through a week-long series of workshops,");

jl10 = new JLabel("lectures, and simulations.Learn about the latest");
    
jl11 = new JLabel("threats, defense mechanisms, and career opportunities in the field");
jl12 = new JLabel("of cybersecurity.");
    

jl = new JLabel("Online Degree Programs:");

Font f = new Font("Roboto Slab", Font.BOLD,30);

getContentPane().add(panel);
JScrollPane scrollPane = new JScrollPane(jta);
 

Font f2 = new Font("Century Gothic", Font.BOLD,25);
    
c.add(jl2);       
panel.add(scrollPane);
jl.setFont(f);
        
jl7.setFont(f2);
this.add(jl);
this.add(jlb);
this.add(jl2);
this.add(jl3);
this.add(jl4);
this.add(jl5);
this.add(jl6);
this.add(jl7);
    this.add(jl8);
    
this.add(jl9);
    
    this.add(jl10);
this.add(jl11);
this.add(jl12);
    
this.add(Home);
   Color lightGray = new Color(0xFFF5BA);
this.getContentPane().setBackground(lightGray);


setSize(500,500);
setLayout(new FlowLayout(FlowLayout.LEFT));
 this.setVisible(true);
    setResizable(false);
this.setLocationRelativeTo(null);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   

this.setTitle("Online Degree Programs");

}
public void actionPerformed(ActionEvent ae)
{

}

}
