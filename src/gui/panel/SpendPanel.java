package gui.panel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import newUtil.CircleProgressBar;
import newUtil.ColorUtil;
import newUtil.GUIUtil;

public class SpendPanel extends JPanel{
	static {
		GUIUtil.useLNF();
	}
	public static SpendPanel instance = new SpendPanel();
	
	public JLabel laMonthSpend = new JLabel("本月消费");
	public JLabel laTodaySpend = new JLabel("今日消费");
	public JLabel laAvgSpendPerDay = new JLabel("日均消费");
	public JLabel laMonthLeft = new JLabel("本月剩余");
	public JLabel laDayAvgAvailable = new JLabel("日均可用");
	public JLabel laMonthLeftDay = new JLabel("距离月末");
	
	public JLabel vaMonthSpend = new JLabel("￥2300");
	public JLabel vaTodaySpend = new JLabel("￥25");
	public JLabel vaAvgSpendPerDay = new JLabel("￥120");
	public JLabel vaMonthAvailable = new JLabel("￥2084");
	public JLabel vaDayAvgAvailable = new JLabel("￥389");
	public JLabel vaMonthLeftDay = new JLabel("15天");
	
	CircleProgressBar bar;
	
		public SpendPanel(){
			this.setLayout(new BorderLayout());
			bar = new CircleProgressBar();
			bar.setBackground(ColorUtil.blueColor);
			
			GUIUtil.setColor(ColorUtil.grayColor, laMonthSpend, laTodaySpend, laAvgSpendPerDay, laMonthLeft, laDayAvgAvailable, laMonthLeftDay, 
					  vaAvgSpendPerDay, vaMonthAvailable, vaDayAvgAvailable, vaMonthLeftDay);
			GUIUtil.setColor(ColorUtil.blueColor, vaMonthSpend, vaTodaySpend);
			
			vaMonthSpend.setFont(new Font("微软雅黑", Font.BOLD, 23));
			vaTodaySpend.setFont(new Font("微软雅黑", Font.BOLD, 23));
			
			this.add(center(), BorderLayout.CENTER);
			this.add(south(), BorderLayout.SOUTH);
		}
	
		private JPanel center(){
			 JPanel p = new JPanel();
		        p.setLayout(new BorderLayout());
		        p.add(west(), BorderLayout.WEST);
		        p.add(center2(),BorderLayout.CENTER);
		 
		        return p;
		}
		
		private Component center2(){
			return bar;
		}
		
		private Component west(){
			JPanel p = new JPanel();
			p.setLayout(new GridLayout(4,1));
			p.add(laMonthSpend);
			p.add(vaMonthSpend);
			p.add(laTodaySpend);
			p.add(vaTodaySpend);
			return p;
		}
		
		private JPanel south(){
			JPanel p =new JPanel();
			p.setLayout(new GridLayout(2,4));
			
	        p.add(laAvgSpendPerDay);
	        p.add(laMonthLeft);
	        p.add(laDayAvgAvailable);
	        p.add(laMonthLeftDay);
	        p.add(vaAvgSpendPerDay);
	        p.add(vaMonthAvailable);
	        p.add(vaDayAvgAvailable);
	        p.add(vaMonthLeftDay);
	        return p;
		}
		
		public static void main(String[] args) {
	         
	        GUIUtil.showPanel(SpendPanel.instance);
	    }
		
	
	
	
}
