package service;

import java.util.List;

import dao.RecordDAO;
import entity.Record;
import gui.page.SpendPage;
import newUtil.DateUtil;

public class SpendService {
	
	public SpendPage getSpendPage(){
		RecordDAO dao = new RecordDAO();
		List<Record> thisMonthRecords = dao.listThisMonth();
		List<Record> toDayRecords = dao.listToday();
		int thisMonthTotalDay = DateUtil.thisMonthLeftDay();
		
		int monthSpend = 0;
	    int todaySpend = 0;
	    int avgSpendPerDay = 0;
	    int monthAvailable = 0;
	    int dayAvgAvailable = 0;
	    int monthLeftDay = 0;
	    int usagePercentage = 0;
	    
	    //获取本月预算
	    int monthBudget = new ConfigService().getIntBudget();
	    
	    //本月总消费
	    for(Record record : thisMonthRecords) {
	    	monthSpend +=record.getSpend();
	    }
	    
	    //本日总消费
	    for(Record record : toDayRecords) {
	    	todaySpend += record.getSpend();
	    }
	    
	    avgSpendPerDay = monthSpend / thisMonthTotalDay;
	    monthAvailable = monthBudget - monthSpend;
	    monthLeftDay = DateUtil.thisMonthLeftDay();
	    dayAvgAvailable = monthAvailable / monthLeftDay;
	    usagePercentage = monthSpend * 100 / monthBudget;
	    
	    return new SpendPage(monthSpend, todaySpend, avgSpendPerDay, monthAvailable, dayAvgAvailable, 
	    		monthLeftDay,usagePercentage);
	    
	    
		
	}
}
