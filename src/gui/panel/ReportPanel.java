package gui.panel;
 
import java.awt.BorderLayout;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import entity.Record;
import newUtil.ChartUtil;
import newUtil.GUIUtil;
import service.ReportService;
 
public class ReportPanel extends WorkingPanel {
    static {
        GUIUtil.useLNF();
    }
 
    public static ReportPanel instance = new ReportPanel();
 
    public JLabel l = new JLabel();
 
    public ReportPanel() {
        this.setLayout(new BorderLayout());
        Image i =ChartUtil.getImage(400, 300);
        ImageIcon icon= new ImageIcon(i);
        l.setIcon(icon);
        this.add(l);
    }
 
    /*public static void main(String[] args) {
        GUIUtil.showPanel(ReportPanel.instance);
    }*/

	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		List<Record> rs = new ReportService().listThisMonthRecords();
		Image i = ChartUtil.getImage(rs, 350, 350);
		ImageIcon icon = new ImageIcon(i);
		l.setIcon(icon);
	}

	@Override
	public void addListener() {
		// TODO Auto-generated method stub
		
	}
 
}