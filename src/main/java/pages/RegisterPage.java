package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends PageBase{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    By userName= By.id("input-username");
    By firstName =By.id("input-firstname");
    By lastName =By.id("input-lastname");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By country = By.id("input-country");
    By registerButton = By.xpath("//*[@class=\"btn btn-primary btn-lg hidden-xs\"]");


    public void fillUserName(String userName){

        sendKeys(this.userName, userName);
    }
    public void fillFirstName(String firstname){

        sendKeys(firstName,firstname);
    }
    public void fillLastName(String lastname){

        sendKeys(lastName,lastname);
    }
    public void fillEmail(String email){

        sendKeys(this.email,email);
    }
    public void fillPass(String pass){

        sendKeys(this.password, pass);
    }
    public void fillCountry(String country){
        selectFromDropDownList(this.country,country);
    }
    public void clickRegister(){
        clickOnElement(registerButton);
    }

}
