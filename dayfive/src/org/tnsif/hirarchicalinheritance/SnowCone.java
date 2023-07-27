package org.tnsif.hirarchicalinheritance;
//child class2
public class SnowCone extends Android{
	// private data members
    private int version;

    //getter and setter
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	//tostring
	    	@Override
			public String toString() {
				return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
			}
	//parameterize constructor
			public SnowCone(String brandName, String slotType,int version) {
				super(brandName, slotType);
			   this.version=version;
			}
			
			
}
