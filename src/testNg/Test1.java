package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test(priority = 1,invocationCount = 2)
	public void calls() {
		Reporter.log("calls",true);
	}

	@Test(invocationCount = 3,enabled=false)
	public void block() {
		Reporter.log("block",true);
	}

	
	@Test(priority = 1)
	public void chats() {
		Reporter.log("chtas",true);
	}

}
