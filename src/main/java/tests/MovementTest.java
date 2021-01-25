package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.MenuPage;
import pages.MovementPage;

public class MovementTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    MovementPage movementPage = new MovementPage();
    AccountTest test = new AccountTest();

    @Test
    public void test1CreateMoviment() {
        menuPage.accessScreenCreateMovement();

        movementPage.setType("Despesa");
        movementPage.setDateMoviment("23/01/2021");
        movementPage.setDatePayment("30/01/2021");
        movementPage.setDescription("Movimentação Teste");
        movementPage.setInterested("Fulano");
        movementPage.setValue("150.50");
        movementPage.setAccount("Conta para movimentacoes");
        movementPage.setSituationPaidOut();
        movementPage.clickButtonSave();

        Assert.assertEquals("Movimentação adicionada com sucesso!", movementPage.getMessageSuccess());
    }

    @Test
    public void test2BusinessRuleDateMovement() {
        menuPage.accessScreenCreateMovement();

        movementPage.setType("Receita");
        movementPage.clickButtonSave();

        Assert.assertEquals("Data da Movimentação é obrigatório", movementPage.getMsgRequiredDateMovement());
    }

    @Test
    public void test3BusinessRuleDatePayment() {
        menuPage.accessScreenCreateMovement();

        movementPage.setType("Receita");
        movementPage.setDateMoviment("21/01/2021");
        movementPage.clickButtonSave();

        Assert.assertEquals("Data do pagamento é obrigatório", movementPage.getMsgRequiredDatePayment());
    }

    @Test
    public void test4BusinessRuleDescription() {
        menuPage.accessScreenCreateMovement();

        movementPage.setType("Receita");
        movementPage.setDateMoviment("21/01/2021");
        movementPage.setDatePayment("30/01/2021");
        movementPage.clickButtonSave();

        Assert.assertEquals("Descrição é obrigatório", movementPage.getMsgRequiredDescription());
    }

    @Test
    public void test5BusinessRuleInterested() {
        menuPage.accessScreenCreateMovement();

        movementPage.setType("Receita");
        movementPage.setDateMoviment("21/01/2021");
        movementPage.setDatePayment("30/01/2021");
        movementPage.setDescription("Business Rule Teste");
        movementPage.clickButtonSave();

        Assert.assertEquals("Interessado é obrigatório", movementPage.getMsgRequiredInterested());
    }

    @Test
    public void test6BusinessRuleValue() {
        menuPage.accessScreenCreateMovement();

        movementPage.setType("Receita");
        movementPage.setDateMoviment("21/01/2021");
        movementPage.setDatePayment("30/01/2021");
        movementPage.setDescription("Business Rule Teste");
        movementPage.setInterested("Fulano");
        movementPage.clickButtonSave();

        Assert.assertEquals("Valor é obrigatório", movementPage.getMsgRequiredValue());
    }

    @Test
    public void test7BusinessRuleValueNumber() {
        menuPage.accessScreenCreateMovement();

        movementPage.setType("Receita");
        movementPage.setDateMoviment("21/01/2021");
        movementPage.setDatePayment("30/01/2021");
        movementPage.setDescription("Business Rule Teste");
        movementPage.setInterested("Fulano");
        movementPage.setValue("Teste palavra no valor");
        movementPage.clickButtonSave();

        Assert.assertEquals("Valor deve ser um número", movementPage.getMsgRequiredValueNumber());
    }

    /** Verifica se a data de movimentacao eh maior que a data de pagamento **/
    @Test
    public void test8BusinessRuleFutureMovement(){
        menuPage.accessScreenCreateMovement();

        movementPage.setType("Receita");

        // Data invalida para teste de msg de data invalida
        movementPage.setDateMoviment("21/01/2022");
        movementPage.setDatePayment("30/01/2021");

        movementPage.setDescription("Business Rule Teste");
        movementPage.setInterested("Fulano");
        movementPage.setValue("150.50");
        movementPage.setAccount("Conta para movimentacoes");
        movementPage.clickButtonSave();

        Assert.assertEquals("Data da Movimentação deve ser menor ou igual à data atual", movementPage.getMsgRequiredInvalidFutureMovement());
    }

}
