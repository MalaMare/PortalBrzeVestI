
package portals;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PortalsPage;
import pages.DashboardPage;
import pages.LoginPage;


public class TestPortals {
    
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static PortalsPage portalsPage;
    
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login();
    }
    
    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.quitDriver();
    }
    
    @Before
    public void setUp() {
        portalsPage = dashboardPage.goToPortals();
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void testCreateNewPortal() {
        portalsPage.createNewPortal();
     }
}
