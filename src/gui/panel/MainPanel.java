package gui.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import newUtil.CenterPanel;
import newUtil.GUIUtil;

public class MainPanel extends JPanel {
	static {
		GUIUtil.useLNF();
	}
	
	public static MainPanel instance = new MainPanel();
	public JToolBar tb = new JToolBar();
	public JButton buSpend = new JButton();
	public JButton buRecord = new JButton();
	public JButton buCategory = new JButton();
	public JButton buReport = new JButton();
	public JButton buConfig = new JButton();
	public JButton buBackup = new JButton();
	public JButton buRecover = new JButton();
	
	public CenterPanel workingPanel;
	
	private MainPanel(){
		
		  GUIUtil.setImageIcon(buSpend, "home.png", "消费一览");
	      GUIUtil.setImageIcon(buRecord, "record.png", "记一笔");
	      GUIUtil.setImageIcon(buCategory, "category2.png", "消费分类");
	      GUIUtil.setImageIcon(buReport, "report.png", "月消费报表");
	      GUIUtil.setImageIcon(buConfig, "config.png", "设置");
	      GUIUtil.setImageIcon(buBackup, "backup.png", "备份");
	      GUIUtil.setImageIcon(buRecover, "restore.png", "恢复");
		
		tb.add(buSpend);
		tb.add(buRecord);
		tb.add(buCategory);
		tb.add(buReport);
		tb.add(buConfig);
		tb.add(buBackup);
		tb.add(buRecover);
		tb.setVisible(true);
		
		workingPanel = new CenterPanel(0.8);
		
		setLayout(new BorderLayout());
		add(tb,BorderLayout.NORTH);
		add(workingPanel, BorderLayout.CENTER);
		
	}
	
	
}
