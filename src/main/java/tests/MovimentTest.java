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

    @Test
    public void testBusinessRuleDateMovement() {
        menuPage.accessScreenCreateMovement();

        movimentPage.setType("Receita");
        movimentPage.clickButtonSave();

        Assert.assertEquals("Data da Movimentação é obrigatório", movimentPage.getMsgRequiredDateMovement());
    }

    @Test
    public void testBusinessRuleDatePayment() {
        menuPage.accessScreenCreateMovement();

        movimentPage.setType("Receita");
        movimentPage.setDateMoviment("21/01/2021");
        movimentPage.clickButtonSave();

        Assert.assertEquals("Data do pagamento é obrigatório", movimentPage.getMsgRequiredDatePayment());
    }

    @Test
    public void testBusinessRuleDescription() {
        menuPage.accessScreenCreateMovement();

        movimentPage.setType("Receita");
        movimentPage.setDateMoviment("21/01/2021");
        movimentPage.setDatePayment("30/01/2021");
        movimentPage.clickButtonSave();

        Assert.assertEquals("Descrição é obrigatório", movimentPage.getMsgRequiredDescription());
    }


}
