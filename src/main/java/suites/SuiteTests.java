package suites;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pages.LoginPage;
import tests.*;

import static core.DriverFactory.killDriver;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AccountTest.class,
        MovementTest.class,
        RemoveMovementAccountTest.class,
        BalanceTest.class,
        MonthlySummaryTest.class,
        RemoveAccountTest.class
})

public class SuiteTests {


    private static LoginPage loginPage = new LoginPage();
    /**
     * Aqui nesse @BeforeClass esta o metodo de login da pagina
     * foi colocado aqui para acelerar a execucao dos testes, dessa forma,
     * os testes nao voltam a tela de login, isso so eh feito uma vez durante
     * a execucao da suite.
     *
     * Tambem visando acelerar a execucao dos testes, a propriedade CLOSE_BROWSER
     * da classe Properties esta setada como false, assim o driver nao ira
     * fechar apos finalizar um teste. BaseTest -> finalizerWebDriver
     * **/
    @BeforeClass
    public static void initializer() {
        loginPage.accessHomePage();

        loginPage.setEmail("matheus69@gmail.com");
        loginPage.setPassword("1111");

        loginPage.clickButtonEnter();
    }

    @AfterClass
    public static void finalizer() {
        killDriver();
    }

}
