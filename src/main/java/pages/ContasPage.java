package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class ContasPage extends BasePage {

    public void setAccountName(String name) {
        write("nome", name);
    }

    public void clickButtonSalvar() {
        clickButton(By.xpath("//button[.='Salvar']"));
    }

    public String getMessageSuccess() {
        return getTextComponent(By.xpath("//div[@class='alert alert-success']"));
    }

    public void clickButtonAlterConta(String conta) {
        getCelula("Conta", conta,"Ações","tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
    }


}
