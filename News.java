
package universitymanagementapp1;

import  java.awt.*;
import  java.awt.event.*;

import javax.swing.*;



 class News extends JFrame implements ActionListener
{

JTextArea jta;
JLabel jlb,jlb2,jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;

JButton join,Home;
News()
{
JPanel panel = new JPanel();
        
Container c = this.getLayeredPane();

Home = new JButton("Home");
Home.addActionListener(this);
jl2 = new JLabel("The Student Support Cell is honestly working ");


jl3 = new JLabel("for students, addressing their diverse");

jl4 = new JLabel("needs and challenges. From academic guidance to");
    
jl5 = new JLabel("personal counseling, our team is committed to providing comprehensive");
jl6 = new JLabel("support. We understand that university");
    
    
    
jl7 = new JLabel("Cybersecurity Awareness Week:                  ");


jlb = new JLabel("                                                                                                                ");
    
    jl8 = new JLabel("Enhance your knowledge of cybersecurity");


jl9 = new JLabel("through a week-long series of workshops,");

jl10 = new JLabel("lectures, and simulations.Learn about the latest");
    
jl11 = new JLabel("threats, defense mechanisms, and career opportunities in the field");
jl12 = new JLabel("of cybersecurity.");
    

jl = new JLabel("News:");

Font f = new Font("Roboto Slab", Font.BOLD,30);
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
setSize(500,500);
setLayout(new FlowLayout(FlowLayout.LEFT));
 this.setVisible(true);
    setResizable(false);
   Color lightGray = new Color(0xFFF5BA);
this.getContentPane().setBackground(lightGray);

this.setLocationRelativeTo(null);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   

this.setTitle("News");

}public void actionPerformed(ActionEvent ae)
{
 if (ae.getSource()==Home)
    {
   dispose();

   
    }   
    
}


}
