package newUtil;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JPanel;

import gui.panel.WorkingPanel;

public class CenterPanel extends JPanel{
	
	private double rate;   //拉伸比例，1为占满
	private JComponent c;  //其中的组件
	private boolean isstrech;  //是否拉伸
	
	public CenterPanel(double rate, boolean isstrech) {
		super();
		this.setLayout(null);
		this.rate = rate;
		this.isstrech = isstrech;
	}
	
	public CenterPanel(double rate){
		this(rate,true);
	}
	
	public void repaint(){
		if(c != null){
			Dimension containerSize = this.getSize();
			Dimension componentSize = c.getPreferredSize();
			if(isstrech)
				c.setSize((int)(containerSize.width*rate),(int)(containerSize.height*rate));
			else
				c.setSize(componentSize);
			c.setLocation(containerSize.width/2-c.getSize().width/2,containerSize.height/2-c.getSize().height/2);
			super.repaint();
		}
	}
	public void show(JComponent p){
		this.c = p;
		Component[] cs = getComponents();
		for (Component c:cs){
			remove(c);
		}
		add(p);
		
		if(p instanceof WorkingPanel)
			((WorkingPanel)p).updateData();
		this.updateUI();
	}
	/*public static void main(String []artgs){
		JFrame f=new JFrame();
		f.setSize(200,200);
		f.setLocationRelativeTo(null);
		CenterPanel cp=new CenterPanel(0.3,true);
		f.setContentPane(cp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		JButton b = new JButton("缩放");
		cp.show(b);
	}*/
	
	

}
