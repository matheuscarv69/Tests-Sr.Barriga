package pages;

import core.BasePage;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;


public class LoginPage extends BasePage {

    public void accessHomePage() {
        getDriver().get("https://seubarriga.wcaquino.me/login");
    }

    public void setEmail(String email) {
        write("email", email);
    }

    public void setPassword(String password) {
        write("senha", password);
    }

    public void clickButtonEnter() {
        clickButton(By.xpath("//button[.='Entrar']"));
    }


}
