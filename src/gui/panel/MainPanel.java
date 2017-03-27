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
		
		  GUIUtil.setImageIcon(buSpend, "home.png", "����һ��");
	      GUIUtil.setImageIcon(buRecord, "record.png", "��һ��");
	      GUIUtil.setImageIcon(buCategory, "category2.png", "���ѷ���");
	      GUIUtil.setImageIcon(buReport, "report.png", "�����ѱ���");
	      GUIUtil.setImageIcon(buConfig, "config.png", "����");
	      GUIUtil.setImageIcon(buBackup, "backup.png", "����");
	      GUIUtil.setImageIcon(buRecover, "restore.png", "�ָ�");
		
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
