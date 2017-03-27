package gui.frame;
 
import javax.swing.JFrame;
 
import gui.panel.MainPanel;
import newUtil.GUIUtil;
 
public class Mainframe extends JFrame{
    public static Mainframe instance = new Mainframe();
     
    private Mainframe(){
        this.setSize(450,400);
        this.setTitle("ºýÍ¿ÕË±¾");
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args) {
        instance.setVisible(true);
    }
     
}