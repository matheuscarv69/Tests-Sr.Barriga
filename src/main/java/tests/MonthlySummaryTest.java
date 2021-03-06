package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.MenuPage;
import pages.MonthlySummaryPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MonthlySummaryTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    MonthlySummaryPage monthlySummaryPage = new MonthlySummaryPage();

    @Test
    public void test1RemoveMovement() {
        menuPage.accessScreenMonthlySummary();

        monthlySummaryPage.setMonth("Janeiro");
        monthlySummaryPage.setYear("2021");
        monthlySummaryPage.clickButtonBuscar();

        monthlySummaryPage.clickButtonRemoveMovement("Movimentação Teste");

        Assert.assertEquals("Movimentação removida com sucesso!", monthlySummaryPage.getMessageSuccess());
    }

    @Test
    public void test2CheckTitleMonthlySummary() {
        menuPage.accessScreenMonthlySummary();

        Assert.assertEquals("Seu Barriga - Extrato", monthlySummaryPage.getTitlePage());
    }
}
