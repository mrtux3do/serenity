package FirstApp.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import FirstApp.steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginSuccessful {
	@Managed(uniqueSession = true)
	public WebDriver webDriver;

	@Steps
	LoginSteps user_login;


	@Issue("#LOGIN-1")
	@Test
	public void function_login(){
		String username = "0977932377";
		String password = "minhtuan93";
		user_login.open_home_page();
		user_login.click_button_login();
		user_login.typeUsername(username);
		user_login.typePassWord(password);
		user_login.clickButtonNext();
	}
}
