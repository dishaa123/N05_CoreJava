package org.tnsif.multilevelinheritance;
//child class 1
public class TeamMember extends TeamLead {
	private int size;
    private int duration;
    
	//parameterize constructor
     public TeamMember(String deptName, String name, int empID, String leadName, int empid2, String projectName,int size,int duration) {
		super(deptName, name, empID, leadName, empid2, projectName);
		this.size=size;
		this.duration=duration;
	}
     
     //getter and setter
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//to string method
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
     
	
}
