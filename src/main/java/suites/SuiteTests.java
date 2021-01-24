package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

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

}
