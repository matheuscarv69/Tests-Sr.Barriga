package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.MenuPage;

public class BalanceTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    HomePage homePage = new HomePage();

    @Test
    public void testGetBalanceAccount() {
        menuPage.accessScreenHome();

        Assert.assertEquals("-150.50", homePage.getBalanceAccount("Conta do Teste alterada"));
    }

}
