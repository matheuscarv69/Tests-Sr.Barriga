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
        menuPage.accessScreenAccountOptions();

        contasPage.clickButtonAlterAccount("Conta do Teste");
        contasPage.setAccountName("Conta do Teste alterada");
        contasPage.clickButtonSalvar();

        Assert.assertEquals("Conta alterada com sucesso!", contasPage.getMessageSuccess());
    }

    @Test
    public void testInsertAccountDuplicated() {
        menuPage.accessScreenInsertAccount();

        contasPage.setAccountName("Conta do Teste alterada");
        contasPage.clickButtonSalvar();

        Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.getMessageFailed());
    }

    @Test
    public void testRemoveAccountWithMovements() {
        menuPage.accessScreenAccountOptions();

        contasPage.clickButtonRemoveAccount("Conta do Teste alterada");

        Assert.assertEquals("Conta em uso na movimentações", contasPage.getMessageFailed());
    }

    @Test
    public void testGetBalanceAccount() {
        menuPage.accessScreenHome();

        String balanceExpected = "-150.50";
        String balanceAccount = contasPage.getBalanceAccount("Conta do Teste alterada", balanceExpected);

        Assert.assertEquals(balanceExpected, balanceAccount);
    }
}
