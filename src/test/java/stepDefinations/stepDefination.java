package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("navigated to login url");
	}
		@Given("^validate the browser$")
		
	    public void validate_the_browser()  {
			System.out.println("validate the browser");
	    }

	    @When("^broser is trigerred$")
	    public void broser_is_trigerred() {
	    	System.out.println("broser is trigerred");
	    	System.out.println("broser successfully trigerred");
	   }

	    @Then("^Check browser is started$")
	    public void check_browser_is_started() {
	    	System.out.println("Check browser is started");
	    	System.out.println(" browser is started");
	    }

		
	
	/*@When("^User login into application with following details$")
    public void user_login_into_application_with_following_details(DataTable data) {
		List<List<String>> obj = data.asLists();
    	System.out.println("logged in successfully"+":"+ obj.get(0).get(0));
    	System.out.println("logged in successfully"+":"+ obj.get(1).get(0));
    	
    }*/
    @When("^User login into application with username (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password(String username, String password) {
    	System.out.println("logged in successfully"+":"+ username);
    }
    @Then("^Home page is populated$")
    public void Home_page_is_populated(){
    	System.out.println("validated home page");
    	
    }
    @And("^Cards are displayed$")
    public void cards_are_displayed() {
    	System.out.println("validated cards");
    	
    }
}
