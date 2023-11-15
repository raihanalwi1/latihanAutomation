package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class loginPage extends PageObject {
    public void openLogin(){
        openAt("/");
    }
    private By inputByUsername(){
        return By.id("user-name");
    }
    private By inputByPassword(){
        return By.id("password");
    }
    private By buttonLogin(){
        return By.id("login-button");
    }
//    private By validateMessage(){
//        return By.
//    }
    private By validateDashboard(){
        return By.xpath("//div[@class='product_label']");
    }
    public void InputUsername(){
        $(inputByUsername()).type("standard_userdd");
    }
    public void InputPassword(){
        $(inputByPassword()).type("secret_sauced");
    }
    public void ClickButtonLogin(){
        $(buttonLogin()).click();
    }
    public void ValidateDashboardHeader(){
        $(validateDashboard()).isDisplayed();
    }

}
