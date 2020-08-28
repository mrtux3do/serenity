package FirstApp.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;
import net.serenitybdd.core.annotations.findby.FindBy;
import java.util.List;

@DefaultUrl("https://www.chotot.com/")
public class LoginPage extends PageObject{

	By btn_login = By.xpath("//b[contains(text(),'Đăng nhập')]");
	By username = By.xpath("//input[@type='tel']");
	By password = By.xpath("//input[@type='password']");
	By btn_next = By.xpath("//button[contains(text(),'ĐĂNG NHẬP')]");

	public void clickButtonLogin(){
		element(btn_login).click();
	}

	public void typeUsername(String user_name){
		element(username).sendKeys(user_name);
	}

	public void clickButtonNext(){
		element(btn_next).click();
	}

	public void typePassWord(String pass_word){
		element(password).sendKeys(pass_word);
	}
}
