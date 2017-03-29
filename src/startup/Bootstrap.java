package startup;

import java.util.HashMap;

import javax.swing.SwingUtilities;

import gui.frame.Mainframe;
import gui.panel.MainPanel;
import gui.panel.SpendPanel;
import newUtil.GUIUtil;

public class Bootstrap {
	public static void main(String[] args) throws Exception{
		GUIUtil.useLNF();
		
		SwingUtilities.invokeAndWait(new Runnable(){
			@Override
			public void run(){
				Mainframe.instance.setVisible(true);
				MainPanel.instance.workingPanel.show(SpendPanel.instance);
				HashMap m= new HashMap();
			}
			
		});
	}
}
