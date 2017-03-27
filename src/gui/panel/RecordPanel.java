package gui.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdesktop.swingx.JXDatePicker;

import entity.Category;
import gui.model.CategoryComboBoxModel;
import newUtil.ColorUtil;
import newUtil.GUIUtil;

public class RecordPanel extends JPanel{
	static{
		GUIUtil.useLNF();
	}
	public static RecordPanel instance = new RecordPanel();
	
	JLabel laSpend = new JLabel("花费(￥)");
	JLabel laCategory = new JLabel("分类");
	JLabel laComment = new JLabel("备注");
	JLabel laDate = new JLabel("日期");
	
	public JTextField tfSpend = new JTextField("0");
	
	public CategoryComboBoxModel cbModel = new CategoryComboBoxModel();
	public JComboBox<Category> cbCategory = new JComboBox<>(cbModel);
	public JTextField tfComment = new JTextField();
	public JXDatePicker datepick = new JXDatePicker(new Date());
	
	JButton buSubmit = new JButton ("记一笔");
	
	public RecordPanel(){
		GUIUtil.setColor(ColorUtil.grayColor, laSpend, laCategory, laComment, laDate);
		GUIUtil.setColor(ColorUtil.blueColor, buSubmit);
		JPanel pInput = new JPanel();
		JPanel pSubmit = new JPanel();
		int gap = 40;
		pInput.setLayout(new GridLayout(4,2,gap,gap));
		
		pInput.add(laSpend);
        pInput.add(tfSpend);
        pInput.add(laCategory);
        pInput.add(cbCategory);
        pInput.add(laComment);
        pInput.add(tfComment);
        pInput.add(laDate);
        pInput.add(datepick);
         
        pSubmit.add(buSubmit);
         
        this.setLayout(new BorderLayout());
        this.add(pInput,BorderLayout.NORTH);
        this.add(pSubmit,BorderLayout.CENTER);
		
	}

}
