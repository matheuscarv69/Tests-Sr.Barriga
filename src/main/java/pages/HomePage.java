package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String getBalanceAccount(String account) {
        return getCelula("Conta", account, "Saldo", "tabelaSaldo").getText();

    }

}
