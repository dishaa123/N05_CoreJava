package org.tnsif.accessspecifiredemo;
import org.tnsif.accessspecifire.*; //import the package

public class BankExecutor {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.bankName="SBI";
		b.displayPubic();
		
		/*pin number and displayPrivate() method are private ,so we cant access into another class and another package,
		 * only we can access private data members inside the same class*/
        //		b.pinNo;
       //		b.displayPrivate();

		/* accountNo and displayDefault method are default thats why we cannot able to access into another package ,
		 * only we can access within the same package*/
		//b.accounNo;
		//b.displayDefault();
	}

}
