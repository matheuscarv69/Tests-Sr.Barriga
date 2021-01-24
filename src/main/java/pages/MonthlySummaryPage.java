package pages;

import core.BasePage;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;

import java.util.List;

import static core.DriverFactory.getDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MonthlySummaryPage extends BasePage {

    public void setMonth(String month) {
        selectComboBoxOption("mes", month);
    }

    public void setYear(String year) {
        selectComboBoxOption("ano", year);
    }

    public void clickButtonBuscar() {
        clickButton(By.xpath("//form//input[@value='Buscar']"));
    }

    public void clickButtonRemoveMovement(String value) {
        getCelula("Descrição", value, "Ações", "tabelaExtrato")
                .findElement(By.xpath("//div//table//td//span[@class='glyphicon glyphicon-remove-circle']")).click();
    }

    public String getMessageSuccess() {
        return getTextComponent(By.xpath("//div[@class='alert alert-success'][.='Movimentação removida com sucesso!']"));
    }

    public String getTitlePage() {
        return getDriver().getTitle();
    }

    public boolean isEmptyMonthlySummaryPage() {
        List<WebElement> list = getDriver().findElements(By.xpath("//table[@id='tabelaExtrato']/tbody/tr"));

        return list.isEmpty();
    }

}
