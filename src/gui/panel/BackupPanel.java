package gui.panel;
 
import javax.swing.JButton;
import javax.swing.JPanel;
 
import newUtil.ColorUtil;
import newUtil.GUIUtil;
 
public class BackupPanel extends JPanel {
    static{
        GUIUtil.useLNF();
    }
             
    public static BackupPanel instance = new BackupPanel();
    JButton bBackup =new JButton("±¸·Ý");
 
    public BackupPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bBackup);
        this.add(bBackup);
    }
 
    public static void main(String[] args) {
        GUIUtil.showPanel(BackupPanel.instance);
    }
 
}