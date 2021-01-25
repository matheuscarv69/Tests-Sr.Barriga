package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.AccountPage;
import pages.MenuPage;

public class AccountTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void test1InsertAccount() {
        menuPage.accessScreenInsertAccount();

        accountPage.setAccountName("Conta do Teste");
        accountPage.clickButtonSalvar();

        Assert.assertEquals("Conta adicionada com sucesso!", accountPage.getMessageSuccess());
    }

    @Test
    public void test2AlterAccount() {
        menuPage.accessScreenAccountOptions();

        accountPage.clickButtonAlterAccount("Conta para alterar");
        accountPage.setAccountName("Conta alterada");
        accountPage.clickButtonSalvar();

        Assert.assertEquals("Conta alterada com sucesso!", accountPage.getMessageSuccess());
    }

    @Test
    public void test3InsertAccountDuplicated() {
        menuPage.accessScreenInsertAccount();

        accountPage.setAccountName("Conta mesmo nome");
        accountPage.clickButtonSalvar();

        Assert.assertEquals("Já existe uma conta com esse nome!", accountPage.getMessageFailed());
    }


}
