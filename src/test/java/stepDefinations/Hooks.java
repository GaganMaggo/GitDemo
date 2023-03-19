package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@RegTest")
		public void beforevalidation() {
		System.out.println("hooks befor reg");
		
		
		
	}
	@After("@RegTest")
	public void aftervalidation() {
	System.out.println("hooks after reg");
	
	
		
	}
}


