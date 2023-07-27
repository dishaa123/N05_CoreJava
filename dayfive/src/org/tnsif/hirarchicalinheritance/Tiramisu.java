package org.tnsif.hirarchicalinheritance;
//child class1
public class Tiramisu extends Android{
	// private data menbers
        private int version;

		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}
//tostring
		@Override
		public String toString() {
			return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
		}
//parameterize
		public Tiramisu(String brandName, String slotType,int version) {
			super(brandName, slotType);
			this.version=version;
		}
     
}
