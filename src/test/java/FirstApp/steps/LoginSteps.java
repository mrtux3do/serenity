package FirstApp.steps;

import FirstApp.pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps {
	LoginPage login_page;

	@Step
	public void open_home_page(){
		login_page.open();
	}

	@Step
	public void click_button_login(){
		login_page.clickButtonLogin();
	}

	@Step
	public void typeUsername(String username){
		login_page.typeUsername(username);
	}

	@Step
	public void clickButtonNext(){
		login_page.clickButtonNext();
	}

	@Step
	public void typePassWord(String password){
		login_page.typePassWord(password);
	}
}

