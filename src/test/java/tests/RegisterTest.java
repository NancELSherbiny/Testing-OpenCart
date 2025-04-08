package tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegisterPage;


public class RegisterTest extends TestBase{

    RegisterPage registerPage;


    @BeforeMethod
    public void init(){
        registerPage = new RegisterPage(driver);
    }

    @Test
    public void Register() throws InterruptedException {
        System.out.println(driver);
        Thread.sleep(10000);
        registerPage.fillUserName("Nancy9");
        Thread.sleep(5000);
        registerPage.fillFirstName("Nancy");
        Thread.sleep(5000);
        registerPage.fillLastName("EL-Sherbiny");
        Thread.sleep(5000);
        registerPage.fillPass("admin123");
        Thread.sleep(5000);
        registerPage.fillEmail("nancy99@gmail.com");
        Thread.sleep(5000);
        registerPage.fillCountry("China");
        Thread.sleep(5000);
        registerPage.clickRegister();
        Thread.sleep(5000);
    }

}
