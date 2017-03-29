package gui.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import entity.Category;
import service.CategoryService;

public class CategoryTableModel extends AbstractTableModel{
	
	String[] columnNames = new String[]{"分类名称","消费次数"};
	
	public List<Category> cs = new CategoryService().list();
	
	public int getRowCount(){
		return cs.size();
	}
	
	public int getColumnCount(){
		return columnNames.length;
	}
	
	public String getColumnName(int columnIndex){
		return columnNames[columnIndex];
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Category h = cs.get(rowIndex);
		if(columnIndex == 0)
			return h.name;
		if(columnIndex == 1)
			return h.recordNumber;
		
		return null;
	}
}
