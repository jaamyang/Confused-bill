package entity;

import java.util.Date;

public class Record {
	public int spend;
	public int id;
	public int catid;
	public String comment;
	public Date date;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getcatid(){
		return catid;
	}
	
	public void setCatid(int catid){
		this.catid = catid;
	}
	
	public String getComment(){
		return comment;
	}
	
	public void setComment(String comment){
		this.comment = comment;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public int getSpend(){
		return spend;
	}
	
	public void setSpend(int spend){
		this.spend = spend;
	}
}
