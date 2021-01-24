package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.ContasPage;
import pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    ContasPage contasPage = new ContasPage();

    @Test
    public void test1InsertAccount() {
        menuPage.accessScreenInsertAccount();

        contasPage.setAccountName("Conta do Teste");
        contasPage.clickButtonSalvar();

        Assert.assertEquals("Conta adicionada com sucesso!", contasPage.getMessageSuccess());
    }

    @Test
    public void test2AlterAccount() {
        menuPage.accessScreenAccountOptions();

        contasPage.clickButtonAlterAccount("Conta do Teste");
        contasPage.setAccountName("Conta do Teste alterada");
        contasPage.clickButtonSalvar();

        Assert.assertEquals("Conta alterada com sucesso!", contasPage.getMessageSuccess());
    }

    @Test
    public void test3InsertAccountDuplicated() {
        menuPage.accessScreenInsertAccount();

        contasPage.setAccountName("Conta do Teste alterada");
        contasPage.clickButtonSalvar();

        Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.getMessageFailed());
    }




}
