import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class animationpanelp extends JPanel{
  //Properties
  int intX1 = 0;
  int intY1 = 200;
  int intX2 = 200;
  int intY2 = 0;
  int intX3 = 480;
  int intY3 = 200;
  int intX4 = 200;
  int intY4 = 480;
  int intX = 225;
  int intY = 225;
  //Methods
  public void paintComponent(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(0,0,500,500);
    g.setColor(Color.WHITE);
    g.fillRect(intX1,intY1,20,100);
    g.fillRect(intX2,intY2,100,20);
    g.fillRect(intX3,intY3,20,100);
    g.fillRect(intX4,intY4,100,20);
    g.setColor(Color.RED);
    g.fillOval(intX,intY,50,50);
  }
  
  // Constructor
  public animationpanelp(){
    super();
  }
}