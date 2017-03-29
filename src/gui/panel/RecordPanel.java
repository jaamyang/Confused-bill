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
import gui.listener.RecordListener;
import gui.model.CategoryComboBoxModel;
import newUtil.ColorUtil;
import newUtil.GUIUtil;
import service.CategoryService;

public class RecordPanel extends WorkingPanel{
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
		
        addListener();
	}

	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		cbModel.cs = new CategoryService().list();
		cbCategory.updateUI();
		resetInput();
		tfSpend.grabFocus();
	}

	@Override
	public void addListener() {
		// TODO Auto-generated method stub
		RecordListener listener = new RecordListener();
		buSubmit.addActionListener(listener);
	}
	
	public void resetInput(){
		tfSpend.setText("0");
		tfComment.setText("");
		if(0 != cbModel.cs.size())
			cbCategory.setSelectedIndex(0);
		datepick.setDate(new Date());
	}
	
	public Category getSelectedCategory(){
		return (Category) cbCategory.getSelectedItem();
	}
	
	/*public static void main(String[]args){
		GUIUtil.showPanel(RecordPanel.instance);
	}
	*/

}
