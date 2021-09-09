import com.maxsoft.testngtestresultsanalyzer.TestAnalyzeReportListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.DriverFactory;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static com.maxsoft.testngtestresultsanalyzer.DriverHolder.getDriver;
import static com.maxsoft.testngtestresultsanalyzer.DriverHolder.setDriver;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Project Name    : selenide-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 9/9/2021
 * Time            : 8:47 AM
 * Description     : This is the Base Test class for all the test classes
 **/

@Listeners(TestAnalyzeReportListener.class)
public class BaseTest {

    @BeforeMethod
    public void before() {
        DriverFactory.setDriver();
        setDriver(DriverFactory.getDriver());
        setWebDriver(getDriver());
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        open("https://duckduckgo.com");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
