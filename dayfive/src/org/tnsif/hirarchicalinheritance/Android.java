package org.tnsif.hirarchicalinheritance;
//base class
public class Android {
	//private dta members
       private String brandName;
       private String slotType;
       
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
       //tostring
	@Override
	public String toString() {
		return "Android [brandName=" + brandName + ", slotType=" + slotType + "]";
	}
	
	//default
	public Android() {
		System.out.println("Android Deatails");
	}
	
	//parameterize constructor
	public Android(String brandName, String slotType) {
		super();
		this.brandName = brandName;
		this.slotType = slotType;
	}
	
}
