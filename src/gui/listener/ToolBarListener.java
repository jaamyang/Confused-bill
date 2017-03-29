package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.panel.BackupPanel;
import gui.panel.CategoryPanel;
import gui.panel.ConfigPanel;
import gui.panel.MainPanel;
import gui.panel.RecordPanel;
import gui.panel.RecoverPanel;
import gui.panel.ReportPanel;
import gui.panel.SpendPanel;

public class ToolBarListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		MainPanel p = MainPanel.instance;
		JButton b = (JButton)e.getSource();
		if(b == p.buReport)
			p.workingPanel.show(ReportPanel.instance);
		if(b == p.buCategory)
			p.workingPanel.show(CategoryPanel.instance);
		if(b == p.buBackup)
			p.workingPanel.show(BackupPanel.instance);
		if(b == p.buConfig)
			p.workingPanel.show(ConfigPanel.instance);
		if(b == p.buRecover)
			p.workingPanel.show(RecoverPanel.instance);
		if(b == p.buSpend)
			p.workingPanel.show(SpendPanel.instance);
		if(b == p.buRecord)
			p.workingPanel.show(RecordPanel.instance);
	}	
}
