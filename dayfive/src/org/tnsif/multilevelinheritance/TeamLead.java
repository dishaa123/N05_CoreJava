package org.tnsif.multilevelinheritance;
//child class2
//parent class2
public class TeamLead extends Manager {
	
	//private data members
      private String leadName;
      private int empid;
      private String projectName;
     
      //getters and setters method
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpID() {
		return empid;
	}
	public void setEmpID(int empid) {
		this.empid = empid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	//tostring method 
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empID=" + empid + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	//parameterize constructor
	public TeamLead(String deptName, String name, int empID,String leadName,int empid,String projectName) {
		super(deptName, name, empid);
		this.empid=empid;
		this.leadName=leadName;
		this.projectName=projectName;
	}
	
	
	
      
      
}
