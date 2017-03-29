package gui.panel;
 
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.listener.ConfigListener;
import newUtil.ColorUtil;
import newUtil.GUIUtil;
import service.ConfigService;
 
public class ConfigPanel extends WorkingPanel{
    static{
        GUIUtil.useLNF();
    }
    public static ConfigPanel instance = new ConfigPanel();
 
    JLabel lBudget = new JLabel("����Ԥ��(��)");
    public JTextField tfBudget = new JTextField("0");
     
    JLabel lMysql = new JLabel("Mysql��װĿ¼");
    public JTextField tfMysqlPath = new JTextField("");
 
    JButton buSubmit = new JButton("����");
 
    public ConfigPanel() {
        GUIUtil.setColor(ColorUtil.grayColor, lBudget,lMysql);
        GUIUtil.setColor(ColorUtil.blueColor, buSubmit);
         
        JPanel pInput =new JPanel();
        JPanel pSubmit = new JPanel();
        int gap =40;
        pInput.setLayout(new GridLayout(4,1,gap,gap));
         
        pInput.add(lBudget);
        pInput.add(tfBudget);
        pInput.add(lMysql);
        pInput.add(tfMysqlPath);
        this.setLayout(new BorderLayout());
        this.add(pInput,BorderLayout.NORTH);
         
        pSubmit.add(buSubmit);
        this.add(pSubmit,BorderLayout.CENTER);
         
        addListener();
    }
 
    public static void main(String[] args) {
        GUIUtil.showPanel(ConfigPanel.instance);
    }
     
    public void addListener(){
    	ConfigListener l = new ConfigListener();
    	buSubmit.addActionListener(l);
    	
    }
    
    public void updateData(){
    	String budget = new ConfigService().get(ConfigService.budget);
    	String mysqlPath = new ConfigService().get(ConfigService.mysqlPath);
    	tfBudget.setText(budget);
    	tfMysqlPath.setText(mysqlPath);
    	tfBudget.grabFocus();
    }
}