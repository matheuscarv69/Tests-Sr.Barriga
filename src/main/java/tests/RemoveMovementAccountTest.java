package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.MenuPage;
import pages.MovementPage;

public class RemoveMovementAccountTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private MovementPage movementPage = new MovementPage();

    @Test
    public void testRemoveAccountWithMovements() {
        menuPage.accessScreenAccountOptions();

        movementPage.clickButtonRemoveAccount("Conta com movimentacao");

        Assert.assertEquals("Conta em uso na movimentações", movementPage.getMessageFailed());
    }
}
