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
    public void test1RemoveMovement() {
        menuPage.accessScreenMonthlySummary();

        monthlySummaryPage.setMonth("Janeiro");
        monthlySummaryPage.setYear("2021");
        monthlySummaryPage.clickButtonBuscar();

        monthlySummaryPage.clickButtonRemoveMovement("Movimentacao para exclusao");

        Assert.assertEquals("Movimentação removida com sucesso!", monthlySummaryPage.getMessageSuccess());
    }

    @Test
    public void test2CheckTitleMonthlySummary() {
        menuPage.accessScreenMonthlySummary();

        Assert.assertEquals("Seu Barriga - Extrato", monthlySummaryPage.getTitlePage());

        monthlySummaryPage.setYear("2016");
        monthlySummaryPage.clickButtonBuscar();

        boolean isEmpty = monthlySummaryPage.isEmptyMonthlySummaryPage();

        Assert.assertTrue(isEmpty);
    }
}
