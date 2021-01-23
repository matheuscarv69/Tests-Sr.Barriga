package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.ContasPage;
import pages.MenuPage;

public class ContaTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    ContasPage contasPage = new ContasPage();

    @Test
    public void testInsertAccount() {
        menuPage.accessScreenInsertAccount();

        contasPage.setAccountName("Conta do Teste");
        contasPage.clickButtonSalvar();

        Assert.assertEquals("Conta adicionada com sucesso!", contasPage.getMessageSuccess());
    }

    @Test
    public void testAlterAccount() {
        menuPage.accessScreenAlterAccount();

        contasPage.clickButtonAlterConta("Conta do Teste");
        contasPage.setAccountName("Conta do Teste alterada");
        contasPage.clickButtonSalvar();

        Assert.assertEquals("Conta alterada com sucesso!", contasPage.getMessageSuccess());

    }

}
