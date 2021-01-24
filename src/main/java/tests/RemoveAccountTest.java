package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.AccountPage;
import pages.MenuPage;

public class RemoveAccountTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void testRemoveAccount() {
        menuPage.accessScreenAccountOptions();

        accountPage.clickButtonRemoveAccount("Conta do Teste alterada");

        Assert.assertEquals("Conta removida com sucesso!", accountPage.getMessageSuccess());
    }

}
