package step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import siteFactory.SiteFactory;

public class DemoWebShop_Login_TestSteps 
{

	SiteFactory factory;

	public DemoWebShop_Login_TestSteps(SiteFactory factory) 
	{
		this.factory = factory;
	}

	@Given("^User opens browzer And enters the URL$")
	public void initiateBrowzer() throws Exception
	{
		factory.Commonfunction().initiateBrowser();
	}

	@And("^On Home Page clicks the LogIn Link$")
	public void clickOnLoginLink() throws Exception
	{
		factory.DemoWebShop_Login_Actions().clickOnLoginLink();
	}

	@Given("^User enters the credentials '(.*)'$")
	public void enterCredentials(String credentials) throws Exception
	{
		factory.DemoWebShop_Login_Actions().Login(credentials);				
	}

	@And("^User clicks on LogIn button$")
	public void clickOnLoginButton() throws Exception
	{
		factory.DemoWebShop_Login_Actions().clickOnLoginBtn();
	}

}
