

package universitymanagementapp1;


import  java.awt.*;
import  java.awt.event.*;

import javax.swing.*;


 class OurBeautifulCampus extends JFrame implements ActionListener
{

JTextArea jta;
JLabel jlb,jlb2,jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;

JButton join,Home;
OurBeautifulCampus()
{
JPanel panel = new JPanel();
        
Container c = this.getLayeredPane();

Home = new JButton("Home");
Home.addActionListener(this);
jl2 = new JLabel("Nestled among rolling hills and ancient oaks,   ");


jl3 = new JLabel("our campus blooms with timeless beauty.");

jl4 = new JLabel("Quaint pathways wind through manicured gardens, ");
jl5 = new JLabel("leading to inspiring architecture that blends tradition with modernity.");
jl6 = new JLabel("Sunlight dances on the ivy-covered walls of");
jl7 = new JLabel(" historic buildings, creating a serene atmosphere perfect for learning and discovery.");
jl7 = new JLabel("Each season paints the campus in its own palette,");
jl8 = new JLabel("from vibrant autumn hues to the delicate blossomsof spring.");

jl9 = new JLabel("Our beautiful campus is a haven where");
jl10 = new JLabel("academic excellence meets natural splendo.");


jlb = new JLabel("                                                                                                                ");

jl = new JLabel("Explore our Campus:");

Font f = new Font("Century Gothic", Font.BOLD,40);
getContentPane().add(panel);
JScrollPane scrollPane = new JScrollPane(jta);
 

c.add(jl2);       
panel.add(scrollPane);
jl.setFont(f);
        
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

this.add(Home);
    
   Color lightGray = new Color(0xFFF5BA);
this.getContentPane().setBackground(lightGray);
setSize(500,500);
setLayout(new FlowLayout(FlowLayout.LEFT));
 this.setVisible(true);
   setResizable(false); 
this.setLocationRelativeTo(null);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   

this.setTitle("Campus:");

}
public void actionPerformed(ActionEvent ae)
{

    
 if (ae.getSource()==Home)
    {
   dispose();

   
    }   
    
}

    
}


