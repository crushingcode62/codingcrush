import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 /* <applet code="pro11" width=300 height=180> </applet> */

public class pro11 extends Applet implements ItemListener
{
    Choice os;
    String msg = "";

    public void init ()
    {
        os = new Choice ();
        sos.setLayout()    
        // add items to os list 
        os.add ("Red");
        os.add ("Green");
        os.add ("Blue");
        os.add ("Black");
     
        // add choice lists to window 
        add (os);
        
        
        // register to receive item events 
        os.addItemListener (this);
     }

    public void itemStateChanged (ItemEvent ie)
    {
        repaint ();
    }

    // Display current selections. 
    public void paint (Graphics g)
    {
        msg = "Select colour: ";
     
        g.drawString (msg, 6, 140);
    }
}