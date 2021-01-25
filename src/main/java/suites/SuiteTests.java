package suites;

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
})

public class SuiteTests {

    private static LoginPage loginPage = new LoginPage();

    @BeforeClass
    public static void reset() {
        loginPage.accessHomePage();

        loginPage.setEmail("matheus69@gmail.com");
        loginPage.setPassword("1111");
        loginPage.clickButtonEnter();

        loginPage.clickButtonReset();

        killDriver();
    }

}
