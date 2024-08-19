
package universitymanagementapp1;


import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class HomePageNew extends JFrame implements ActionListener  {

MenuBar mb = new MenuBar();

Menu Home = new Menu("Home");
Menu news = new Menu("News");

Menu Students = new Menu("Students");
    
Menu Academics = new Menu("Academics");


JLabel title = new JLabel("Chatrapati Shahu Ji Maharaj University.");

Menu visit = new Menu("Visit");
Menu about = new Menu("About");

MenuItem refresh = new MenuItem("Refresh");
MenuItem N = new MenuItem("Get News");

MenuItem s1 = new MenuItem("New Student");
MenuItem s2 = new MenuItem("Student Support Cell");
    
   
 MenuItem a1 = new MenuItem("Degree Programs");
MenuItem a2 = new MenuItem("Online Programs");
    
MenuItem a3 = new MenuItem("Details");

    MenuItem a4 = new MenuItem("Results");


MenuItem v1 = new MenuItem("Our Beautiful Campus");
MenuItem v2 = new MenuItem("Our Events");
    
    
MenuItem ab1 = new MenuItem("About Us");

MenuItem ab2 = new MenuItem("Explore Our Journey");

JButton b1,b2;
    
JLabel k,a,copc,jlb,jlb2,jlb14,jlb15,jlb16,jlb17,jlb18,jl,jl2,jlb12,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jlb11,jlb13,jl14,jl15,jl16,jl17,jl18,jl19,jl20;

public HomePageNew()
{
    
b1 = new JButton("New Student");
b2 = new JButton("Login");
setMenuBar(mb);

mb.add(Home);

a = new JLabel("University Management App                                                                                                            ");

k = new JLabel("                                                                                                                                                                                                                ");

Font f2 = new Font("Roboto Slab", Font.BOLD,15);
a.setFont(f2);
mb.add(Students);

    
mb.add(Academics);

mb.add(visit);

mb.add(about);

mb.add(news);

Home.add(refresh);
news.add(N);
Academics.add(a1);
a1.addActionListener(this);
Academics.add(a2);
a2.addActionListener(this);
Academics.add(a3);
a3.addActionListener(this);
Academics.add(a4);
  a4.addActionListener(this);
 
 
Students.add(s1);
s1.addActionListener(this);
Students.add(s2);
s2.addActionListener(this);
this.add(a);

this.add(title);

this.add(k);
Font f = new Font("Roboto Slab", Font.BOLD,30);

title.setFont(f);
visit.add(v1);
v1.addActionListener(this);
visit.add(v2);
   v2.addActionListener(this);
 
about.add(ab1);
ab1.addActionListener(this);
about.add(ab2);
ab2.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);

    news.addActionListener(this);
    Home.addActionListener(this);
    
    
    
    

jl2 = new JLabel("Nestled amidst the serene landscapes of Maharashtra, Chatrapati Shivaji Maharaj University");


jl3 = new JLabel("stands as a beacon of higher education, blending academic rigor ");

jl4 = new JLabel("with a rich cultural heritage. Established with a vision to ");
jl5 = new JLabel("empower the next generation of leaders and innovators, the university");
jl6 = new JLabel("offers a holistic learning environment that nurtures intellect and character ");
jl7 = new JLabel("alike.The sprawling campus of Chatrapati Shivaji Maharaj University is a testament to architectural");
jl7 = new JLabel("in learning. State-of-the-art infrastructure, including ,well-equipped laboratories, libraries stocked with ");
jl8 = new JLabel("advanced sports facilities, ensures that every aspect of ");

jl9 = new JLabel("student life is catered to with utmost care.");
//jl10 = new JLabel("academic excellence meets natural splendo.");
copc = new JLabel("© Made by Prateek Gupta, Sachin ,Saurabh Verma");
                                                                                                                                                                     
Font f3 = new Font("Roboto Slab", Font.BOLD,10);
copc.setFont(f3);

jlb = new JLabel("                                                                     ");


jlb11 = new JLabel("                                                                     ");


jlb12 = new JLabel("                                                                                                                            ");


jlb13 = new JLabel("                                                                     ");




jlb14 = new JLabel("                                                                                                                 ");




jlb15 = new JLabel("                                                                                                                                                   ");


jlb16 = new JLabel("                                                                                                   ");


jlb17 = new JLabel("                                                                     ");

jl14 = new JLabel("Chatrapati Shivaji Maharaj University stands tall as a symbol of educational prowess and holistic development.");


//jl15 = new JLabel("our campus blooms with timeless beauty.");

//jl16 = new JLabel("Quaint pathways wind through manicured gardens, ");
jl15 = new JLabel("With its picturesque campus, cutting-edge facilities, and unwavering");
jl16 = new JLabel("commitment to student success, it continues to inspire and empower generations of learners.");
jl17 = new JLabel("For those aspiring to carve a path to success backed by a solid foundation");
//jl7 = new JLabel("Each season paints the campus in its own palette,");
jl18 = new JLabel("of knowledge and skills, Chatrapati Shivaji Maharaj University is more ");

jl19 = new JLabel("than an institution—it's a journey towards academic excellence and personal fulfillment.");
jl20 = new JLabel("academic excellence meets natural splendo.");


//his.add(jlb);t
this.add(jl2);
this.add(jl3);
this.add(jl4);
this.add(jl5);
this.add(jl6);
this.add(jl7);
this.add(jl8);
this.add(jl9);
//this.add(jl10);
jlb = new JLabel("                                                      ");
this.add(jlb);
this.add(jlb11);

//
//this.add(jlb13);

//this.add(jlb14);
//this.add(jlb15);
//this.add(jlb16);
//this.add(jlb17);
//this.add(jlb18);


this.add(jl14);
this.add(jl15);
this.add(jl16);
this.add(jl17);
this.add(jl18);
this.add(jl19);
this.add(jl20);
this.add(jlb14);
this.add(b1);
this.add(b2);
this.add(jlb12);
this.add(copc);
setSize(700,550);
setLayout(new FlowLayout(FlowLayout.LEFT));
 this.setVisible(true);
    setResizable(false);
this.setLocationRelativeTo(null);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   Color lightGray = new Color(0xBCB400);
this.getContentPane().setBackground(lightGray);

setTitle("University Management App");
setResizable(false);
}
public void actionPerformed(ActionEvent ae)
{

 if (ae.getSource()==refresh)
    {
   dispose();
 HomePageNew t = new HomePageNew(); 
   
    }   
    
    
    
 if (ae.getSource()==s1)
    {
   
        StudentFormPage ob = new StudentFormPage();
    }
     
    
 if (ae.getSource()==b2)
    {
   
        LoginPage ob = new LoginPage();
    }
    
    
    
    if (ae.getSource()==s2)
    {
        StudentSupportCell ob = new StudentSupportCell();
    }
    
    
    
    if (ae.getSource()==a2)
    {
        OnlineDegreePrograms ob = new OnlineDegreePrograms();
    }
    
    
    
    if (ae.getSource()==a1)
    {
         DegreePrograms ob = new DegreePrograms();
    }
    
    
    
    if (ae.getSource()==a3)
    {
        DetailsPage ob = new DetailsPage();
    }
    
    
    
    if (ae.getSource()==a4)
    {
        ResultsPage ob = new ResultsPage();
    }
    
    
    
    if (ae.getSource()==v1)
    {
       OurBeautifulCampus  ob = new OurBeautifulCampus();
    }
    
    
    if (ae.getSource()==v2)
    {
       OurEvents  ob = new OurEvents();
    }
    
    
    
    if (ae.getSource()==ab1)
    {
        AboutUs ob = new AboutUs();
    }
    
    
    
    if (ae.getSource()==ab2)
    {
       ExploreOurJourney ob = new ExploreOurJourney();
    }
    
    
    
    if (ae.getSource()==news)
    {
       News ob = new News();
    }
    
     
    if (ae.getSource()==b1)
    {
         StudentFormPage ob = new StudentFormPage();
    }
     
    
 if (ae.getSource()==N)
    {
   
       News ob = new News();
    }
    
    
}
    

    

public static void main(String args[])
{
new HomePageNew();
}
}




