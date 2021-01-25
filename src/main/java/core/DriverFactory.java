package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

//    private static WebDriver driver;

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
        @Override
        protected synchronized WebDriver initialValue() {
            return initDriver();
        }
    };

    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        return threadDriver.get();
    }

    public static WebDriver initDriver() {
        WebDriver driver = null;

        if (Properties.TIPO_EXECUCAO == Properties.TypeExecution.LOCAL) {

            switch (Properties.BROWSER) {
                case CHROME:
                    driver = new ChromeDriver();
                    break;
                case FIREFOX:
                    driver = new FirefoxDriver();
                    break;
            }
        }

//        if (Properties.TIPO_EXECUCAO == Properties.TypeExecution.GRID) {
//            DesiredCapabilities cap = null;
//            switch (Properties.BROWSER) {
//                case CHROME:
//                    cap = DesiredCapabilities.chrome();
//                    break;
//                case FIREFOX:
//                    cap = DesiredCapabilities.firefox();
//                    break;
//            }
//        }
//        if (Properties.TIPO_EXECUCAO == Properties.TypeExecution.CLOUD) {
//            DesiredCapabilities cap = null;
//            switch (Properties.BROWSER) {
//                case CHROME:
//                    cap = DesiredCapabilities.chrome();
//                    break;
//                case FIREFOX:
//                    cap = DesiredCapabilities.firefox();
//                    break;
//            }
//
//            try {
//                driver = new RemoteWebDriver(new URL("https://matheuscarv69:05461be1-0491-4f3b-b0a5-fe58cb5ae93f@ondemand.us-west-1.saucelabs.com:443/wd/hub"), cap);
//            } catch (MalformedURLException e) {
//                System.out.println("Erro :  " + e.getMessage());
//            }
//        }

        driver.manage().window().setSize(new Dimension(1200, 765));

        return driver;
    }

    public static void killDriver() {
        WebDriver driver = getDriver();

        if (driver != null) {
            driver.quit();
            driver = null;
        }

        if (threadDriver != null) {
            threadDriver.remove();
        }
    }

}
