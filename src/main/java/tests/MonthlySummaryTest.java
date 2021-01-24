package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.MenuPage;
import pages.MonthlySummaryPage;

public class MonthlySummaryTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    MonthlySummaryPage monthlySummaryPage = new MonthlySummaryPage();

    @Test
    public void testRemoveMovement() {
        menuPage.accessScreenMonthlySummary();

        monthlySummaryPage.setMonth("Janeiro");
        monthlySummaryPage.setYear("2021");
        monthlySummaryPage.clickButtonBuscar();

        monthlySummaryPage.clickButtonRemoveMovement("Movimentação Teste");

        Assert.assertEquals("Movimentação removida com sucesso!", monthlySummaryPage.getMessageSuccess());
    }

}
