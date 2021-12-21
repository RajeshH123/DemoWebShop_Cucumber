package step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import siteFactory.SiteFactory;

public class DemoWebShop_Register_TestSteps 
{

	SiteFactory factory;

	public DemoWebShop_Register_TestSteps(SiteFactory factory) 
	{
		this.factory = factory;
	}

	@And("^On Home Page clicks the Register Link$")
	public void clickOnRegisterLink() throws Exception
	{
		factory.DemoWebShop_Register_Actions().clickOnRegisterLink();
	}
	
	@Given("^User enters the data for the registration of the user '(.*)'$")
	public void enterRegisterUserDetails(String data) throws Exception
	{
		factory.DemoWebShop_Register_Actions().registerUser(data);				
	}

	@And("^User clicks on Register button$")
	public void clickOnRegisterButton() throws Exception
	{
		factory.DemoWebShop_Register_Actions().clickOnRegisterBtn();
	}

	@Then("^User clicks on Continue button$")
	public void clickOnContinueButton() throws Exception
	{
		factory.DemoWebShop_Register_Actions().clickOnContinueBtn();
	}
	
	@Then("^User clicks on LogOut button$")
	public void clickOnLogOut_Lnk() throws Exception
	{
		factory.DemoWebShop_Register_Actions().clickOnLogOutlnk();
	}
}
