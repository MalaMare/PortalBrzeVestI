package sources;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SourcesPage;


public class TestSources {
    
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static SourcesPage sourcesPage;
    
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
        sourcesPage = dashboardPage.goToSources();
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void testCreateNewSource() {
         sourcesPage.createNewSource();
         
     }
     
     
     
}
