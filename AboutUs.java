
package universitymanagementapp1;


import  java.awt.*;
import  java.awt.event.*;

import javax.swing.*;



 class AboutUs extends JFrame implements ActionListener
{

JTextArea jta;
JLabel jlb,jlb2,jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;

JButton join,Home;
AboutUs()
{
JPanel panel = new JPanel();
        
Container c = this.getLayeredPane();

Home = new JButton("Home");
Home.addActionListener(this);
/*

*/

jl2 = new JLabel("Universities stand as beacons of knowledge and growth, ");


jl3 = new JLabel("where students embark on a journey that shapes their ");

jl4 = new JLabel("futures. Within these institutions, the air is charged with the ");
    
jl5 = new JLabel("excitement of learning, discovery, and personal");
jl6 = new JLabel("development.                                       ");
    
    
    
jl7 = new JLabel("Our Speciality:                  ");


jlb = new JLabel("                                                                                                                ");
    
    jl8 = new JLabel("Enhance your knowledge of cybersecurity");


jl9 = new JLabel("we celebrate the role of universities in shaping minds and futures,");

jl10 = new JLabel("let us embrace the transformative power of");
    
jl11 = new JLabel("higher education. Together, we embark on a journey of");
jl12 = new JLabel("learning and discovery, paving the way for a brighter tomorrow. ");
    

jl = new JLabel("About Us: ");

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
setSize(500,500);
setLayout(new FlowLayout(FlowLayout.LEFT));
 this.setVisible(true);
    
   Color lightGray = new Color(0xFFF5BA);
this.getContentPane().setBackground(lightGray);

this.setLocationRelativeTo(null);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   

this.setTitle("About Us");

}
public void actionPerformed(ActionEvent ae)
{
    
    
 if (ae.getSource()==Home)
    {
   dispose();

   
    }   
    
}


}


