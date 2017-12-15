import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;

public class ponggui implements ActionListener, KeyListener, MouseListener, MouseMotionListener{
  // Properties
  JFrame theframe;
  animationpanelp thepanel;
  Timer thetimer;
  boolean blnw = false;
  boolean blns = false;
  boolean blni = false;
  boolean blnk = false;
  boolean blnleft = false;
  boolean blnright = false;
  boolean blnleftclick = false;
  boolean blnrightclick = false;
  boolean blnSwitch = false;
  boolean blnTurn = true;
  int intXDelta = -2;
  int intYDelta = -2;
  // Methods
  public void actionPerformed(ActionEvent evt){
    if(evt.getSource() == thetimer){
      if(blnw){
        thepanel.intY1 = thepanel.intY1 - 15;
        Rectangle2D.Double bar = new Rectangle2D.Double(thepanel.intX1,thepanel.intY1,20,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(!screen.contains(bar.getBounds2D())){
          thepanel.intY1 = thepanel.intY1 + 15;
        }
      }
      if(blns){
        thepanel.intY1 = thepanel.intY1 + 15;
        Rectangle2D.Double bar = new Rectangle2D.Double(thepanel.intX1,thepanel.intY1,20,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(!screen.contains(bar.getBounds2D())){
          thepanel.intY1 = thepanel.intY1 - 15;
        }
      }
      if(blni){
        thepanel.intY3 = thepanel.intY3 - 15;
        Rectangle2D.Double bar = new Rectangle2D.Double(thepanel.intX3,thepanel.intY3,20,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(!screen.contains(bar.getBounds2D())){
          thepanel.intY3 = thepanel.intY3 + 15;
        }
      }
      if(blnk){
        thepanel.intY3 = thepanel.intY3 + 15;
        Rectangle2D.Double bar = new Rectangle2D.Double(thepanel.intX3,thepanel.intY3,20,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(!screen.contains(bar.getBounds2D())){
          thepanel.intY3 = thepanel.intY3 - 15;
        }
      }
      if(blnleft){
        thepanel.intX2 = thepanel.intX2 - 15;
        Rectangle2D.Double bar = new Rectangle2D.Double(thepanel.intX2,thepanel.intY2,100,20);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(!screen.contains(bar.getBounds2D())){
          thepanel.intX2 = thepanel.intX2 + 15;
        }
      }
      if(blnright){
        thepanel.intX2 = thepanel.intX2 + 15;
        Rectangle2D.Double bar = new Rectangle2D.Double(thepanel.intX2,thepanel.intY2,100,20);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(!screen.contains(bar.getBounds2D())){
          thepanel.intX2 = thepanel.intX2 - 15;
        }
      }
      if(blnleftclick){
        thepanel.intX4 = thepanel.intX4 - 15;
        Rectangle2D.Double bar = new Rectangle2D.Double(thepanel.intX4,thepanel.intY4,100,20);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(!screen.contains(bar.getBounds2D())){
          thepanel.intX4 = thepanel.intX4 + 15;
        }
      }
      if(blnrightclick){
        thepanel.intX4 = thepanel.intX4 + 15;
        Rectangle2D.Double bar = new Rectangle2D.Double(thepanel.intX4,thepanel.intY4,100,20);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(!screen.contains(bar.getBounds2D())){
          thepanel.intX4 = thepanel.intX4 - 15;
        }
      }
      if(blnSwitch == true){
        thepanel.intX = thepanel.intX + intXDelta;
        thepanel.intY = thepanel.intY + intYDelta;
      }else if(blnSwitch == false){
        thepanel.intX = 225;
        thepanel.intY = 225;
      }
      Ellipse2D.Double ball = new Ellipse2D.Double(thepanel.intX,thepanel.intY,50,50);
      Rectangle2D.Double bar1 = new Rectangle2D.Double(thepanel.intX1,thepanel.intY1,20,100);
      Rectangle2D.Double bar2 = new Rectangle2D.Double(thepanel.intX2,thepanel.intY2,100,20);
      Rectangle2D.Double bar3 = new Rectangle2D.Double(thepanel.intX3,thepanel.intY3,20,100);
      Rectangle2D.Double bar4 = new Rectangle2D.Double(thepanel.intX4,thepanel.intY4,100,20);
      if(ball.intersects(bar1) == true){
        intXDelta = intXDelta * -1;    
      }else if(ball.intersects(bar2) == true){
        intYDelta = intYDelta * -1;
      }else if(ball.intersects(bar3) == true){
        intXDelta = intXDelta * -1;
      }else if(ball.intersects(bar4) == true){
        intYDelta = intYDelta * -1;
      }
      thepanel.repaint();
    }
  }
  public void keyReleased(KeyEvent evt){
    if(evt.getKeyChar() == 'w'){
      blnw = false;
    }else if(evt.getKeyChar() == 's'){
      blns = false;
    }else if(evt.getKeyChar() == 'i'){
      blni = false;
    }else if(evt.getKeyChar() == 'k'){
      blnk = false;
    }else if(evt.getKeyCode() == 37){
      blnleft = false;
    }else if(evt.getKeyCode() == 39){
      blnright = false;
    }
  }
  public void keyPressed(KeyEvent evt){
    if(evt.getKeyChar() == 'w'){
      blnw = true;
    }else if(evt.getKeyChar() == 's'){
      blns = true;
    }else if(evt.getKeyChar() == 'i'){
      blni = true;
    }else if(evt.getKeyChar() == 'k'){
      blnk = true;
    }else if(evt.getKeyCode() == 37){
      blnleft = true;
    }else if(evt.getKeyCode() == 39){
      blnright = true;
    }
    if(evt.getKeyChar() == ' ' && blnTurn == true){
      blnSwitch = true;
      blnTurn = false;
    }else if(evt.getKeyChar() == ' ' && blnTurn == false){
      blnSwitch = false;
      blnTurn = true;
    }
  }
  public void keyTyped(KeyEvent evt){
    
  }
  public void mouseExited(MouseEvent evt){
  }
  public void mouseEntered(MouseEvent evt){
  }
  public void mouseReleased(MouseEvent evt){
    if(evt.getButton() == 1){
      blnleftclick = false;
    }else if(evt.getButton() == 3){
      blnrightclick = false;
    }
  }
  public void mousePressed(MouseEvent evt){
    if(evt.getButton() == 1){
      blnleftclick = true;
    }else if(evt.getButton() == 3){
      blnrightclick = true;
    }
  }
  public void mouseClicked(MouseEvent evt){

  }
  public void mouseMoved(MouseEvent evt){

  }
  public void mouseDragged(MouseEvent evt){

  }
  
  // Constructor
  public ponggui(){
    thepanel = new animationpanelp();
    thepanel.setLayout(null);
    thepanel.setPreferredSize(new Dimension(500,500));
    thepanel.addMouseListener(this);
    thepanel.addMouseMotionListener(this);
    
    theframe = new JFrame("Pong");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.pack();
    theframe.setVisible(true);
    theframe.addKeyListener(this);
    thetimer = new Timer(1000/60, this);
    thetimer.start();
  }
  public static void main(String[] args){
    new ponggui();
  }
  
}