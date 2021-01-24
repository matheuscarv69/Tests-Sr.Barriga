package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class AccountPage extends BasePage {

    public void setAccountName(String name) {
        write("nome", name);
    }

    public void clickButtonSalvar() {
        clickButton(By.xpath("//button[.='Salvar']"));
    }

    public String getMessageSuccess() {
        return getTextComponent(By.xpath("//div[@class='alert alert-success']"));
    }

    public String getMessageFailed() {
        return getTextComponent(By.xpath("//div[@class='alert alert-danger']"));
    }

    public void clickButtonAlterAccount(String account) {
        getCelula("Conta", account, "Ações", "tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
    }

    public void clickButtonRemoveAccount(String account) {
        getCelula("Conta", account, "Ações", "tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
    }


}
