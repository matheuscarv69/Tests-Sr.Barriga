package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.MenuPage;
import pages.MonthlySummaryPage;

public class EmptyMonthlySummaryTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    MonthlySummaryPage monthlySummaryPage = new MonthlySummaryPage();

    @Test
    public void isEmptyMonthlySummary() {
        menuPage.accessScreenMonthlySummary();

        monthlySummaryPage.setYear("2016");
        monthlySummaryPage.clickButtonBuscar();

        boolean isEmpty = monthlySummaryPage.isEmptyMonthlySummaryPage();

        Assert.assertTrue(isEmpty);
    }

}
