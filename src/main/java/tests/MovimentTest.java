package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.MenuPage;
import pages.MovimentPage;

public class MovimentTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    MovimentPage movimentPage = new MovimentPage();

    @Test
    public void testCreateMoviment() {
        menuPage.accessScreenCreateMovement();

        movimentPage.setType("Despesa");
        movimentPage.setDateMoviment("23/01/2021");
        movimentPage.setDatePayment("30/01/2021");
        movimentPage.setDescription("Movimentação Teste");
        movimentPage.setInterested("Fulano");
        movimentPage.setValue("150.50");
        movimentPage.setAccount("Conta do Teste alterada");
        movimentPage.setSituationPaidOut();
        movimentPage.clickButtonSave();

        Assert.assertEquals("Movimentação adicionada com sucesso!", movimentPage.getMessageSuccess());
    }


}
